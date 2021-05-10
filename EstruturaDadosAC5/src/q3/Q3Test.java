package q3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import q2.BinarySearchTree;

class Q3Test {

	/*
	 	Tarefa 20 - TAD-Mapa Ordenado - Árvore Binária de Busca.pptx
	 		3. Inserindo-se as entradas (1,A), (2,B), (3,C), (4,D) e (5,E), nessa ordem, em uma
			árvore de pesquisa binária inicialmente vazia, qual será sua aparência?
	 */
	
	@Test
	void test() {
		BinarySearchTree<Integer, Character> A = new BinarySearchTree<Integer, Character>();
		assertNull(A.put(1, 'A'));
		assertNull(A.put(2, 'B'));
		assertNull(A.put(3, 'C'));
		assertNull(A.put(4, 'D'));
		assertNull(A.put(5, 'E'));
		System.out.println(A.printExpression(A.root()));
	}
	
	/*	Aparência:
	 * 							(1, A)
	 * 		
	 * 						()		(2, B)
	 * 		
	 * 							  ()	(3, C)
	 * 								
	 * 								 ()	    (4, D)
	 * 
	 *  								 ()	    (5, E)
	 */

}
