import static org.junit.Assert.*;

import org.junit.Test;

import Prueba.Prueba;

public class PruebaTest {

	@Test
	public void testGetNombre() {
		Prueba p = new Prueba("Thomas", "SINAN");
		assertEquals("Thomas", p.getNombre());
	}
	
	@Test
	public void testGetAppellido() {
		Prueba p = new Prueba("Thomas", "SINAN");
		assertEquals("SINAN", p.getAppellido());
	}
	
	@Test
	public void testGetNombreCompleto() {
		Prueba p = new Prueba("Thomas", "SINAN");
		assertEquals("Thomas SINAN", p.getNombreCompleto());
	}

}
