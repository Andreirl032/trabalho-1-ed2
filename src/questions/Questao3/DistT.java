package questions.Questao3;

import sort.Counting;
import sort.Merge;
import structs.Generics;

import java.util.Objects;

import static java.util.Arrays.binarySearch;

public class DistT {
    public static Generics<?, Integer>[] n_2( Generics<?, Integer>[] vector, int T ){
        Merge sorter = new Merge();
        sorter.sort( vector );

        Generics<?, Integer>[] answer;
        answer = new Generics[2];

        Generics<?, Integer> auxiliar;

        for ( Generics<?, Integer> ia : vector ) {
            auxiliar = new Generics<>(ia.getKey(), ia.getValue() + T);
            for ( Generics<?, Integer> ib : vector ){
                if ( ib.getValue().equals( auxiliar.getValue() ) ){
                    answer[ 0 ] = ia;
                    answer[ 1 ] = ib;
                    return answer;
                }
            }
        }

        return null;
    }
    public static Generics<?, Integer>[] n_logn( Generics<?, Integer>[] vector, int T ){
        Merge sorter = new Merge();
        sorter.sort( vector );

        Generics<?, Integer>[] answer;
        answer = new Generics[2];

        int b;
        Generics<?, Integer> auxiliar;

        for (Generics<?, Integer> integerGenerics : vector) {
            auxiliar = new Generics<>(integerGenerics.getKey(), integerGenerics.getValue() + T);
            b = binarySearch(vector, auxiliar);
            if (b >= 0) {
                answer[0] = integerGenerics;
                answer[1] = vector[b];
                return answer;
            }
        }

        return null;
    }
}
