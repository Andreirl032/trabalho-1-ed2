package questions.Questao3;

import sort.Counting;
import sort.Merge;
import structs.Generics;

import java.util.Objects;

import static java.util.Arrays.binarySearch;

public class DistT {
    private long comparisons;
    private long movements;

    public long getComparisons(){
        return this.comparisons;
    }

    public long getMovements(){
        return this.movements;
    }

    public Generics<?, Integer>[] n_2( Generics<?, Integer>[] vector, int T ){
        this.movements = 0;
        this.comparisons = 0;
        Merge sorter = new Merge(); this.movements++;
        sorter.sort( vector );

        Generics<?, Integer>[] answer;
        answer = new Generics[2]; this.movements++;

        Generics<?, Integer> auxiliar;

        for ( Generics<?, Integer> ia : vector ) { this.movements++;
            auxiliar = new Generics<>(ia.getKey(), ia.getValue() + T); this.movements++;
            for ( Generics<?, Integer> ib : vector ){ this.movements++;
                if ( ia == ib ){
                    continue;
                }
                if ( ib.getValue().equals( auxiliar.getValue() ) ){ this.comparisons++;
                    answer[ 0 ] = ia; this.movements++;
                    answer[ 1 ] = ib; this.movements++;
                    this.movements += sorter.getMovements();
                    this.comparisons += sorter.getComparisons();
                    return answer;
                }
            }
        }

        this.movements += sorter.getMovements();
        this.comparisons += sorter.getComparisons();

        return null;
    }
    public Generics<?, Integer>[] n_logn( Generics<?, Integer>[] vector, int T ){
        this.movements = 0;
        this.comparisons = 0;
        Merge sorter = new Merge(); this.movements++;
        sorter.sort( vector );

        Generics<?, Integer>[] answer;
        answer = new Generics[2]; this.movements++;

        int b;
        Generics<?, Integer> auxiliar;

        for (Generics<?, Integer> integerGenerics : vector) { this.movements++;
            auxiliar = new Generics<>(integerGenerics.getKey(), integerGenerics.getValue() + T); this.movements++;
            b = binarySearch(vector, auxiliar); this.movements++;
            if (b >= 0) { this.comparisons++;
                answer[0] = integerGenerics; this.movements++;
                answer[1] = vector[b]; this.movements++;
                this.movements += sorter.getMovements();
                this.comparisons += sorter.getComparisons();
                return answer;
            }
        }

        this.movements += sorter.getMovements();
        this.comparisons += sorter.getComparisons();

        return null;
    }
}
