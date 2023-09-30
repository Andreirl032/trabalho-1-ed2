package questions.Questao1;

import static questions.Questao1.HeapSort.heapSort;

public class Main {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        int []v1 = new int[100_000_000];
        for(int i=0;i<v1.length;i++){
            v1[i] = 100_000_000 - i;
        }
        int []p = {2,3,6,10,5};
        int maior = p[0];
        for (int i=1;i<p.length;i++){
            if(maior<p[i]){
                maior=p[i];
            }
        }
        int []newArray = new int[p.length];
        heapSort(v1,maior);
        System.out.print("O = [ ");
        for(int i=0;i<p.length;i++){
            newArray[i] = v1[v1.length-p[i]];
            System.out.print(newArray[i]);
            if(i+1<p.length){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        final long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução: "+(endTime-startTime)+" ms");
    }}