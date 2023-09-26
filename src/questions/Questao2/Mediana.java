package questions.Questao2;

import static questions.Questao2.MergeSort.mergeSort;
import static sort.Counting.countingSort;

public class Mediana {
    //Atributos
//    int []vetorInt;
//    String []vetorString;

    public static double achaMediana( int[] vetor_1, int[] vetor_2 ){
        if( vetor_1.length!= vetor_2.length){
            System.out.println("ERRO! OS VETORES DEVEM SER DE MESMO TAMANHO");
            return 1;
        }

        int[] vetorInt = new int[vetor_1.length+vetor_2.length];

        System.out.print("\n\n[ ");
        for( int i = 0; i < vetor_1.length ; i++ ){
            vetorInt[i]=vetor_1[i];
            vetorInt[i+vetor_1.length]=vetor_2[i];

//            System.out.print( vetorInt[i] +  " " + vetorInt[i + vetor_1.length] + " ");
        }
        System.out.print(" ]");

//        final long startTime = System.currentTimeMillis();
//        vetorInt = mergeSort( vetorInt );
//        final long endTime = System.currentTimeMillis();

        final long startTime2 = System.currentTimeMillis();
        vetorInt = countingSort( vetorInt );
        final long endTime2 = System.currentTimeMillis();

//        System.out.print("\n\n[ ");
//        for( int i = 0; i < vetor_1.length ; i++ ){
//            System.out.print( vetorInt[i] +  " ");
//        }
//        System.out.println(" ]");

//        System.out.println( "Tempo total de execução:" + ( endTime - startTime ) );
        System.out.println( "Tempo total de execução:" + ( endTime2 - startTime2 ) );


        return ((double)vetorInt[(vetorInt.length/2)]+vetorInt[vetorInt.length/2+1])/2;
    }

    public static void achaMediana( String[] vetor_1, String[] vetor_2 ){
        if( vetor_1.length!= vetor_2.length){
            System.out.println("ERRO! OS VETORES DEVEM SER DE MESMO TAMANHO");
            return;
        }


        String[] vetorString = new String[vetor_1.length+vetor_2.length];
        for(int i=0;i<vetor_1.length;i++){
            vetorString[i]=vetor_1[i];
        }
        for(int i=0;i<vetor_1.length;i++){
            vetorString[i+vetor_1.length+1]=vetor_2[i];
        }

//        ordenarVetorString(vetorString);
    }

}
