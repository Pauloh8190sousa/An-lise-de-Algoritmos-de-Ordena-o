package algoritimos;

public class QuickSort {
	/**
	 * Método de ordenação
	 * @param vetor: a lista de elementos inteiros
	 * @param inicio: indice do primeiro elemento da lista
	 * @param fim: indice do ultimo elemento da lista
	 */
	  public static void quickSort(int[] vetor, int inicio, int fim) {
		  //Condição de parada da recursividade
		  if (inicio < fim) {
			  // chama o método separar para descobrir o pivô e ordenar
               int posicaoPivo = separar(vetor, inicio, fim);
               //chamada recursiva do inicio até pivo-1
               quickSort(vetor, inicio, posicaoPivo - 1);
               //chamda recursiva do pivo+1 até o fim
               quickSort(vetor, posicaoPivo + 1, fim);
		  }
	  }
	  /**
	   * Método para descobrir o pivô e ordenar a lista
	   * @param vetor: lista de elementos
	   * @param inicio: indice do primeiro elemento da lista
	   * @param fim: indice do ultimo elemento da lista
	   * @return: retorna o número do pivô
	   */
	  private static int separar(int[] vetor, int inicio, int fim) {
		  // pega o elemento do inicio para ser o pivo
		  int pivo = vetor[inicio];
		  // pega o indice inicio+1
		  // a variavel f assume o valor de fim
		  int i = inicio + 1, f = fim;
		  //laço para ordenar o algoritmo enquanto i menor ou igual a f
		  while (i <= f) {
			  //se o indice i for menor ou igual o pivo o i é incrementado
               if (vetor[i] <= pivo)
            	   //incrementação
                      i++;
               //se o pivo for menor que o indice f a variavel f é desincrementado
               else if (pivo < vetor[f])
            	   //desincrementado
                      f--;
               // se não for nenhuma opção anterior então entra nessa condição
               else {
            	   //indice da troca onde está o elemento
                      int troca = vetor[i];
                      //troca o elemento do indice i pelo do indice f
                      vetor[i] = vetor[f];
                      //troca o elemento do indice f pelo troca que guarda o elemento
                      //do indice i
                      vetor[f] = troca;
                      //incrementa o i
                      i++;
                      //desincrementa o f
                      f--;
               }
		  }
		  //elemento do indice inicio troca pelo do indice f
		  vetor[inicio] = vetor[f];
		  //elemento do indice f troca pelo do pivo que guarda o elemento 
		  // do indice inicio
		  vetor[f] = pivo;
		  // retorna f que é o indice do pivo
		  return f;
	  }
	}
