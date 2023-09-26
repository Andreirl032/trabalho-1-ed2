package sort;

import structs.Generics;

public class Counting extends Sorter {

    @Override
    public void sort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;
        if ( vector[0].getValue() instanceof Integer ){

        }
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;
        if ( vector[0].getValue() instanceof Integer ){

        }
    }
    public void counting( Generics<?, Integer >[] vector){
        int n = vector.length;

        // The output character array that will have sorted
        // arr
        int output[] = new int[n];

        // Create a count array to store count of individual
        // characters and initialize count array as 0
        int count[] = new int[10000000];
        for (int i = 0; i < 10000000; ++i){
            count[i] = 0;}

        // store count of each character
        for (int i = 0; i < n; ++i){
            ++count[vector[i].getValue()];}

        // Change count[i] so that count[i] now contains
        // actual position of this character in output array
        for (int i = 1; i <= 9999999; ++i){
            count[i] += count[i - 1];}

        // Build the output character array
        // To make it stable we are operating in reverse
        // order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[vector[i].getValue()] - 1] = vector[i].getValue();
            --count[vector[i].getValue()];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i < n; ++i){
            Generics<?, Integer> copy= new Generics<>( vector[i].getKey(), output[i] );
            vector[i] = copy;
        }
    }
}
