package sort;

import structs.Generics;

public class Insert extends Sorter{

    public Insert(){
        super();
        this.name = "Insert Sort";
    }

    @Override
    public void sort(Generics<?, ?>[] vector) {
        int i, j;
        Generics<?, ?> key;

        for ( j = 1; j < vector.length; j++ ){ this.movements++; this.comparisons++; this.movements++;
            key = vector[ j ]; this.movements++;

            i = j - 1; this.movements++;

            while ( i >= 0 && vector[i].compareTo( key ) > 0 ){ this.comparisons++; this.comparisons++;
                vector[ i + 1 ] = vector[ i ]; this.movements++;
                i--; this.movements++;
            }

            vector[ i + 1 ] = key; this.movements++;
        }
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        int i, j;
        Generics<?, ?> key;

        for ( j = 1; j < vector.length; j++ ){ this.movements++; this.comparisons++; this.movements++;
            key = vector[ j ]; this.movements++;

            i = j - 1; this.movements++;

            while ( i >= 0 && vector[i].compareTo( key ) < 0 ){ this.comparisons++; this.comparisons++;
                vector[ i + 1 ] = vector[ i ]; this.movements++;
                i--; this.movements++;
            }

            vector[ i + 1 ] = key; this.movements++;
        }
    }

    public void gap_sort(Generics<?, ?>[] vector, int start, int end) {
        int i, j;
        Generics<?, ?> key;

        for ( j = start + 1; j < end; j++ ){ this.movements++; this.comparisons++; this.movements++;
            key = vector[ j ]; this.movements++;

            i = j - 1; this.movements++;

            while ( i >= 0 && vector[i].compareTo( key ) > 0 ){ this.comparisons++; this.comparisons++;
                vector[ i + 1 ] = vector[ i ]; this.movements++;
                i--; this.movements++;
            }

            vector[ i + 1 ] = key; this.movements++;
        }
    }

    public void inverted_gap_sort(Generics<?, ?>[] vector, int start, int end) {
        int i, j;
        Generics<?, ?> key;

        for ( j = start + 1; j < end; j++ ){ this.movements++; this.comparisons++; this.movements++;
            key = vector[ j ]; this.movements++;

            i = j - 1; this.movements++;

            while ( i >= 0 && vector[i].compareTo( key ) <= 0 ){ this.comparisons++; this.comparisons++;
                vector[ i + 1 ] = vector[ i ]; this.movements++;
                i--; this.movements++;
            }

            vector[ i + 1 ] = key; this.movements++;
        }
    }
}
