package algoritimos;

public class SelectionSort {
	/**
	 * trocadeDeChave: contador de trocas
	 * comparacoes: contador de comparacoes
	 */
	private static double trocaDeChave;
	private static double comparacoes;
	/**
	 * M�todo de ordenar
	 * @param array:vetor com os elementos
	 */
	public static void selectionSort(int[] vetor) {
		//la�o que percorrer o vetor at� o pen�ltimo para achar o menor elemento
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			//refer�ncia do menor elemento
			int menor = fixo;
			//la�o que percorrer o vetor at� o �ltimo elemento
			for (int i = menor + 1; i < vetor.length; i++) {
				//compara se o elemento da posi�ao i � menor que o da posi�ao menor
				comparacoes+=1;
				if (vetor[i] < vetor[menor]) {
					//se for menor, o atributo menor assumi o valor de i
					menor = i;
				}
			}
			//compara se menor � diferente do valor fixo
			if (menor != fixo) {
				// pega o elemento da posi��o fixo
				int t = vetor[fixo];
				trocaDeChave+=1;
				//troca de posi��o o elemento do indice menor com o do fixo
				vetor[fixo] = vetor[menor];
				trocaDeChave+=1;
				//troca de posi��o com o t que guarda o elemento do indice fixo
				vetor[menor] = t;
				trocaDeChave+=1;
			}
		}
	}
	public static double getTrocas(){
		return trocaDeChave;
	}
	public static double getComparacoes(){
		return comparacoes;
	}
}