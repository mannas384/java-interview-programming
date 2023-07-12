package questions.programming;

public class MergeTwoSortedArrays {


    public static void main(String[] args) {
        int[] arr1 = {11, 34, 66, 75};
        int n1 = arr1.length;
        int[] arr2 = {1, 5, 19, 50, 89, 100};
        int n2 = arr2.length;
        int[] merge = new int[n1 + n2];
        int i = 0, j = 0, k = 0, x;

        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                merge[k++] = arr1[i++];
            }
            else{
                merge[k++] = arr2[j++];
            }

        }
        while (i < n1)
            merge[k++] = arr1[i++];
        while (j < n2)
            merge[k++] = arr2[j++];
        System.out.print("Array after merging: ");
        for (x = 0; x < n1 + n2; x++)
            System.out.print(merge[x] + " ");
    }
}
