package Questao2;

public class SelectionSortInt {
    public static int[] selectionSortInt(int []vetor){
        for(int i=0;i<vetor.length;i++){
            int menor = vetor[i];
            for(int j=i;j<vetor.length;j++){
                if(menor>vetor[j]){
                    menor=vetor[j];
                }
            }
            vetor[i]=menor;
    }
    return vetor;
}
}
