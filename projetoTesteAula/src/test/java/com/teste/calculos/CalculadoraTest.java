package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName(" Teste 5 + 5 = 10 ")
	void testSoma() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.soma(valor1, valor2);
		//Assert
		assertEquals(esperado,resultado, " 5 + 5 não gerou o valor 10");
	}
	@Test
	@DisplayName(" Teste 4 - 2 = 2 ")
	void testSubt() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 4D;
		double valor2 = 2D;
		double esperado = 2D;
		
		//Act
		double resultado = calc.subt(valor1, valor2);
		//Assert
		assertEquals(esperado,resultado, " 4 - 2 não gerou o valor 2");
	}
	@Test
	@DisplayName(" Teste 3 * 6 = 18 ")
	void testMult() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 3D;
		double valor2 = 6D;
		double esperado = 18D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		//Assert
		assertEquals(esperado,resultado, " 3 * 6 não gerou o valor 18");
	}
	@Test
	@DisplayName(" Teste 6 / 2 = 3 ")
	void testDiv() {
		// Arrange
		Calculadora calc = new Calculadora();
		double valor1 = 6D;
		double valor2 = 2D;
		double esperado = 3D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		//Assert
		assertEquals(esperado,resultado, " 6 / 2 não gerou o valor 3");
	}

}
