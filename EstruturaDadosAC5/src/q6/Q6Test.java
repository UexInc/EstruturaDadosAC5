package q6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import q2.BinarySearchTree;

class Q6Test {
	
	/*
	 	Tarefa 20 - TAD-Mapa Ordenado - Árvore Binária de Busca.pptx
			 6. Quantas árvores binárias de pesquisas diferentes podem armazenar as chaves {1,2,3}?
	 */
	
	@Test
	void test() {
		ArrayList<String> aX = new ArrayList<String>();
		String a1 = insertions(1, 2, 3);
		String a2 = insertions(1, 3, 2);
		String a3 = insertions(2, 1, 3);
		String a4 = insertions(2, 3, 1);
		String a5 = insertions(3, 1, 2);
		String a6 = insertions(3, 2, 1);
		if (aX.indexOf(a1) < 0) aX.add(a1);
		if (aX.indexOf(a2) < 0) aX.add(a2);
		if (aX.indexOf(a3) < 0) aX.add(a3);
		if (aX.indexOf(a4) < 0) aX.add(a4);
		if (aX.indexOf(a5) < 0) aX.add(a5);
		if (aX.indexOf(a6) < 0) aX.add(a6);
		
		System.out.println("Serão geradas " + aX.size() + " árvores binárias de pesquisas diferentes.");
	}
	
	private String insertions(int c1, int c2, int c3) {
		BinarySearchTree<Integer, Integer> A = new BinarySearchTree<Integer, Integer>();
		assertNull(A.put(c1, null));
		assertNull(A.put(c2, null));
		assertNull(A.put(c3, null));
		return A.printExpression(A.root());
	}

}
