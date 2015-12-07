package br.com.soares.thiago.material;

/*
 * Compila e imprimi 1, pois quando existe métodos sobrecarregados e 
 * com possiveis promoções ou polimorfismo, o java escolhe o mais espeficico
 * */
class Sobrecarga_6_B {
}

class Sobrecarga_6_C {
}

class Sobrecarga_6_D extends Sobrecarga_6_B {
}

public class Sobrecarga_6 {
	static int a(Sobrecarga_6_D d) {
		return 1;
	}

	static int a(Sobrecarga_6_C c) {
		return 2;
	}

	static int a(Sobrecarga_6_B b) {
		return 3;
	}

	static int a(Sobrecarga_6 a) {
		return 4;
	}

	public static void main(String[] args) {
		System.out.println(a(new Sobrecarga_6_D()));
	}
}