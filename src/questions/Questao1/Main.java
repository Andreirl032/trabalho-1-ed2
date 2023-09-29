package questions.Questao1;

import static questions.Questao1.NewArray.makeNewArray;

public class Main {
    public static void main(String[] args) {
        int v1[] = {3,6,8,1,5,9,2,3};
        int p[] = {2,5,3};
        int newArray[] = makeNewArray(v1,p);
        System.out.print("O = [  ");
        for(int e:newArray){
            System.out.print(e);
            System.out.print("  ");
        }
        System.out.println("]");
}}