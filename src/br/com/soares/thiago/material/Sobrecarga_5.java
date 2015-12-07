package br.com.soares.thiago.material;

/*Não compilao método não é static */

class Sobrecarga_5_B{}
class Sobrecarga_5_C{}
class Sobrecarga_5_D extends Sobrecarga_5_B{}
class Sobrecarga_5 {
    int a(Sobrecarga_5_D d) { return 1; }
    static int a(Sobrecarga_5_C c) { return 2; }
    static int a(Sobrecarga_5_B b) { return 3; }
    static int a(Sobrecarga_5 a) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new Sobrecarga_6_D()));
    }
}