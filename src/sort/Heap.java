package sort;

import structs.Generics;

public class Heap extends Sorter {
    @Override
    public void sort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;
        heapSort( vector );
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;
        invertedHeapSort( vector );
    }

    private void maxHeapfy( Generics<?, ?>[] vector, int index, int size ){
        int left = 2 * index; this.movements++;
        int right = 2 * index + 1; this.movements++;
        int bigger;

        if ( left <= size && vector[ left ].compareTo( vector[ index ] ) > 0 ){ this.comparisons++; this.comparisons++;
            bigger = left; this.movements++;
        } else { this.comparisons++;
            bigger = index; this.movements++;
        }

        if ( right <= size && vector[ right ].compareTo( vector[ bigger ] ) > 0 ){ this.comparisons++; this.comparisons++;
            bigger = right; this.movements++;
        }

        if ( bigger != index ){ this.comparisons++;
            Generics<?, ?> temp = vector[ bigger ]; this.movements++;
            vector[ bigger ] = vector[ index ]; this.movements++;
            vector[ index ] = temp; this.movements++;

            maxHeapfy( vector, bigger, size );
        }
    }

    public void buildMaxHeap( Generics<?, ?>[] vector, int size ){
        int chao = (int) Math.floor( (double) size / 2 ); this.movements++;

        for ( int i = chao; i >= 0; i-- ){ this.movements++; this.comparisons++; this.movements++;
            maxHeapfy( vector, i, size );
        }
    }

    private void heapSort( Generics<?, ?>[] vector ){
        buildMaxHeap( vector, vector.length - 1 );

        for ( int i = vector.length - 1; i >= 1; i-- ){ this.movements++; this.comparisons++; this.movements++;
            Generics<?, ?> temp = vector[ 0 ]; this.movements++;
            vector[ 0 ] = vector[ i ]; this.movements++;
            vector[ i ] = temp; this.movements++;

            maxHeapfy( vector, 0, i - 1 );
        }
    }

    private void minHeapfy( Generics<?, ?>[] vector, int index, int size ){
        int left = 2 * index; this.movements++;
        int right = 2 * index + 1; this.movements++;
        int smaller;

        if ( left <= size && vector[ left ].compareTo( vector[ index ] ) < 0 ){ this.comparisons++; this.comparisons++;
            smaller = left; this.movements++;
        } else { this.comparisons++;
            smaller = index; this.movements++;
        }

        if ( right <= size && vector[ right ].compareTo( vector[ smaller ] ) < 0 ){ this.comparisons++; this.comparisons++;
            smaller = right; this.movements++;
        }

        if ( smaller != index ){ this.comparisons++;
            Generics<?, ?> temp = vector[ smaller ]; this.movements++;
            vector[ smaller ] = vector[ index ]; this.movements++;
            vector[ index ] = temp; this.movements++;

            minHeapfy( vector, smaller, size );
        }
    }

    public void buildMinHeap( Generics<?, ?>[] vector, int size ){
        int chao = (int) Math.floor( (double) size / 2 ); this.movements++;

        for ( int i = chao; i >= 0; i-- ){ this.movements++; this.comparisons++; this.movements++;
            minHeapfy( vector, i, size );
        }
    }

    private void invertedHeapSort( Generics<?, ?>[] vector ){
        buildMinHeap( vector, vector.length - 1 );

        for ( int i = 0; i < vector.length; i++ ){ this.movements++; this.comparisons++; this.movements++;
            Generics<?, ?> temp = vector[ 0 ]; this.movements++;
            vector[ 0 ] = vector[ i ]; this.movements++;
            vector[ i ] = temp; this.movements++;

            minHeapfy( vector, i, vector.length - 1 );
        }
    }
}
