package br.com.soares.thiago.material;


public class Sobrecarga_2 {
	/*
	 * Compila e imprime 15, 15 e 15.0, pois o tipo que foi passado para o
	 * m�todo b foi '15' um tipo inteiro, ent�o ele vai procurar o m�todo com o
	 * tipo mais espec�fico
	 */
	public static void main(String[] args) {
		int x = b(15);
		System.out.println(x);
		System.out.println(15);
		System.out.println(15.0);
	}

	static int b(int i) {
		return i;
	}

	static double b(double i) {
		return i;
	}
}