package br.com.soares.thiago.heranca.pacoteOneB;

import br.com.soares.thiago.heranca.pacoteOneA.One;

public class Four extends br.com.soares.thiago.heranca.pacoteOneA.One {

	void TestandoChamarMetodoC() {
		Four four = new Four();
		One one = new One();
		One one2 = new Four();
		Three three = new Three();

		/*
		 * No caso de referencia, s� compila se a referencia for a class atual
		 * ou inferior (filhas), no caso a classe three � filha dessa, ent�o ela
		 * pode chamar por referencia o m�todo protected tamb�m, j� a classe
		 * ONE, n�o compila, pois � a classe pai e n�o est� no mesmo pacote ISSO
		 * S� FUNCIONA, SE ESTIVERMOS EM CLASSES QUE HERDA A CLASSE QUE TE O
		 * METODO PROTECTED, como nesse caso.
		 * 
		 * 
		 * one.c();
		 */
		four.c();
		three.c();
		c();
	}
}
