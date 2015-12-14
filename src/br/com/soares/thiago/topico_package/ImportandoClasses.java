/* 
Para colocar uma classe em um pacote, segue o exemplo,
Cada . no package, significa um  novo diretório

*/

package br.com.soares.thiago.topico_package;

/*
Podemos usar as classes  de outros pacotes por dois métodos:

* Usar o import no inicio do código (depois do package se existir)
	-Podemos importar apenas uma classe do pacote ( java.util.ArrayList )
	-Ou podemos importa o pacote todo ( java.util.* )
	
* O outro jeito de usar classe de outros pacotes, chamar ela no meio do código pelo nome full
(java,util.ArrayList lista =  new java.util.ArrayList();) Lógicamente, pouco ineficiente desse jeito.

*/

import java.util.HashMap;	//Está ok
import java.util.*;	//Está ok
import java.util.HashMap.*; // Compila normalmente, mas o HashMap não é importado.
//import java.util.hashMap; // Não compila, para import a regra de case sensitive é válida.

/*
Por padrão o pacote JAVA.LANG já é importado, O ÚNICO pacote que é importado automaticamente
*/

