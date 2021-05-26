package q5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import q2.BinarySearchTree;

class Q5Test {

	/*
	 	Tarefa 20 - TAD-Mapa Ordenado - Árvore Binária de Busca.pptx
	 		5. Insira, em uma árvore binária de pesquisa vazia, itens com as chaves 30, 40, 24,
			58, 48, 26, 11, 13 (nesta ordem). Desenhe a árvore após cada inserção.
	 */
	
	@Test
	void test() {
		BinarySearchTree<Integer, Integer> A = new BinarySearchTree<Integer, Integer>();
		assertNull(A.put(30, null));
		assertNull(A.put(40, null));
		assertNull(A.put(24, null));
		assertNull(A.put(58, null));
		assertNull(A.put(48, null));
		assertNull(A.put(26, null));
		assertNull(A.put(11, null));
		assertNull(A.put(13, null));
		System.out.println(A.printExpression(A.root()));
	}
	
	// Passo a passo na imagem - Q5.png

}
