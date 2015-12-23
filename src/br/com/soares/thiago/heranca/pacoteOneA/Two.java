package br.com.soares.thiago.heranca.pacoteOneA;

public class Two extends One {
	
	//Sem problema, tudo no mesmo pacote
	void TestandoChamarMetodoCporReferencia() {
		One reff = new One();
		Two ref = new Two();
		
		reff.c();
		ref.c();
		c();
	}
}
