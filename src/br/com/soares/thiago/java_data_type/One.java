package br.com.soares.thiago.java_data_type;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class One {
	public static void main(String[] args) throws Exception {
		/*
		 * Fazendo " -a ", ou seja negativando uma variavel, 
		 * O java faz a operação complemento de dois, pega o binario do numero,
		 * Inverte todas as posições ( 1 fica 0 e 0 fica 1), depois adiciona 1 na primeira casa.
		 * 
		 * Essa operação muda o sinal da variavel, unica exceção é no menor valor possivel
		 * (2^-31), o valor da variavel continua a mesma, por causa do complemento de dois
		 * 
		 * -2147483648 = 10000...0000, fazendo o complemento de dois, o valor ficara o mesmo.
		 * 				 01111...1111 + 1 = 1000....0000.
		 * Essa questão, como pode ser percebido, acontece apenas com INT e LONG
		 * 
		 * A variavel não é alterada!
		 * 	
		 */

		
		byte b = Byte.MIN_VALUE;
		System.out.println(b);
		System.out.println(-b);
		System.out.println(b);
		
		short s = Short.MIN_VALUE;
		System.out.println(s);
		System.out.println(-s);
		System.out.println(s);

		char c = Character.MAX_VALUE;
		System.out.println((int)c);
		System.out.println(-c);
		System.out.println((int)c);
		
		int i = Integer.MIN_VALUE;
		System.out.println(i);
		System.out.println(-i);
		System.out.println(i);
		

		long l = Long.MIN_VALUE;
		System.out.println(l);
		System.out.println(-l);
		System.out.println(l);
		

		float f = Float.MIN_VALUE;
		System.out.println(f);
		System.out.println(-f);
		System.out.println(f);
		
		double d = Double.MIN_VALUE;
		System.out.println(d);
		System.out.println(-d);
		System.out.println(d);
	}

	/*
	 * It prints: -2147483648 -2147483648
	 * 
	 * This happens because negative integers are stored in 2's complement form
	 * (complement the bits and add 1). For example:
	 * 
	 * Integer 1 in binary is 00000000 00000000 00000000 00000001 (32 bits)
	 * 
	 * So -1 in binary would be (complement the bits for 1 and add 1) :
	 * 
	 * Step 1 (complement the bits of 1): 11111111 11111111 11111111 11111110
	 * Step 2 (add 1 to step 1): 11111111 11111111 11111111 11111111.
	 * 
	 * Now, let's see what happens in this question:
	 * 
	 * a = Integer.MIN_VALUE = 10000000 00000000 00000000 00000000
	 * 
	 * To get -a, apply the above two steps:
	 * 
	 * Step 1 (complement the bits): 011111111 11111111 11111111 11111111 Step 2
	 * (add 1) : 10000000 00000000 00000000 00000000
	 * 
	 * So you got the exact same value that you started with!
	 * 
	 * (Note that you can see the binary form of an integer using
	 * Integer.toBinaryString(i) method.)
	 */
}
