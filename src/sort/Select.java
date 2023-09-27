package sort;

import structs.Generics;

public class Select extends Sorter {

    public Select(){
        super();
        this.name = "Select Sort";
    }

    @Override
    public void sort(Generics<?, ?>[] vector) {
        for ( int i = 0; i < vector.length - 1; i++ ) { this.movements++; this.comparisons++; this.movements++;
            int min = i; this.movements++;

            for ( int j = i + 1; j < vector.length; j++ ){ this.movements++; this.comparisons++; this.movements++;
                if ( vector[ j ].compareTo( vector[ min ] ) < 0 ){ this.comparisons++;
                    min = j; this.movements++;
                }
            }

            Generics<?, ?> temp = vector[ min ]; this.movements++;
            vector[ min ] = vector[ i ]; this.movements++;
            vector[ i ] = temp; this.movements++;
        }
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        for ( int i = 0; i < vector.length - 1; i++ ) { this.movements++; this.comparisons++; this.movements++;
            int min = i; this.movements++;

            for ( int j = i + 1; j < vector.length; j++ ){ this.movements++; this.comparisons++; this.movements++;
                if ( vector[ j ].compareTo( vector[ min ] ) > 0 ){ this.comparisons++;
                    min = j; this.movements++;
                }
            }

            Generics<?, ?> temp = vector[ min ]; this.movements++;
            vector[ min ] = vector[ i ]; this.movements++;
            vector[ i ] = temp; this.movements++;
        }
    }

    public void gap_sort(Generics<?, ?>[] vector, int start, int end) {
        for ( int i = start; i < end - 1; i++ ) { this.movements++; this.comparisons++; this.movements++;
            int min = i; this.movements++;

            for ( int j = i + 1; j < vector.length; j++ ){ this.movements++; this.comparisons++; this.movements++;
                if ( vector[ j ].compareTo( vector[ min ] ) < 0 ){ this.comparisons++;
                    min = j; this.movements++;
                }
            }

            Generics<?, ?> temp = vector[ min ]; this.movements++;
            vector[ min ] = vector[ i ]; this.movements++;
            vector[ i ] = temp; this.movements++;
        }
    }

    public void inverted_gap_sort(Generics<?, ?>[] vector, int start, int end) {
        for ( int i = start; i < end - 1; i++ ) { this.movements++; this.comparisons++; this.movements++;
            int max = i; this.movements++;

            for ( int j = i + 1; j < vector.length; j++ ){ this.movements++; this.comparisons++; this.movements++;
                if ( vector[ j ].compareTo( vector[ max ] ) >= 0 ){ this.comparisons++;
                    max = j; this.movements++;
                }
            }

            Generics<?, ?> temp = vector[ max ]; this.movements++;
            vector[ max ] = vector[ i ]; this.movements++;
            vector[ i ] = temp; this.movements++;
        }
    }
}
