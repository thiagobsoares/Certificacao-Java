package br.com.soares.thiago.material;
/*Não irá compilar, porque os métodos são da isntancia e não da classe (não static)
 * Um método ou um atributo static só podem chamarem atributos ou métodos static.
 * 
 */
class Sobrecarga_4_B{}
class Sobrecarga_4_C{}
class Sobrecarga_4_D extends Sobrecarga_4_B{}
public class Sobrecarga_4 {
    int a(Sobrecarga_4_D d) { return 1; }
    int a(Sobrecarga_4_C c) { return 2; }
    int a(Sobrecarga_4_B b) { return 3; }
    int a(Sobrecarga_4 a) { return 4; }
    
    public static void main(String[] args) {
        System.out.println(a(new Sobrecarga_4_D()));
    }
}