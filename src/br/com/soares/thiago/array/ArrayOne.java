package br.com.soares.thiago.array;

public class ArrayOne {
	// Identify correct statements about a two dimensional array.
	//
	// FALSE - It is like a rectangular matrix where number of rows and number
	// of
	// columns may be different but each row or each column have the same number
	// of elements.

	// FALSE - It is like a square matrix where number of rows and number of
	// columns are
	// same and each row or each column have the same number of elements.

	// FALSE - The number of rows and columns must be specified at the time it
	// is
	// declared.

	// TRUE - It is basically an array of arrays.

	/*
	 * Size of the dimensions is required to be specified only at the time of
	 * instantiation and not at the time of declaration. For example, int[][]
	 * ia; //this is a valid declaration. int[][] ia = new int[2][3];//This is a
	 * valid declaration and a valid instantiation
	 * 
	 * Further, only the size of the first dimension is required to be specified
	 * at the time of instantiation for an array of more than one dimension.
	 * Sizes of the other dimensions may be left out. int[][] iaa=new int[3][];
	 * int[][][] iaaa = new int[3][][]; //Both are valid. This is allowed
	 * because a multi dimensional array in Java is just an array of arrays.
	 * They do not have to be symmetric, that is, each sub array is an
	 * independent array and so they do not have to be of the same size. So, in
	 * the above example, iaa[0] can be initialized to new int[5], and ia[1] to
	 * new int[10], while ia[2] can be left null.
	 * 
	 * Unlike some other languages, multi dimensional arrays in Java are not
	 * like matrices. They are just arrays of arrays. For example, if you have a
	 * two dimensional array then each element of this array is a one
	 * dimensional array. Each such array element is independent and therefore
	 * can be of different lengths (but not of different type).
	 */
}
