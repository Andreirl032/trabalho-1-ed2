package questions.Questao2;

import structs.Generics;

import static questions.Questao2.Mediana.achaMediana;

import java.util.Random;

public class Main {
    public static Generics<?, ?>[] gera_vector_inteiro( int size ){
        Generics<?, ?>[] vector = new Generics<?, ?>[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = new Generics<Integer, Integer >( random.nextInt(  ) , random.nextInt(  ) );
        }

        return vector;
    }

    public static Generics<?, ?>[] gera_vector_string( int size, int max_string_size ){
        Generics<?, ?>[] vector = new Generics<?, ?>[ size ];

        Random random = new Random();

        for ( int i = 0; i < vector.length; i++ ){
            vector[ i ] = new Generics<Integer, String >( random.nextInt(  ) , RandomString( max_string_size ) );
        }

        return vector;
    }

    public static String RandomString( int max ) {// Gera strings. Fonte: https://www.programiz.com/java-programming/examples/generate-random-string
        String alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz!@#$%*()_-+=§{}[]ªºÇç:;.><,/?°";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < max; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Generics<?, ?>[] vector1 = gera_vector_inteiro( 500_000 );
        Generics<?, ?>[] vector2 = gera_vector_inteiro( 500_000 );

        double mediana = achaMediana( vector1, vector2 );
        System.out.println("Mediana: "+mediana);

        vector1 = gera_vector_string( 500_000, 32 );
        vector2 = gera_vector_string( 500_000, 32 );

        mediana = achaMediana( vector1, vector2 );

        System.out.println("Mediana: "+mediana);
    }
}