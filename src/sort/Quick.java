package sort;

import structs.Generics;

public class Quick extends Sorter {

    public Quick(){
        super();
        this.name = "Quick Sort";
    }

    @Override
    public void sort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;

        quick( vector, 0, vector.length - 1 );
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;

        invertedQuick( vector, 0, vector.length - 1 );
    }

    private void invertedQuick( Generics<?, ?>[] vector, int start, int end ){
        if ( start < end ){ this.comparisons++;
            int pivotPosition = invertedPartition( vector, start, end ); this.movements++;

            invertedQuick( vector, start, pivotPosition - 1 ); this.movements++;
            invertedQuick( vector, pivotPosition + 1, end ); this.movements++;
        }
    }

    private int invertedPartition( Generics<?, ?>[] vector, int start, int end ){
        Generics<?, ?> pivot = vector[ start ]; this.movements++;
        int i = start + 1; this.movements++;
        int f = end; this.movements++;

        while ( i <= f ){ this.comparisons++;
            if ( vector[i].compareTo( pivot ) > 0 ){ this.comparisons++;
                i++; this.movements++;
            } else if ( vector[f].compareTo( pivot ) <= 0 ){ this.comparisons++;
                f--; this.movements++;
            } else {
                Generics<?, ?> switch_ = vector[ i ]; this.movements++;
                vector[ i ] = vector[ f ]; this.movements++;
                vector[ f ] = switch_; this.movements++;
                i++; this.movements++;
                f--; this.movements++;
            }
        }
        vector[ start ] = vector[ f ]; this.movements++;
        vector[ f ] = pivot; this.movements++;
        return f;
    }

    private void quick( Generics<?, ?>[] vector, int start, int end ){
        if ( start < end ){ this.comparisons++;
            int pivotPosition = partition( vector, start, end ); this.movements++;

            quick( vector, start, pivotPosition - 1 ); this.movements++;
            quick( vector, pivotPosition + 1, end ); this.movements++;
        }
    }

    private int partition( Generics<?, ?>[] vector, int start, int end ){
        Generics<?, ?> pivot = vector[ start ]; this.movements++;
        int i = start + 1; this.movements++;
        int f = end; this.movements++;

        while ( i <= f ){ this.comparisons++;
            if ( vector[i].compareTo( pivot ) <= 0 ){ this.comparisons++;
                i++; this.movements++;
            } else if ( vector[f].compareTo( pivot ) > 0 ){ this.comparisons++;
                f--; this.movements++;
            } else {
                Generics<?, ?> switch_ = vector[ i ]; this.movements++;
                vector[ i ] = vector[ f ]; this.movements++;
                vector[ f ] = switch_; this.movements++;
                i++; this.movements++;
                f--; this.movements++;
            }
        }
        vector[ start ] = vector[ f ]; this.movements++;
        vector[ f ] = pivot; this.movements++;
        return f;
    }
}
