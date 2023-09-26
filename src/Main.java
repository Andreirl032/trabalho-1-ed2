import sort.Heap;
import sort.Merge;
import structs.Generics;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Generics<?, ?>[] vector = genVector( 100 );
        printVector( vector );

        Merge sorter = new Merge();

        final long startTime = System.currentTimeMillis();
        sorter.sort( vector );
        final long endTime = System.currentTimeMillis();

        printVector( vector );
        System.out.println( "\n\n\nTempo total de execução: " + ( endTime - startTime ) );
    }

    public static void printVector( Generics<?, ?>[] vector ){
        System.out.print( "[ " );
        for ( Generics<?, ?> e : vector ){
            System.out.print( e.getValue() + " " );
        }
        System.out.println( "]" );
    }

    public static Generics<?, ?>[] genVector( int size ){
        Generics<?, ?>[] vector = new Generics<?, ?>[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = new Generics<Integer, Integer >( Math.abs( random.nextInt( 0, 200) ), Math.abs( random.nextInt( 0, 200 ) ) );
        }

        return vector;
    }
}