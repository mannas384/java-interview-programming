public class CommonPrograms {

    private static void sortString(String str){
        int[] letters = new int[26];
        for(char c : str.toCharArray()){
            letters[c-'a']++;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<letters[i];j++){
                System.out.println((char)(i+'a'));

            }
        }

    }

    public static void main(String[] args) {
        sortString("bafadf");
    }
}
