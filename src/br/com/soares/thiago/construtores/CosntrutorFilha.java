package br.com.soares.thiago.construtores;

public class CosntrutorFilha extends ConstrutorMae {
	public CosntrutorFilha() {
		super();
	}

	/*
	 * Tanto o super quanto o this tem que serem os primeiros elementos chamado no construtor, 
	 * logo não se pode chamar os dois ao mesmo tempo.
	 * 
	 * Se não for declado um construtor, o java por padrão adiciona um construtor e chama o super
	 * 
	 * Cuidado, não pode existir ciclo no construtor, se existir, não compilará.
	 * 
	 * O super pode ser chamdo IMPLICITAMENTE, pois se não existir construtor, o java por padrão
	 * cria um e chama o super();
	 * 
	 * super(); is automatically added if the sub class constructor doesn't call any of the super class's constructors.
	 * super() is added and not this()
	 * 
	 * 
	 * Which of these statements are true? Select 2 option(s): A super(
	 * <appropriate list of arguments> ) or this( <appropriate list of
	 * arguments> ) call must always be provided explicitly as the first
	 * statement in the body of the constructor. If a subclass does not have any
	 * declared constructors, the implicit default constructor of the subclass
	 * will have a call to super( ). If neither super( ) or this( ) is declared
	 * as the first statement of the body of a constructor, then this( ) will
	 * implicitly be inserted as the first statement. super(<appropriate list of
	 * arguments>) can only be called in the first line of the constructor but
	 * this(<appropriate list of arguments>) can be called from anywhere. You
	 * can either call super(<appropriate list of arguments>) or
	 * this(<appropriate list of arguments>) but not both from a constructor.
	 * 
	 */
}
