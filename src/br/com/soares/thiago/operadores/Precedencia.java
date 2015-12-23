package br.com.soares.thiago.operadores;

public class Precedencia {


	// . [] ()
	// (tipo) Máxima precedência: separador, indexação, parâmetros, cast
	
	// + - ~ ! ++ -- 
	// Operador unário: positivo, negativo, negação (inversão bit a bit), não (lógico), incremento, decremento
	
	// * / % 
	// Multiplicação, divisão e módulo (inteiros)
	
	// + - 
	// Adição, subtração
	
	// << >> >>> 
	// Translação (bit a bit) à esquerda, direita sinalizada, e direita não sinalizada (o bit de sinal será 0)
	
	// < <= >= < 
	// Operador relacional: menor, menor ou igual, maior ou igual, maior
	
	// == != 
	// Igualdade: igual, diferente
	
	// & 
	// Operador lógico e bit a bit
	
	// ^ 
	//Ou exclusivo (xor) bit a bit
	
	// | 
	// Operador lógico ou bit a bit
	
	// && 
	// Operador lógico e condicional
	
	// || 
	// Operador lógico ou condicional
	
	// ?: 
	// Condicional: if-then-else compacto
	
	// = op= 
	// Atribuição
	
	
	float x = 3.5f % 32;
	double y = 2.3 % 2;
	
	double z = x % 3;
	double f = y % 3;
}
