package algoritimos;

public class InsertionSort {
	/**
	 * trocadeDeChave: contador de trocas
	 * comparacoes: contador de comparacoes
	 */
	private static double trocaDeChave;
	private static double comparacoes;
	
	/**
	 * M�todo para ordenar o vetor
	 * @param vetor: o array de elementos inteiros
	 */
	public static void insertionSort(int[] vetor) {
		//varial que vai percorrer os elementos do inicio at� o fim
	    int j;
	    //elemento que vai ter trocado de posi��o
	    int chave;
	    //variavel que vai percorrer os elementos do fim at� o inicio
	    int i;
	    //la�o para percorrer do inicio ao fim
	    for (j = 1; j < vetor.length; j++)
	    {
	    	//chave guarda o elemento da posi��o j
	    	chave = vetor[j];
	    	//la�o para percorrer do fim ao inicio
	    	comparacoes+=1;
	      for (i = j - 1; (i >= 0) && (vetor[i] > chave); i--)
	      {
	    	  //o elemento da posi��o i+1 troca de posi��o com o elemento da posi��o i
	         vetor[i + 1] = vetor[i];
	         trocaDeChave+=1;
	       }
	      //O elemento da posi�ao i+1 troca com o elemento que chave guarda
	      //que � a o da posi��o j
	        vetor[i + 1] = chave;
	        trocaDeChave+=1;
	    }
	}
	public static double getTrocas(){
		return trocaDeChave;
	}
	public static double getComparacoes(){
		return comparacoes;
	}
}
