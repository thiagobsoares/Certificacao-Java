package br.com.soares.thiago.operadores;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class One {
	// Which of the following statements are true?
	//
	// FALSE - The modulus operator % can only be used with integer operands.
	float f = 10.5f % 10;

	// TRUE - & can have integral as well as boolean operands.
	int i = 1 & 3;
	boolean b = true;

	// TRUE - The arithmetic operators *, / and % have the same level of
	// precedence.
	// Classe Precedencia

	// FALSE - && can have integer as well as boolean operands.
	// int i2 = 1 && 2;

	// FALSE - ~ can have integer as well as boolean operands.
	// boolean b1 = true; Não compila
	// int i = ~1; Inverte todos os bit, diferente do - (que inverte e depois
	// soma + 1),
	// ~ inverte e não soma nada.

	/*
	 * Note : integral types means byte, short, int, long, and char
	 * 
	 * 
	 * As per Section 4.1 of JLS 8 -
	 * 
	 * The integral types are byte, short, int, and long, whose values are
	 * 8-bit, 16-bit, 32-bit and 64-bit signed two's-complement integers,
	 * respectively, and char, whose values are 16-bit unsigned integers
	 * representing UTF-16 code units.
	 */
}
