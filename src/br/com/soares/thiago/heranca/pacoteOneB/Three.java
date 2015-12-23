package br.com.soares.thiago.heranca.pacoteOneB;

import br.com.soares.thiago.heranca.pacoteOneB.Four;

public class Three extends Four {
	public static void main(String[] args) {
		Four four = new Four();
		Three three = new Three();

		/*
		 * O objeto four n�o consegue ver o metodo C(),
		 *  por que estamos em uma classe filha dela e 
		 *  n�o estamos no mesmo pacote que a classe do metodo
		 *  
		 *  J� o objeto three consegue compila o metodo C(), 
		 *  pois est� sendo referenciado na classe atual q � herdado, 
		 *  outro caso seria se referenciamos uma classe filha do THREE
		 * 
		 */
	}
}

/*
 * 
 * The wording of this question is a bit vague because it is not clear what is
 * meant by "can be accessed by". Expect such wording in the real exam as well.
 * Our guess is that it means what variables of class AccessTest can be accessed
 * using the reference named ref.
 * 
 * Since a public member is always accessible to every one, ref.d() is
 * definitely correct. private is only accessible within that class, therefore,
 * b cannot be accessed from anywhere outside of class AccessTest. A default
 * (aka package protected) member is accessible only from members of the same
 * package. Since AccessTester is in a different package a cannot be accessed
 * from AccessTester either.
 * 
 * Now, the question is only about the method c(). A protected member is
 * inherited by a subclass and it is therefore accessible in the subclass.
 * However, In the words of Java Language Specification, protected members of a
 * class are accessible outside the package only in subclasses of that class,
 * and only when they are fields of objects that are being implemented by the
 * code that is accessing them. Basically, it implies that a protected member is
 * accessible in the subclass only using a reference whose declared type is of
 * the same subclass (or its subclass.).
 * 
 * In this case, the declared type of ref is AccessTest, which is not of the
 * same type as the class from which you are trying to access c(). Therefore,
 * you cannot do ref.c() in AccessTester. If you had AccessTester ref = new
 * AccessTester(); you could do ref.c() because now the declared type of ref
 * (i.e. AcessTester) is the same subclass from which you are trying to access
 * c(). It will work even if the declared type of the reference is a child of
 * the subclass. For example, the following would be valid as well.
 * SubAccessTester ref = new SubAccessTester(); ref.c(); //this is valid Where
 * SubAccessTester is a subclass of AccessTester - class SubAccessTester extends
 * AccessTester{ }
 */