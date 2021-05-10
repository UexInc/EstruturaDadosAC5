package q10;

import org.junit.jupiter.api.Test;

import q8.AVLTreeMap;

class Q10Test {

	/*
	 	Tarefa 21 - TAD-Mapa Ordenado - AVL.pptx
	 	10. O professor Amongus afirma que a ordem na qual um conjunto fixo de itens é
			inserido em uma árvore AVL não interessa — sempre resulta na mesma árvore.
			Apresente um pequeno exemplo que prove que ele está errado.
	 */

	@Test
	void test() {
		String x = insertions(new int[] { 1, 5, 7, 10, 13, 15, 20 });
		String y = insertions(new int[] { 20, 7, 5, 13, 15, 10, 1 });
		System.out.println("A ordem das inserções resultam em arvores iguais: " + (x == y));
	}

	private String insertions(int[] itens) {
		AVLTreeMap<Integer, Character> avl = new AVLTreeMap<Integer, Character>();
		for (int i = 0; i < itens.length; i++) {
			avl.put(itens[i], null);
		}
		return avl.printExpression(avl.root());
	}

}
