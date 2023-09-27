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
        int left = 2 * index;
        int right = 2 * index + 1;
        int bigger;

        if ( left <= size && vector[ left ].compareTo( vector[ index ] ) > 0 ){
            bigger = left;
        } else {
            bigger = index;
        }

        if ( right <= size && vector[ right ].compareTo( vector[ bigger ] ) > 0 ){
            bigger = right;
        }

        if ( bigger != index ){
            Generics<?, ?> temp = vector[ bigger ];
            vector[ bigger ] = vector[ index ];
            vector[ index ] = temp;

            maxHeapfy( vector, bigger, size );
        }
    }

    public void buildMaxHeap( Generics<?, ?>[] vector, int size ){
        int chao = (int) Math.floor( (double) size / 2 );

        for ( int i = chao; i >= 0; i-- ){
            maxHeapfy( vector, i, size );
        }
    }

    private void heapSort( Generics<?, ?>[] vector ){
        buildMaxHeap( vector, vector.length - 1 );

        for ( int i = vector.length - 1; i >= 1; i-- ){
            Generics<?, ?> temp = vector[ 0 ];
            vector[ 0 ] = vector[ i ];
            vector[ i ] = temp;

            maxHeapfy( vector, 0, i - 1 );
        }
    }

    private void minHeapfy( Generics<?, ?>[] vector, int index, int size ){
        int left = 2 * index;
        int right = 2 * index + 1;
        int smaller;

        if ( left <= size && vector[ left ].compareTo( vector[ index ] ) < 0 ){
            smaller = left;
        } else {
            smaller = index;
        }

        if ( right <= size && vector[ right ].compareTo( vector[ smaller ] ) < 0 ){
            smaller = right;
        }

        if ( smaller != index ){
            Generics<?, ?> temp = vector[ smaller ];
            vector[ smaller ] = vector[ index ];
            vector[ index ] = temp;

            minHeapfy( vector, smaller, size );
        }
    }

    public void buildMinHeap( Generics<?, ?>[] vector, int size ){
        int chao = (int) Math.floor( (double) size / 2 );

        for ( int i = chao; i >= 0; i-- ){
            minHeapfy( vector, i, size );
        }
    }

    private void invertedHeapSort( Generics<?, ?>[] vector ){
        buildMinHeap( vector, vector.length - 1 );

        for ( int i = 0; i < vector.length; i++ ){
            Generics<?, ?> temp = vector[ 0 ];
            vector[ 0 ] = vector[ i ];
            vector[ i ] = temp;

            minHeapfy( vector, i, vector.length - 1 );
        }
    }
}
