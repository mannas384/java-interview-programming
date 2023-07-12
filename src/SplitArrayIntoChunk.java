import java.util.ArrayList;
import java.util.List;

public class SplitArrayIntoChunk {

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int[] a = new int[3];
        List<int[]> list = new ArrayList<>();
        int j =0;
        int k =0;
        for(int i = 0; i<array.length;i++){
            if(k<3){
                a[j]= array[i];
                j++;
                k++;
            }else{
                list.add(a);
                a = new int[3];
                j=0;
                k=0;
                a[j]=array[i];
                j++;
                k++;


            }
        }

        System.out.println(list.toString());
    }
}
