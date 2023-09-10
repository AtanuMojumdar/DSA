import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String s1 = "Atanu Mojumdar";
        char target = 'M';
        System.out.println(Arrays.toString(s1.toCharArray()));
        System.out.println(searchInStrings(s1,target));
    }

     static int searchInStrings(String s1, char target) {
        if(s1.trim().length() == 0) return -1;

        for (int index = 0; index < s1.length(); index++) {
             if(s1.charAt(index) == target){
                 return index;
             }
         }

        return -1;
    }

}
