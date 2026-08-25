
import java.util.Arrays;
import java.util.stream.IntStream;



public class LeetCode1929 {

    static void main(String[] args){
        int [] vetor = {1, 2, 3, 8,9,4};
        System.out.println(Arrays.toString(getConcatenation(vetor)));
        System.out.println(Arrays.toString(getConcatenationn(vetor)));

    }

    public static int[] getConcatenation(int[] nums) {

        return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();


    }


    public static int[] getConcatenationn(int[] nums) {
        int [] ans = new int[nums.length * 2];
        for (int i=0; i< nums.length; i++){
            ans [i] = nums [i];
            ans [i+ nums.length] = nums[i];
        }
        return ans;

    }

}