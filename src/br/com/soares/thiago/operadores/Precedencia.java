package br.com.soares.thiago.operadores;

public class Precedencia {


	// . [] ()
	// (tipo) M�xima preced�ncia: separador, indexa��o, par�metros, cast
	
	// + - ~ ! ++ -- 
	// Operador un�rio: positivo, negativo, nega��o (invers�o bit a bit), n�o (l�gico), incremento, decremento
	
	// * / % 
	// Multiplica��o, divis�o e m�dulo (inteiros)
	
	// + - 
	// Adi��o, subtra��o
	
	// << >> >>> 
	// Transla��o (bit a bit) � esquerda, direita sinalizada, e direita n�o sinalizada (o bit de sinal ser� 0)
	
	// < <= >= < 
	// Operador relacional: menor, menor ou igual, maior ou igual, maior
	
	// == != 
	// Igualdade: igual, diferente
	
	// & 
	// Operador l�gico e bit a bit
	
	// ^ 
	//Ou exclusivo (xor) bit a bit
	
	// | 
	// Operador l�gico ou bit a bit
	
	// && 
	// Operador l�gico e condicional
	
	// || 
	// Operador l�gico ou condicional
	
	// ?: 
	// Condicional: if-then-else compacto
	
	// = op= 
	// Atribui��o
	
	
	float x = 3.5f % 32;
	double y = 2.3 % 2;
	
	double z = x % 3;
	double f = y % 3;
}
