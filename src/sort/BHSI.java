package sort;

import structs.Generics;

public class BHSI extends Sorter {
    @Override
    public void sort(Generics<?, ?>[] vector) {
        porcento_E( vector, 3 );
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        inverted_Porcento_E( vector, 3 );
    }

    public void porcento_E( Generics<?, ?>[] vector, int E ){
        Heap heap = new Heap();

        heap.buildMinHeap( vector, vector.length - 1 );
        int porcento_E = vector.length % E;

        Select select = new Select();
        select.gap_sort( vector, 0, porcento_E );
        select.gap_sort( vector, vector.length - 1 - porcento_E, vector.length );

        Insert insert = new Insert();
        insert.gap_sort( vector, porcento_E + 1, vector.length - porcento_E);
    }

    public void inverted_Porcento_E( Generics<?, ?>[] vector, int E ){
        Heap heap = new Heap();

        heap.buildMaxHeap( vector, vector.length - 1 );
        int porcento_E = vector.length % E;

        Select select = new Select();
        select.inverted_gap_sort( vector, 0, porcento_E );
        select.inverted_gap_sort( vector, vector.length - 1 - porcento_E, vector.length );

        Insert insert = new Insert();
        insert.inverted_gap_sort( vector, porcento_E + 1, vector.length - porcento_E);
    }
}
