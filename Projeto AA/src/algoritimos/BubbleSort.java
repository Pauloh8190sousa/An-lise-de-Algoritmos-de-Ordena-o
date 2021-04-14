package algoritimos;

public class BubbleSort {	
//Algoritmo de ordenação BubbleSort
	/**
	 * Método para ordenar o vetor
	 * @param vetor: um array de elementos inteiros
	 */
   public static void bubbleSort(int[] vetor){
	   //variavel para confirmar a troca e condição de parada
           boolean troca = true;
       //Varial auxiliar para guardar o elemento a ser trocado
           int aux;
        //laço para fazer as trocas
           while (troca) {
               troca = false;
               //laço onde percorrer o vetor
               for (int i = 0; i < vetor.length - 1; i++) {
            	   //se a posição i do vetor for maior que i+1 ele faz a troca
                   if (vetor[i] > vetor[i + 1]) {
                	   //o elemnto i é guardada no aux
                       aux = vetor[i];
                       //o elemento da posição i é trocada com o da posição i+1
                       vetor[i] = vetor[i + 1];
                       //o elemento da posição i+1 recebe o aux que guarda o elemento
                       //da posição i
                       vetor[i + 1] = aux;
                       //confirma a troca
                       troca = true;
                   }
               }
           }
	}
}
