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
}
