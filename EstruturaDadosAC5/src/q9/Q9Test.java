package q9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import q8.AVLTreeMap;

class Q9Test {

	/*
	 	Tarefa 21 - TAD-Mapa Ordenado - AVL.pptx
	 		9. Inserindo-se as entradas (1,A), (2,B), (3,C), (4,D) e (5,E), nessa ordem, em
			uma árvore AVL inicialmente vazia, qual será sua aparência?
	 */
	
	@Test
	void test() {
		AVLTreeMap<Integer, Character> avl = new AVLTreeMap<Integer, Character>();
		assertNull(avl.put(1, 'A'));
		assertNull(avl.put(2, 'B'));
		assertNull(avl.put(3, 'C'));
		assertNull(avl.put(4, 'D'));
		assertNull(avl.put(5, 'E'));
		System.out.println(avl.printExpression(avl.root()));
	}
	
	/*	Aparência:
	 * 							(2, B)
	 * 		
	 * 					(1, A)			(4, D)
	 * 		
	 * 							  (3, C)		(5, E)
	 *	
	 */

}
