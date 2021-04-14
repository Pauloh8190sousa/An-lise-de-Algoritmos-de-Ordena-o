package algoritimos;

public class BubbleSort {	
//Algoritmo de ordena��o BubbleSort
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
                   if (vetor[i] > vetor[i + 1]) {
                	   //o elemnto i � guardada no aux
                       aux = vetor[i];
                       //o elemento da posi��o i � trocada com o da posi��o i+1
                       vetor[i] = vetor[i + 1];
                       //o elemento da posi��o i+1 recebe o aux que guarda o elemento
                       //da posi��o i
                       vetor[i + 1] = aux;
                       //confirma a troca
                       troca = true;
                   }
               }
           }
	}
}
