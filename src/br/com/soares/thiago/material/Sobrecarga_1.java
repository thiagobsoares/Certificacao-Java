package br.com.soares.thiago.material;


public class Sobrecarga_1 {
	/* R1:  N�o ir� compilar, pois os m�todos s�o amb�guos, muda apenas o retorno o que n�o � suficiente parar tirar a amb�guidade  
	*  R2:  O c�digo n�o compila, pois n�o h� sobrecarga de m�todo ao alterar s� o retorno.
	*/
    public static void main(String[] args) {
        int x = b(15);
        System.out.println(x);
        System.out.println(15);
        System.out.println(15.0);
    }
    static int b(int i) { return i; } 
//   static double b(int i) { return i; } 
}