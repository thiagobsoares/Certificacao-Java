package br.com.soares.thiago.heranca.pacoteOneB;

import br.com.soares.thiago.heranca.pacoteOneA.One;

public class Four extends br.com.soares.thiago.heranca.pacoteOneA.One {

	void TestandoChamarMetodoC() {
		Four four = new Four();
		One one = new One();
		One one2 = new Four();
		Three three = new Three();

		/*
		 * No caso de referencia, só compila se a referencia for a class atual
		 * ou inferior (filhas), no caso a classe three é filha dessa, então ela
		 * pode chamar por referencia o método protected também, já a classe
		 * ONE, não compila, pois é a classe pai e não está no mesmo pacote ISSO
		 * SÓ FUNCIONA, SE ESTIVERMOS EM CLASSES QUE HERDA A CLASSE QUE TE O
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
