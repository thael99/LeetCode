import java.util.Arrays;

public class LeetCode128 {

    static void main (String[] args){
        int [] vet1 = {1, 2, -6, -7, -5, 10, -3};
        int [] vet2 = {0};
        int [] vet3 = {8000, 8001, 8002, 8004, 8005, 8006, 7999};
        System.out.println(longestConsecutive(vet1));
        System.out.println(longestConsecutive(vet2));
        System.out.println(longestConsecutive(vet3));

    }

    static int longestConsecutive(int[] nums) {
        int soma=1, maximo=1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if (nums.length > 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i+1] == (nums[i]+1)) {
                    soma ++;
                    if (soma > maximo) {
                        maximo = soma;
                    }
                }
                else if (nums[i+1] != nums[i]){
                    soma = 1;
                }
            }
            return maximo;
        }
        else if (nums.length == 1) {
            return 1;
        }
        else
            return 0;
    }
}
