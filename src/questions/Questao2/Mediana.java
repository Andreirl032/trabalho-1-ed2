package questions.Questao2;

import sort.Merge;
import sort.Counting;
import structs.Generics;

public class Mediana {

    public static double achaMediana( Generics<?, ?>[] vector_1, Generics<?, ?>[] vector_2 ){

        Generics<?, ?>[] Generic_vector = new Generics[ vector_1.length + vector_2.length ];

        for( int i = 0; i < vector_1.length ; i++ ){
            Generics< ?, ? > a = new Generics<>( i, vector_1[i] );
            Generics< ?, ? > b = new Generics<>( i + vector_2.length, vector_2[i] );
            Generic_vector[ i ] = vector_1[ i ];
            Generic_vector[ i + vector_1.length ] = vector_2[ i ];
        }

        Merge sorter = new Merge();

        int middle = ( Generic_vector.length - 1 ) / 2;
        if ( Generic_vector.length % 2 == 0 ){
            if ( Generic_vector[middle].getValue() instanceof String  ){
                int soma_l = 0, soma_r = 0;

                for ( char c : ((String) Generic_vector[middle].getValue()).toCharArray() ){
                    soma_l += (int) c;
                }
                for ( char c : ((String) Generic_vector[middle + 1].getValue()).toCharArray() ){
                    soma_r += (int) c;
                }

                return ( ( double ) soma_l + ( double ) soma_r ) / 2;
            }
            return ( (double) Integer.parseInt( Generic_vector[middle].getValue().toString() ) + (double) Integer.parseInt( Generic_vector[middle + 1].getValue().toString() ) ) / 2 ;
        } else {
            if ( Generic_vector[middle].getValue() instanceof String  ){
                int soma_l = 0;

                for ( char c : ((String) Generic_vector[middle].getValue()).toCharArray() ){
                    soma_l += (int) c;
                }
                return ( double ) soma_l;
            }
            return (double) Generic_vector[middle].getValue();
        }
    }
}
