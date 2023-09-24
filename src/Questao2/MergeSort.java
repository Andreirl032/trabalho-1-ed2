package Questao2;

public class MergeSort {

    public static int[] mergeSort( int[] A ){
        int [] Temp = new int[ A.length];

        return mergeMain( A, Temp, 0, A.length-1 );
    }

    public static int[] mergeMain( int[] A, int[] T, int esquerda, int direita ){
        int meio;

        if ( esquerda < direita ){
            meio = ( esquerda + direita ) / 2;
            mergeMain( A, T, esquerda, meio );
            mergeMain( A, T, meio + 1, direita );
            merge( A, T, esquerda, meio + 1, direita );

        }
        return A;
    }

    public static void merge( int[] A, int[] T, int posicao_esquerda, int posicao_direita, int fim_direita ){
        int fim_esquerda = posicao_direita - 1;
        int posicao_temporaria = posicao_esquerda;
        int numero_elemento = fim_direita - posicao_esquerda + 1;

        while ( posicao_esquerda <= fim_esquerda && posicao_direita <= fim_direita ){
            if ( A[ posicao_esquerda ] <= A[ posicao_direita ] ){
                T[ posicao_temporaria++ ] = A[ posicao_esquerda++ ];
            } else {
                T[ posicao_temporaria++ ] = A[ posicao_direita++ ];
            }
        }

        // Copia o resto da primeira parte
        while ( posicao_esquerda <= fim_esquerda ){
            T[ posicao_temporaria++ ] = A[ posicao_esquerda++ ];
        }

        // Copia o resto da primeira parte
        while( posicao_direita <= fim_esquerda ){
            T[ posicao_temporaria++ ] = A[ posicao_direita++ ];
        }

        // Copia o vetor
        for ( int i = 0; i < numero_elemento; i++, fim_direita-- ){
            A[ fim_direita ] = T[ fim_direita ];
        }
    }

    public static boolean str_a_menor_igual_b( String a, String b ){
        int tamanho_a = a.length();
        int tamanho_b = b.length();

        int index_a = 0;
        int index_b = 0;

        char letter_a, letter_b;

        while ( index_a <= tamanho_a && index_b <= tamanho_b ){
            letter_a = a.toCharArray()[ index_a++ ];
            letter_b = b.toCharArray()[ index_b++ ];
            if ( letter_a < letter_b ){
                return true;
            } else if ( letter_a > letter_b ) {
                return false;
            }
        }

        return index_a <= index_b;
    }

    public static String[] mergeSort( String[] A ){
        String[] Temp = new String[ A.length];

        return mergeMain( A, Temp, 0, A.length-1 );
    }

    public static String[] mergeMain( String[] A, String[] T, int esquerda, int direita ){
        int meio;

        if ( esquerda < direita ){
            meio = ( esquerda + direita ) / 2;
            mergeMain( A, T, esquerda, meio );
            mergeMain( A, T, meio + 1, direita );
            merge( A, T, esquerda, meio + 1, direita );

        }
        return A;
    }

    public static void merge( String[] A, String[] T, int posicao_esquerda, int posicao_direita, int fim_direita ){
        int fim_esquerda = posicao_direita - 1;
        int posicao_temporaria = posicao_esquerda;
        int numero_elemento = fim_direita - posicao_esquerda + 1;

        while ( posicao_esquerda <= fim_esquerda && posicao_direita <= fim_direita ){
            if ( str_a_menor_igual_b( A[ posicao_esquerda ], A[ posicao_direita ] ) ){
                T[ posicao_temporaria++ ] = A[ posicao_esquerda++ ];
            } else {
                T[ posicao_temporaria++ ] = A[ posicao_direita++ ];
            }
        }

        // Copia o resto da primeira parte
        while ( posicao_esquerda <= fim_esquerda ){
            T[ posicao_temporaria++ ] = A[ posicao_esquerda++ ];
        }

        // Copia o resto da primeira parte
        while( posicao_direita <= fim_esquerda ){
            T[ posicao_temporaria++ ] = A[ posicao_direita++ ];
        }

        // Copia o vetor
        for ( int i = 0; i < numero_elemento; i++, fim_direita-- ){
            A[ fim_direita ] = T[ fim_direita ];
        }
    }
}
