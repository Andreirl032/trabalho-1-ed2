package questions.Questao3;

import structs.Generics;

import java.util.Random;

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
        Generics<?, ?>[] vector = genVector( 2_000_000 );

        Random random = new Random();

        int T, luck;
        for ( int i = 0; i <= 100; i++ ){
            T = i;
            luck = random.nextInt(1, 2);

            final long startTime = System.currentTimeMillis();
//            if ( luck == 1 ){
//                DistT.n_logn( ( Generics<?, Integer>[] ) vector, T );
//            } else {
//                DistT.n_2( ( Generics<?, Integer>[] ) vector, T );
//            }
            DistT.n_2( ( Generics<?, Integer>[] ) vector, T );
            final long endTime = System.currentTimeMillis();

            System.out.println( "\nTempo total de execução: " + ( endTime - startTime ) );
        }
    }}
