import java.util.HashSet;

public class LeetCode128v2 {

    static void main (String[] args){
        int [] vet1 = {1, 2, -6, -7, -5, 10, -3};
        int [] vet2 = {0};
        int [] vet3 = {8000, 8001, 8002, 8004, 8005, 8006, 7999};
        System.out.println(longestConsecutive(vet1));
        System.out.println(longestConsecutive(vet2));
        System.out.println(longestConsecutive(vet3));

    }

    static int longestConsecutive(int[] nums) {
        HashSet<Integer> setNums = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            setNums.add(nums[i]);
        }
        int maior = 0;
        for (int n:setNums){
            if (!setNums.contains(n-1)){
                int sequencia = 1;
                while (true){
                    if (setNums.contains(n+sequencia)){
                        sequencia ++;
                    }
                    else
                        break;
                }
                maior = Math.max(maior, sequencia);
            }
        }
        return maior;

    }

}
