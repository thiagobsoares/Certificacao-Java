package br.com.soares.thiago.material;

/*Não compila, pois tem várias variáveis locais (parâmetros) com o mesmo nome.
 * Se não fosse isso, iria compilar e chamar o primeiro método, 
 * pois um dos parametros é mais especifico
 * 
 */
class Sobrecarga_7_B{}
class Sobrecarga_7_C{}
class Sobrecarga_7_D extends Sobrecarga_7_B{}
public class Sobrecarga_7_A {
    static int a(Sobrecarga_7_D d, Sobrecarga_7_B b) { return 1; }
//    static int a(Sobrecarga_7_C c, Sobrecarga_7_C c) { return 2; }
    static int a(Sobrecarga_7_B b, Sobrecarga_7_B b1) { return 3; }
//    static int a(Sobrecarga_7_A a, Sobrecarga_7_A a) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new Sobrecarga_7_D(), new Sobrecarga_7_D()));
    }
}