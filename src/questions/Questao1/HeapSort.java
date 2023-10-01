package questions.Questao1;

import structs.Generics;

public class HeapSort {
    private int []v1;
    private int k;

    public HeapSort(int v1[], int k){
        this.v1 = v1;
        this.k = k;
    }

    public static void heapSort(Generics<?, ?>[] arr, int k) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify( arr, n, i );
        }

        for (int i = n - 1; i >= 0; i--) {
            Generics<?, ?> temp = arr[0];
            arr[0] = arr[i];
            arr[ i ] = temp;


            if(k > 1){
                k--;
            } else{
                break;
            }

            heapify( arr, i, 0 );
        }
    }

    static void heapify( Generics<?, ?>[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l].compareTo( arr[largest] ) > 0 )
            largest = l;

        if (r < n && arr[r].compareTo( arr[largest] ) > 0 )
            largest = r;

        if (largest != i) {
            Generics<?, ?> swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public int[] getV1() {
        return v1;
    }

    public void setV1(int[] v1) {
        this.v1 = v1;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
}
