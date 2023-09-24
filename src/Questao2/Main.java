package Questao2;

import java.lang.Math;

import static Questao2.Mediana.achaMediana;

public class Main {
    public static int[] geraVetor( int n ){
        int[] vetor = new int[ n ];
        for( int i = 0 ; i<n; i++ ){
//            vetor[i] = (int)(Math.random()*n)+1;
            vetor[i]=i;
        }
        return vetor;
    }

    public static void main(String[] args) {
        int []vetor1 = new int[5000000];
        int []vetor2 = new int[5000000];
        for(int i=4999999;i>=0;i--){
            vetor1[4999999-i]=i+5000000;
            vetor2[4999999-i]=i;
        }
        double mediana = achaMediana(vetor1,vetor2);
        System.out.println("Mediana: "+mediana);
    }}