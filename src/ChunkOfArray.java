/******************************************************************************
 Welcome to GDB Online.
 Code, Compile, Run and Debug online from anywhere in world.
 *******************************************************************************/
import java.util.*;

class ChunkOfArray
{
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

		/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/

        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }

    public static List<int[]> splitArray(int[] array, int splitSize) {



        List<int[]> list = new ArrayList<>();
        int i = 0;

        for(i = 0; i+splitSize<=array.length;i+=splitSize){

            int start = i;
            int end = start+splitSize-1;
            int[] a = new int[splitSize];
            for(int j=start;j<=end;j++){
                a[j-start]=array[j];

            }

            list.add(a);

        }
        if(i<array.length){
            int[] a = new int[array.length-i];
            for(int j=i;j<=array.length-1;j++){
                a[j-i]=array[j];

            }
            list.add(a);
        }
        return list;

    }
}


