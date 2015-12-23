package br.com.soares.thiago.heranca.pacoteOneB;

import br.com.soares.thiago.heranca.pacoteOneA.One;
import br.com.soares.thiago.heranca.pacoteOneA.Two;

public class Five {
	public static void main(String[] args) {
		One one = new One();
		Two two = new Two();
		Three three = new Three();
		Four four = new Four();

		/*
		 * Nenhuma dessas classe conseguem ver o metodo C, pois estão sendo
		 * referenciadas na classe FIVE, a mesma não setá no mesmo pacote da ONE
		 * e nem herda tal.
		 */

	}
}
