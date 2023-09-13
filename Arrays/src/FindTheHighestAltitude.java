//https://leetcode.com/problems/find-the-highest-altitude/
public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int []gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int sum = 0;
        for (int index = 0; index < gain.length; index++) {
            if(highestAltitude<sum){
                highestAltitude = sum;
            }
            sum = sum + gain[index];
        }
        if(highestAltitude<sum){
            highestAltitude = sum;
        }
        return highestAltitude;
    }
}
