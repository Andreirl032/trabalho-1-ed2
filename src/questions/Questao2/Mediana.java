package questions.Questao2;

import sort.Merge;
import sort.Counting;
import structs.Generics;

public class Mediana {

    public static double achaMediana( Generics<?, ?>[] vector_1, Generics<?, ?>[] vector_2 ){
        if( vector_1.length != vector_2.length){
            System.out.println("ERRO! OS VETORES DEVEM SER DE MESMO TAMANHO");
            return 1;
        }

        Generics<?, ?>[] Generic_vector = new Generics[ vector_1.length + vector_2.length ];

        for( int i = 0; i < vector_1.length ; i++ ){
            Generics< ?, ? > a = new Generics<>( i, vector_1[i] );
            Generics< ?, ? > b = new Generics<>( i + vector_2.length, vector_2[i] );
            Generic_vector[ i ] = vector_1[ i ];
            Generic_vector[ i + vector_1.length ] = vector_2[ i ];
        }

        Merge sorter = new Merge();

        final long startTime = System.currentTimeMillis();
        sorter.sort( Generic_vector );
        final long endTime = System.currentTimeMillis();

        System.out.println( "Tempo total de execução:" + ( endTime - startTime ) );

        int middle = ( Generic_vector.length - 1 ) / 2;
        if ( Generic_vector.length % 2 == 0 ){
            return ( (double) Generic_vector[middle].getValue() + (double) Generic_vector[middle].getValue() ) / 2 ;
        } else {
            return (double) Generic_vector[middle].getValue();
        }
    }
}
