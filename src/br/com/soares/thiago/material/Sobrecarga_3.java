package br.com.soares.thiago.material;
public class Sobrecarga_3 {
	/*N�o compila, pois o compilador ficar� confuso na hora de chamar o m�todo,
	 * Qualquer tipo de m�todo que recebe um parametro e um array, ir� causar conflito*/

    public static void main(String[] args) {
        System.out.println("[]");
    }
    public static void main(String... args) {
        System.out.println("...");
    }
}