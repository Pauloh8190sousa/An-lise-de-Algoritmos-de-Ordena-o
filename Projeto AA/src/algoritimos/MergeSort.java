package algoritimos;
public class MergeSort {
	/**
	 * Método merge sort
	 * @param vetor: listas com os elementos a serem ordenados
	 */
	public static void mergeSort(int[] vetor) {
		//vetor vazio para auxiliar nas trocas
        int[] tmpArray = new int[vetor.length];
        //chama o método mergesort que vai ordenar o vetor
        mergeSort( vetor, tmpArray, 0, vetor.length - 1 );
    }
	/**
	 * Método merge sort que faz a chamada recursiva
	 * @param vetor: lista com os elementos para serem ordenados
	 * @param tmpArray: lista vazia para auxiliar nas trocas
	 * @param left: indice esquerdo do vetor
	 * @param right: indice direito do vetor
	 */
    private static void mergeSort(int[] vetor, int[] tmpArray,int left, int right ) {
        //verifica se left é menor que right
    	if( left < right ) {
    		//pega o indice do centro
            int center = ( left + right ) / 2;
            //chamada recursiva do método
            mergeSort( vetor, tmpArray, left, center );
            mergeSort( vetor, tmpArray, center + 1, right );
            //método que ordena os elementos do vetor
            merge( vetor, tmpArray, left, center + 1, right );
        }
    }
   /**
    * Método merge que ordena os elementos
    * @param vetor: lista com elementos para serem ordenados
    * @param tmpArray: lista vazia para auxiliar as trocas
    * @param leftPos: indice do lado esquerdo do vetor
    * @param rightPos: indice do lado direito do vetor
    * @param rightEnd: indice do lado direito na ultima posição
    */
    private static void merge(int[ ] vetor, int[ ] tmpArray, int leftPos, int rightPos, int rightEnd ) {
        //indice do lado esquerdo da ultima posição
    	int leftEnd = rightPos - 1;
    	//indice que vem depois de leftEnd
        int tmpPos = leftPos;
        //numero de elementos
        int numElements = rightEnd - leftPos + 1;
        //laço para percorrer os dois lados
        while( leftPos <= leftEnd && rightPos <= rightEnd )
        	//se leftPos for menor ou igual rightPoss então ele troca de posição
            if( vetor[leftPos] <= ( vetor[rightPos] ))
                tmpArray[ tmpPos++ ] = vetor[ leftPos++ ];
            else
            	//se leftPos não for menor que rightPos então troca rightPos
                tmpArray[ tmpPos++ ] = vetor[rightPos++];
        //laço para percorrer o lado esquerdo
        while( leftPos <= leftEnd )    
        	//incrementa o indice
            tmpArray[ tmpPos++ ] = vetor[leftPos++];
        //laço para percorrer o lado direito
        while( rightPos <= rightEnd )  
        	//incrementa o indice
            tmpArray[ tmpPos++ ] = vetor[rightPos++];
        //passa os numeros ordenados para o vetor
        for( int i = 0; i < numElements; i++, rightEnd-- )
        	vetor[rightEnd] = tmpArray[rightEnd];
    }
}