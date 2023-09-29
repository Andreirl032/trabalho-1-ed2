package questions.Questao1;

public class NewArray {
    private int[] v1;
    private int[] p;

    public NewArray(int[] v1, int[] p) {
        this.v1 = v1;
        this.p = p;
    }

    static int[] countSort(int[] array){
        int size = array.length;
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
        return array;
    }

    public static int[] makeNewArray(int v1[],int p[]){
        int []newArray = new int[p.length];
        int []sortedV1 = countSort(v1);
        int v1_size = v1.length;
        for(int i=0;i<p.length;i++){
            newArray[i] = sortedV1[v1_size-p[i]];
        }
        return newArray;
    }
}