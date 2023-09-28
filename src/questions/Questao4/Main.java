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

        Random random = new Random();

        for ( int i = 1; i <= 100; i++ ){
            vector = genVector( 100_000 );

            final long startTime = System.currentTimeMillis();
            sorter.porcento_E( vector, i );
            final long endTime = System.currentTimeMillis();

            System.out.println( "\nTempo total de execução: " + ( endTime - startTime ) );
        }

        Report.soft_hard_content();
    }
}