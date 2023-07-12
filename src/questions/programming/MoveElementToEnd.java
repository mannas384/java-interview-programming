package questions.programming;

import java.util.Arrays;

public class MoveElementToEnd {


    public static void main(String[] args) {
        int[] arr = {2,1,2,2,3,2,4,2};
        int toMove = 2;

        int i=0;
        int j= arr.length-1;
        while(i<j){

            while (i<j && arr[j]==toMove){
                j--;
            }
            if(arr[i]==toMove){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;

            }
            i++;
        }
        Arrays.stream(arr).forEach(System.out::println);


    }
}
