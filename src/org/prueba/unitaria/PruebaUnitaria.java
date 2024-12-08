package org.prueba.unitaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.servicio.junit.ServicioJunit;


/*
 * REGLAS DE PRUEBAS UNITARIAS
 * 
 * 1.- HEREDAR DE LA CLASE TESTCASE
 * CREAR EL METODO TEST
 * TODOS LOS METODOS DEBEN LLEVAR LA ANOTACION @Test
 * 4.- EL NOMBRE DE LOS METODOS DEBE COMENZAR CON testNameMethod
 * 
 */

public class PruebaUnitaria {
	
	private ServicioJunit servicioJunit;

	@Test
	void test() {
		servicioJunit= new ServicioJunit();
	}
	
	@Test
	public void testSalarioBono() {
		test();
		assertTrue(servicioJunit.SalarioBono(20000.0, 5000.0)==25000.0);
	}
	
	@Test
	public void testSalarioPrestamo() {
		test();
		assertEquals(15000.0, servicioJunit.salarioPrestamo(20000.0, 5000.0));
	}
	
	@Test
	public void testSalarioMes() {
		test();
		assertEquals(100000.0, servicioJunit.salarioPormes(20000.0, 5));
	}

}
