package q7;

import org.junit.jupiter.api.Test;

import q2.BinarySearchTree;

class Q7Test {

	/* 
		Tarefa 20 - TAD-Mapa Ordenado - Árvore Binária de Busca.pptx
			7. O professor Amongus afirma que a ordem na qual um conjunto fixo de itens é
			inserido em uma árvore binária de pesquisa não interessa — sempre resulta na
			mesma árvore. Apresente um pequeno exemplo que prove que ele está errado.
	 */
	
	@Test
	void test() {
		String x = insertions(new int[] { 1, 5, 7, 10, 13, 15, 20 });
		String y = insertions(new int[] { 20, 7, 5, 13, 15, 10, 1 });
		System.out.println("A ordem das inserções resultam em arvores iguais: " + (x == y));
	}
	
	private String insertions(int[] itens) {
		BinarySearchTree<Integer, Character> A = new BinarySearchTree<Integer, Character>();
		for (int i = 0; i < itens.length; i++) {
			A.put(itens[i], null);
		}
		return A.printExpression(A.root());
	}

}
