package questions.Questao1;

import Ord.util.Report;
import structs.Generics;

import java.util.Arrays;
import java.util.Random;

import static questions.Questao1.HeapSort.heapSort;

public class Main {

    public static Generics<?, ?>[] gera_vector_inteiro( int size ){
        Generics<?, ?>[] vector = new Generics<?, ?>[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = new Generics<Integer, Integer >( random.nextInt(  ) , random.nextInt(  ) );
        }

        return vector;
    }

    public static int[] gera_vector_natural( int size ){
        int[] vector = new int[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = Math.abs( random.nextInt( size ) );
        }

        return vector;
    }

    public static void main(String[] args) {
        final int TAMANHO = 1_000_000;

        for ( int i = 1; i < 100; i++ ){
            Generics<?, ?>[] vector1 = gera_vector_inteiro( TAMANHO );
            int[] p = gera_vector_natural( i );

            final long startTime = System.currentTimeMillis();
            int maior = p[0];
            for (int j=1; i < p.length;i++){
                if( p[i] > maior  ){
                    maior = p[i];
                }
            }

            Generics<?, ?>[] newArray = new Generics[p.length];
            heapSort( vector1, maior);
            final long endTime = System.currentTimeMillis();
            System.out.println("Tempo de execução: " + (endTime-startTime) + " ms");

            System.out.print("O = [ ");
            for(int k = 0; k < p.length; k++){
                newArray[ k ] = vector1[vector1.length-p[ k ] - 1 ];

                System.out.print( newArray[ k ].getValue() );
                if( k + 1 < p.length)
                    System.out.print(", ");
            }
            System.out.println(" ]");
        }

        Report.soft_hard_content();
    }
}