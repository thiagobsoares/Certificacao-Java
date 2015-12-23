package br.com.soares.thiago.excecoes;

import javax.activity.InvalidActivityException;

import com.sun.corba.se.spi.extension.ZeroPortPolicy;

/*
 * A try without resources must have either a catch or a finally. It may have both as well.
Thus, the following constructs are valid:

1.
try{
}
catch(Exception e){  }          // no finally

2.
try{
}
finally{  }          // no catch

3.
try{
}
catch(Exception e){  }
finally{  }

4. A catch can catch multiple exceptions:
try{
}
catch(Exception1|Exception2|Exception3 e){  } 

Note: try with resources (which is not on this exam) may omit catch as well as finally blocks


Não é obrigatorio usar o catch ou o finally, mas tem que ser usado pelo menos um ou os dois
 */
public class CorpoDoTry {
	public static void main(String[] args) {
		try {
		} catch (Exception e) {
		} // no finally

		try {
		} finally {
		} // no catch

		try {
		} catch (Exception e) {
		} finally {
		}

		try {
		} catch (RuntimeException e) {
		}
		
	}
}
