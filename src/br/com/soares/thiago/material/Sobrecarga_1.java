package br.com.soares.thiago.material;


public class Sobrecarga_1 {
	/* R1:  Não irá compilar, pois os métodos são ambíguos, muda apenas o retorno o que não é suficiente parar tirar a ambíguidade  
	*  R2:  O código não compila, pois não há sobrecarga de método ao alterar só o retorno.
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