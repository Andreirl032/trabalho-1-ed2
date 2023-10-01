package questions.Questao3;

import Ord.util.Report;
import structs.Generics;

import java.util.Random;

public class Main {
    public static Generics<?, ?>[] genVector(int size ){
        Generics<?, ?>[] vector = new Generics<?, ?>[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = new Generics<Integer, Integer >( random.nextInt(  ) , random.nextInt(  ) );
        }

        return vector;
    }
    public static void main(String[] args) {
        DistT dist = new DistT();
        Generics<?, ?>[] vector = genVector( 1_000_000 );
        System.out.println("Achar a distância com 1_000_000 elementos no vetor");
        Generics<?, Integer>[] answer;

        int T;
        for ( int i = 0; i <= 100; i++ ){
            T = i;

            System.out.println("\nDistância T : " + T);

            long startTime = System.currentTimeMillis();
            answer = dist.n_logn( ( Generics<?, Integer>[] ) vector, T );
            long endTime = System.currentTimeMillis();
            System.out.println( "\nAlgoritmo n logn" );
            System.out.println( "Movimentações da ordenação e de busca: " + dist.getMovements() );
            System.out.println( "Comparações da ordenação e de busca: " + dist.getComparisons() );
            if ( answer != null)
                System.out.println( "Resposta: A = " + answer[0].getValue() + " B = " + answer[1].getValue() );
            System.out.println( "Tempo total de execução: " + ( endTime - startTime ) );

            startTime = System.currentTimeMillis();
            answer = dist.n_2( ( Generics<?, Integer>[] ) vector, T );
            endTime = System.currentTimeMillis();
            System.out.println( "\nAlgoritmo n²" );
            System.out.println( "Movimentações da ordenação e de busca: " + dist.getMovements() );
            System.out.println( "Comparações da ordenação e de busca: " + dist.getComparisons() );
            if ( answer != null)
                System.out.println( "Resposta: A = " + answer[0].getValue() + " B = " + answer[1].getValue() );
            System.out.println( "Tempo total de execução: " + ( endTime - startTime ) );
        }
        Report.soft_hard_content();
    }
}
