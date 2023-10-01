package questions.Questao4;

import sort.BHSI;
import structs.Generics;

import java.util.Random;

import Ord.util.Report;

public class Main {
    public static Generics<?, ?>[] genVector(int size ){
        Generics<?, ?>[] vector = new Generics<?, ?>[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = new Generics<Integer, Integer >( Math.abs( random.nextInt( 0, size) ), Math.abs( random.nextInt( 0, size ) ) );
        }

        return vector;
    }
    public static void main(String[] args) {
        Generics<?, ?>[] vector;
        BHSI sorter = new BHSI();

        for ( int i = 91; i <= 100; i++ ){
            vector = genVector( 500_000 );

            final long startTime = System.currentTimeMillis();
            sorter.porcento_E( vector, i );
            final long endTime = System.currentTimeMillis();

            System.out.println( "Movimentações: " + sorter.getMovements() );
            System.out.println( "Comparações: " + sorter.getComparisons() );

            System.out.println( "\nTempo total de execução: " + ( endTime - startTime ) );
        }

        Report.soft_hard_content();
    }
}