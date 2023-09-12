//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
//        String sentence = "abc";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean ans = false;
        String s1 = sentence.toLowerCase();

        for (char alpha = 'a'; alpha <= 'z'; alpha++ ){
            if(s1.indexOf(alpha) == -1){
                return false;
            }
            else{
                ans = true;
            }
        }

        return ans;
    }
}
