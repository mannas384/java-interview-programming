import java.util.Arrays;

public class PallindromCountOfString {

  public static int[][] dp = new int[1001][1001];
    public static void main(String[] args) {
        String s = "aabaa";

        System.out.println(noOfCount(s));
    }

    private static int noOfCount(String s) {

        int n = s.length();
        int count =0;
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isPal(s,i,j)!=0){
                    count++;
                }
            }
        }
        return count;
    }

    private static int isPal(String s, int i, int j) {

        if(i>j) return 1;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)!=s.charAt(j)){
            return 0;
        }
        return isPal(s,i+1,j-1);
    }
}
