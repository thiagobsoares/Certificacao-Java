package br.com.soares.thiago.material;
/*N�o ir� compilar, porque os m�todos s�o da isntancia e n�o da classe (n�o static)
 * Um m�todo ou um atributo static s� podem chamarem atributos ou m�todos static.
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