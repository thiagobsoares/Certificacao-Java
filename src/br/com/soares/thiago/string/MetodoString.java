package br.com.soares.thiago.string;

public class MetodoString {
	/*
	 * Which of these methods are not a part of the String class? Select 1
	 * option(s): trim length concat hashCode reverse
	 * 
	 * 
	 * Não existe o metódo reserve na string	
	 * 
	 */
	public static void main(String[] args) {
		String string = "1212";
		string.hashCode();
		string.trim();
		string.length();
		string.concat("ola");

	}
}
