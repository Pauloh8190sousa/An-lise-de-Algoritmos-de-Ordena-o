package algoritimos;

public class QuickSort {
	/**
	 * M�todo de ordena��o
	 * @param vetor: a lista de elementos inteiros
	 * @param inicio: indice do primeiro elemento da lista
	 * @param fim: indice do ultimo elemento da lista
	 */
	  public static void quickSort(int[] vetor, int inicio, int fim) {
		  //Condi��o de parada da recursividade
		  if (inicio < fim) {
			  // chama o m�todo separar para descobrir o piv� e ordenar
               int posicaoPivo = separar(vetor, inicio, fim);
               //chamada recursiva do inicio at� pivo-1
               quickSort(vetor, inicio, posicaoPivo - 1);
               //chamda recursiva do pivo+1 at� o fim
               quickSort(vetor, posicaoPivo + 1, fim);
		  }
	  }
	  /**
	   * M�todo para descobrir o piv� e ordenar a lista
	   * @param vetor: lista de elementos
	   * @param inicio: indice do primeiro elemento da lista
	   * @param fim: indice do ultimo elemento da lista
	   * @return: retorna o n�mero do piv�
	   */
	  private static int separar(int[] vetor, int inicio, int fim) {
		  // pega o elemento do inicio para ser o pivo
		  int pivo = vetor[inicio];
		  // pega o indice inicio+1
		  // a variavel f assume o valor de fim
		  int i = inicio + 1, f = fim;
		  //la�o para ordenar o algoritmo enquanto i menor ou igual a f
		  while (i <= f) {
			  //se o indice i for menor ou igual o pivo o i � incrementado
               if (vetor[i] <= pivo)
            	   //incrementa��o
                      i++;
               //se o pivo for menor que o indice f a variavel f � desincrementado
               else if (pivo < vetor[f])
            	   //desincrementado
                      f--;
               // se n�o for nenhuma op��o anterior ent�o entra nessa condi��o
               else {
            	   //indice da troca onde est� o elemento
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
		  // retorna f que � o indice do pivo
		  return f;
	  }
	}
