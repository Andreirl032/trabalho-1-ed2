package sort;

import structs.Generics;

public class Shell extends Sorter {

    public Shell(){
        super();
        this.name = "Shell Sort";
    }

    @Override
    public void sort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;

        int h, j;

        Generics<?, ?> temp;

        for ( h = 1; h < vector.length; h = ( 2 * h ) + 1 ){
            this.movements++; this.comparisons++; this.movements++;
        }

        while ( h > 0 ){ this.comparisons++;
            h = ( h - 1 ) / 2; this.movements++;

            for ( int i = h; i < vector.length; i++ ){ this.movements++; this.comparisons++; this.movements++;
                temp = vector[ i ]; this.movements++;
                j = i; this.movements++;

                while( vector[ j - h ].compareTo( temp ) > 0 ){
                    vector[ j ] = vector[ j - h ]; this.movements++;
                    j = j - h; this.movements++;
                    if ( j < h ){ this.comparisons++;
                        break;
                    }
                }

                vector[ j ] = temp; this.movements++;
            }
        }
    }

    @Override
    public void invertedSort(Generics<?, ?>[] vector) {
        this.vector_size = vector.length;

        int h, j;

        Generics<?, ?> temp;

        for ( h = 1; h < vector.length; h = ( 2 * h ) + 1 ){
            this.movements++; this.comparisons++; this.movements++;
        }

        while ( h > 0 ){ this.comparisons++;
            h = ( h - 1 ) / 2; this.movements++;

            for ( int i = h; i < vector.length; i++ ){ this.movements++; this.comparisons++; this.movements++;
                temp = vector[ i ]; this.movements++;
                j = i; this.movements++;

                while( vector[ j - h ].compareTo( temp ) < 0 ){ this.comparisons++;
                    vector[ j ] = vector[ j - h ]; this.movements++;
                    j = j - h; this.movements++;
                    if ( j < h ){ this.comparisons++;
                        break;
                    }
                }

                vector[ j ] = temp; this.movements++;
            }
        }
    }
}
