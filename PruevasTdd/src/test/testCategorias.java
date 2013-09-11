package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class testCategorias {

	Categorias_ts pruevas;
	
	@Before
	public void setUp() throws Exception {
		pruevas = new Categorias_ts();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		  // prueva para crear una categoria con nombre  Gastos casa
	    boolean resultado = pruevas.funcion_agregar_nombre("casa");
        assertEquals(true,resultado);
	}

	@Test
	public void testnombrevacio() {
		  // prueva para crear una categoria con nombre vacio
	    boolean resultado = pruevas.funcion_agregar_nombre("");
        assertEquals(false,resultado);
	}
	
	@Test
	public void testnombreexiste() {
		  // prueva para crear una categoria con un nombre que ya exista
	    boolean resultado = pruevas.funcion_agregar_nombre("casa");
        assertEquals(false,resultado);
	}
	
	@Test
	public void testnombrenumerico() {
		  // prueva para crear una categoria con un nombre numerico
	    boolean resultado = pruevas.funcion_agregar_nombre("1112123");
        assertEquals(false,resultado);
	}

	@Test
	public void test2() {
		  // prueva para crear una categoria con nombre  Gastos educacion
	    boolean resultado = pruevas.funcion_agregar_nombre("educacio");
        assertEquals(true,resultado);
	}

}
