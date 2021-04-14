package programa;

import algoritimos.BubbleSort;
import algoritimos.InsertionSort;
import algoritimos.MergeSort;
import algoritimos.QuickSort;
import algoritimos.SelectionSort;


public class principal {

	public static void main(String[] args) {
		
		int quantidade = 1000000;
		//Os vetores correspondentes ao algoritmos
		int[] vetor1 = new int[quantidade];
		int[] vetor2 = new int[quantidade];
		int[] vetor3 = new int[quantidade];
		int[] vetor4 = new int[quantidade];
		int[] vetor5 = new int[quantidade];
		
		for (int i = 0; i < vetor1.length; i++) {
			/**
			 * if(i>=(vetor1.length/2)): é usado para construir vetor quase ordenado.
			 * else: enquanto a primeira condição for falsa ele insere os elementos
			 * em ordem crescente.
			 * vetor1[i] = i: essa variavel é usada sozinha para construir 
			 * vetor ordenado.
			 * vetor1[i] = (int) (Math.random()*quantidade): é usado sozinho para
			 * construir vetores aleatorios.
			 * vetor1[i] = (quantidade-=1):  é usado para construir vetores
			 * inversamente ordenados
			 */
//			if(i>=(vetor1.length/2)){
//				vetor1[i] = (int) (Math.random()*quantidade);
//			}else{
				vetor1[i] = i;
//			}
//             vetor1[i] = (int) (Math.random()*quantidade);
//			vetor1[i] = (quantidade-=1);
		}
/**
 * quantidade = tamanho do vetor: é usado quando é construido o vetor inversamente
 * ordenado. pois no For de cima ele foi desincrementado como é visto (vetor1[i] = (quantidade-=1))
 * por isso tem que setar novamente o tamanho nessa variavel
 */
//		quantidade = 100000;
		for (int i = 0; i < vetor2.length; i++) {
			/**
			 * if(i>=(vetor2.length/2)): é usado para construir vetor quase ordenado.
			 * else: enquanto a primeira condição for falsa ele insere os elementos
			 * em ordem crescente.
			 * vetor2[i] = i: essa variavel é usada sozinha para construir 
			 * vetor ordenado.
			 * vetor2[i] = (int) (Math.random()*quantidade): é usado sozinho para
			 * construir vetores aleatorios.
			 * vetor2[i] = (quantidade-=1):  é usado para construir vetores
			 * inversamente ordenados
			 */
//			if(i>=(vetor2.length/2)){
//				vetor2[i] = (int) (Math.random()*quantidade);
//			}else{
				vetor2[i] = i;
//			}
//          	vetor2[i] = (int) (Math.random()*quantidade);
//			vetor2[i] = (quantidade-=1);
		}
		/**
		 * quantidade = tamanho do vetor: é usado quando é construido o vetor inversamente
		 * ordenado. pois no For de cima ele foi desincrementado como é visto (vetor2[i] = (quantidade-=1))
		 * por isso tem que setar novamente o tamanho nessa variavel
		 */
//		quantidade = 100000;
		for (int i = 0; i < vetor3.length; i++) {
			/**
			 * if(i>=(vetor3.length/2)): é usado para construir vetor quase ordenado.
			 * else: enquanto a primeira condição for falsa ele insere os elementos
			 * em ordem crescente.
			 * vetor3[i] = i: essa variavel é usada sozinha para construir 
			 * vetor ordenado.
			 * vetor3[i] = (int) (Math.random()*quantidade): é usado sozinho para
			 * construir vetores aleatorios.
			 * vetor3[i] = (quantidade-=1):  é usado para construir vetores
			 * inversamente ordenados
			 */
//			if(i>=(vetor3.length/2)){
//				vetor3[i] = (int) (Math.random()*quantidade);
//			}else{
				vetor3[i] = i;
//			}
//          	vetor3[i] = (int) (Math.random()*quantidade);
//			vetor3[i] = (quantidade-=1);
		}
		/**
		 * quantidade = tamanho do vetor: é usado quando é construido o vetor inversamente
		 * ordenado. pois no For de cima ele foi desincrementado como é visto (vetor3[i] = (quantidade-=1))
		 * por isso tem que setar novamente o tamanho nessa variavel
		 */
//		quantidade = 100000;
		for (int i = 0; i < vetor4.length; i++) {
			/**
			 * if(i>=(vetor4.length/2)): é usado para construir vetor quase ordenado.
			 * else: enquanto a primeira condição for falsa ele insere os elementos
			 * em ordem crescente.
			 * vetor4[i] = i: essa variavel é usada sozinha para construir 
			 * vetor ordenado.
			 * vetor4[i] = (int) (Math.random()*quantidade): é usado sozinho para
			 * construir vetores aleatorios.
			 * vetor4[i] = (quantidade-=1):  é usado para construir vetores
			 * inversamente ordenados
			 */
//			if(i>=(vetor4.length/2)){
//				vetor4[i] = (int) (Math.random()*quantidade);
//			}else{
				vetor4[i] = i;
//			}
//          	vetor4[i] = (int) (Math.random()*quantidade);
//			vetor4[i] = (quantidade-=1);
		}
		/**
		 * quantidade = tamanho do vetor: é usado quando é construido o vetor inversamente
		 * ordenado. pois no For de cima ele foi desincrementado como é visto (vetor4[i] = (quantidade-=1))
		 * por isso tem que setar novamente o tamanho nessa variavel
		 */
//		quantidade = 100000;
		for (int i = 0; i < vetor5.length; i++) {
			/**
			 * if(i>=(vetor5.length/2)): é usado para construir vetor quase ordenado.
			 * else: enquanto a primeira condição for falsa ele insere os elementos
			 * em ordem crescente.
			 * vetor5[i] = i: essa variavel é usada sozinha para construir 
			 * vetor ordenado.
			 * vetor5[i] = (int) (Math.random()*quantidade): é usado sozinho para
			 * construir vetores aleatorios.
			 * vetor5[i] = (quantidade-=1):  é usado para construir vetores
			 * inversamente ordenados
			 */
//			if(i>=(vetor5.length/2)){
//				vetor5[i] = (int) (Math.random()*quantidade);
//			}else{
				vetor5[i] = i;
//			}
//          	vetor5[i] = (int) (Math.random()*quantidade);
//			vetor5[i] = (quantidade-=1);
		}
		
	  long tempoInicial;
	  long tempoFinal;
      /**
       * A construção dos vetores não interferiram no tempo de execução dos algoritmos
       * pois só foi usado o método para descobrir o tempo de execução depois das
       * construções dos vetores.
       * Támbem foi testado a construção dos vetores fora desse main para ver se
       * tinha diferença e foi descoberto que não, sendo praticamente o mesmo tempo.
       */
	  //pega o tempo em milisegundos no momento
	  tempoInicial = System.currentTimeMillis();
      MergeSort.mergeSort(vetor1);
      //pega o tempo em milisegundos no momento
      tempoFinal = System.currentTimeMillis();
      //Subtrai o tempoFinal como tempoInicial para saber quanto tempo levou a execução
      System.out.println("Tempo de execução do MergeSort: "+(tempoFinal-tempoInicial)+"/ms"); 
      
	  tempoInicial = System.currentTimeMillis();
      InsertionSort.insertionSort(vetor2);
      tempoFinal = System.currentTimeMillis();
      System.out.println("Tempo de execução do InsertionSort: "+(tempoFinal-tempoInicial)+"/ms"); 
      
      tempoInicial = System.currentTimeMillis();
      QuickSort.quickSort(vetor3, 0, vetor3.length-1);
      tempoFinal = System.currentTimeMillis();
      System.out.println("Tempo de execução do QuickSort: "+(tempoFinal-tempoInicial)+"/ms");
      
      tempoInicial = System.currentTimeMillis();
      BubbleSort.bubbleSort(vetor4);
      tempoFinal = System.currentTimeMillis();
      System.out.println("Tempo de execução do BubbleSort: "+(tempoFinal-tempoInicial)+"/ms");    
      
      tempoInicial = System.currentTimeMillis();
      SelectionSort.selectionSort(vetor5);
      tempoFinal = System.currentTimeMillis();
      System.out.println("Tempo de execução do SelectionSort: "+(tempoFinal-tempoInicial)+"/ms");
      
	}
	
}
