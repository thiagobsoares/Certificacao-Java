package br.com.soares.thiago.exercicio.simulado1;

public class PrimeiraLeva {
	public static void main(String args[]) {
		StringBuffer buffer = new StringBuffer("Java");
		addCharNoStringBuffer(buffer);
		System.out.println(buffer);
	}

	/* Estudar o motivo do ~i*/
	public static void primeiroExercicio() {
		int i = 0xFFFFFFF1;
		int j = ~i;
		System.out.println("Primeiro Exercicio" + j);
	}

	/*Confuso*/
	public static void segundoExercicio() {
		Integer i = new Integer(42);
		// Long 1 = new Long (42);
		Double var = new Double(42.0);

		System.out.println(i == 42.0);
		// System.out.println(i == d);
		System.out.println(var == 1);
		System.out.println(i.equals(var));
		System.out.println(var.equals(i));
		System.out.println(i.equals(42));

	}

	
	private static int j = 0;

	private static boolean methodB(int k) {
		j += k;
		return true;
	}

	public static void methodA(int i) {
		boolean b;
		b = i < 10 | methodB (4);
		b = i < 10 || methodB (8);
	}
	
	public static void quartoExercicio(){
		System.out.println (6 ^ 3);
	}
	
	public static void addCharNoStringBuffer(StringBuffer text){
		text = text.append("C");
	}
}
