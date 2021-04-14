package algoritimos;

public class InsertionSort {
	/**
	 * Método para ordenar o vetor
	 * @param vetor: o array de elementos inteiros
	 */
	public static void insertionSort(int[] vetor) {
		//varial que vai percorrer os elementos do inicio até o fim
	    int j;
	    //elemento que vai ter trocado de posição
	    int chave;
	    //variavel que vai percorrer os elementos do fim até o inicio
	    int i;
	    //laço para percorrer do inicio ao fim
	    for (j = 1; j < vetor.length; j++)
	    {
	    	//chave guarda o elemento da posição j
	    	chave = vetor[j];
	    	//laço para percorrer do fim ao inicio
	      for (i = j - 1; (i >= 0) && (vetor[i] > chave); i--)
	      {
	    	  //o elemento da posição i+1 troca de posição com o elemento da posição i
	         vetor[i + 1] = vetor[i];
	       }
	      //O elemento da posiçao i+1 troca com o elemento que chave guarda
	      //que é a o da posição j
	        vetor[i + 1] = chave;
	    }
	}
}
