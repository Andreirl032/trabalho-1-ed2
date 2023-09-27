package questions.Questao2;

import sort.Merge;
import sort.Counting;
import structs.Generics;

public class Mediana {
    //Atributos
//    int []vetorInt;
//    String []vetorString;

    public static double achaMediana( int[] vetor_1, int[] vetor_2 ){
        if( vetor_1.length != vetor_2.length){
            System.out.println("ERRO! OS VETORES DEVEM SER DE MESMO TAMANHO");
            return 1;
        }

        Generics<?, ?>[] Generic_vector = new Generics[ vetor_1.length + vetor_2.length ];

        for( int i = 0; i < vetor_1.length ; i++ ){
            Generics< ?, ? > a = new Generics<>( i, vetor_1[i] );
            Generics< ?, ? > b = new Generics<>( i + vetor_2.length, vetor_2[i] );
            Generic_vector[ i ] = a;
            Generic_vector[ i + vetor_1.length ] = b;
        }

        Counting sorter = new Counting();

        final long startTime2 = System.currentTimeMillis();
        sorter.sort( Generic_vector );
        final long endTime2 = System.currentTimeMillis();

        System.out.println( "Tempo total de execução:" + ( endTime2 - startTime2 ) );

        int middle = ( Generic_vector.length - 1 ) / 2;
        if ( Generic_vector.length % 2 == 0 ){
            return ( (double) Generic_vector[middle].getValue() + (double) Generic_vector[middle].getValue() ) / 2 ;
        } else {
            return (double) Generic_vector[middle].getValue();
        }
    }

//    public static void achaMediana( String[] vetor_1, String[] vetor_2 ){
//        if( vetor_1.length!= vetor_2.length){
//            System.out.println("ERRO! OS VETORES DEVEM SER DE MESMO TAMANHO");
//            return;
//        }
//
//
//        String[] vetorString = new String[vetor_1.length+vetor_2.length];
//        for(int i=0;i<vetor_1.length;i++){
//            vetorString[i]=vetor_1[i];
//        }
//        for(int i=0;i<vetor_1.length;i++){
//            vetorString[i+vetor_1.length+1]=vetor_2[i];
//        }
//
////        ordenarVetorString(vetorString);
//    }

}
