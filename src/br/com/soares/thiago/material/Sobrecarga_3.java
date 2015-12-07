package br.com.soares.thiago.material;
public class Sobrecarga_3 {
	/*Não compila, pois o compilador ficará confuso na hora de chamar o método,
	 * Qualquer tipo de método que recebe um parametro e um array, irá causar conflito*/

    public static void main(String[] args) {
        System.out.println("[]");
    }
    public static void main(String... args) {
        System.out.println("...");
    }
}