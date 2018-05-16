package paqueteTest;

import static org.junit.Assert.*;

import org.junit.Test;

import paqueteClases.Disco;

public class TestDisco {

	@Test
	public void testMostrarRadioInterno() {
		Disco miDisco = new Disco(10.1,0.0);
		Double valor = 10.1;
		assertEquals(valor,miDisco.getRadioInterior());
	}
	@Test
	public void testMontrarRadioExterno() {
		Disco miDisco = new Disco(0.0,10.5);
		Double valor = 10.5;
		assertEquals(valor,miDisco.getRadioExterior());
	}
	@Test
	public void testCalcularPerimetroInterior() {
		Disco miDisco = new Disco(10.0,5.0);
		Double valorEsperado;
		valorEsperado = miDisco.calcularPerimetroInterior();
		Double valorObtenido = 2* Math.PI *10.0;
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test 
	public void testCalcularPerimetroExterior() {
		Disco miDisco = new Disco(0.0,5.0);
		Double valorEsperado;
		valorEsperado = miDisco.calcularPerimetroExterior();
		Double valorObtenido = 2* Math.PI * 5.0;
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void testCalcularSuperficie() {
		Disco miDisco = new Disco(10.0,10.0);
		Double valorInterior;
		Double valorExterior;
		Double superficie;
		valorInterior = 10.0;
		valorExterior = 10.0;
		superficie = Math.PI*(Math.pow(valorExterior,2) - Math.pow(valorInterior,2));
		assertEquals(superficie,miDisco.calcularSuperficie());
	}
}
