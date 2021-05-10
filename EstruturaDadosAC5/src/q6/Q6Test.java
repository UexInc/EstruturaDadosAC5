package q6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import q2.BinarySearchTree;

class Q6Test {
	
	/*
	 	Tarefa 20 - TAD-Mapa Ordenado - Árvore Binária de Busca.pptx
			 6. Quantas árvores binárias de pesquisas diferentes podem armazenar as chaves {1,2,3}?
	 */
	
	@Test
	void test() {
		insertions(1, 2, 3);
		insertions(1, 3, 2);
		insertions(2, 3, 1);
		insertions(2, 1, 3);
		insertions(3, 1, 2);
		insertions(3, 2, 1);
		System.out.println("R: Apenas uma árvore binária de pesquisa \n"
				+ "será gerada com as chaves {1, 2, 3}");
	}
	
	private void insertions(int c1, int c2, int c3) {
		BinarySearchTree<Integer, Integer> A = new BinarySearchTree<Integer, Integer>();
		assertNull(A.put(1, null));
		assertNull(A.put(2, null));
		assertNull(A.put(3, null));
		System.out.println(A.printExpression(A.root()));
	}

}
