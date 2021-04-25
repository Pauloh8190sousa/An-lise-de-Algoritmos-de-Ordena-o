package algoritimos;

public class BubbleSort {	
//Algoritmo de ordena��o BubbleSort
	/**
	 * trocadeDeChave: contador de trocas
	 * comparacoes: contador de comparacoes
	 */
	private static double trocaDeChave;
	private static double comparacoes;
	
	/**
	 * M�todo para ordenar o vetor
	 * @param vetor: um array de elementos inteiros
	 */
   public static void bubbleSort(int[] vetor){
	   //variavel para confirmar a troca e condi��o de parada
           boolean troca = true;
       //Varial auxiliar para guardar o elemento a ser trocado
           int aux;
        //la�o para fazer as trocas
           while (troca) {
               troca = false;
               //la�o onde percorrer o vetor
               for (int i = 0; i < vetor.length - 1; i++) {
            	   //se a posi��o i do vetor for maior que i+1 ele faz a troca
            	   comparacoes+=1;
                   if (vetor[i] > vetor[i + 1]) {
                	   //o elemnto i � guardada no aux
                       aux = vetor[i];
                       trocaDeChave+=1;
                       //o elemento da posi��o i � trocada com o da posi��o i+1
                       vetor[i] = vetor[i + 1];
                       trocaDeChave+=1;
                       //o elemento da posi��o i+1 recebe o aux que guarda o elemento
                       //da posi��o i
                       vetor[i + 1] = aux;
                       trocaDeChave+=1;
                       //confirma a troca
                       troca = true;
                   }
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