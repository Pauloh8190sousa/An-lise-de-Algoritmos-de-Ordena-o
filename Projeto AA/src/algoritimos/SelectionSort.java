package algoritimos;

public class SelectionSort {
	/**
	 * Método de ordenar
	 * @param array:vetor com os elementos
	 */
	public static void selectionSort(int[] vetor) {
		//laço que percorrer o vetor até o penúltimo para achar o menor elemento
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			//referência do menor elemento
			int menor = fixo;
			//laço que percorrer o vetor até o último elemento
			for (int i = menor + 1; i < vetor.length; i++) {
				//compara se o elemento da posiçao i é menor que o da posiçao menor
				if (vetor[i] < vetor[menor]) {
					//se for menor, o atributo menor assumi o valor de i
					menor = i;
				}
			}
			//compara se menor é diferente do valor fixo
			if (menor != fixo) {
				// pega o elemento da posição fixo
				int t = vetor[fixo];
				//troca de posição o elemento do indice menor com o do fixo
				vetor[fixo] = vetor[menor];
				//troca de posição com o t que guarda o elemento do indice fixo
				vetor[menor] = t;
			}
		}
	}
}