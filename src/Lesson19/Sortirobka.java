package Lesson19;

import java.util.Arrays;

public class Sortirobka {

    int[] sortirovka(int[] nums) {
        //Arrays.sort(nums);

        //{5,3,2,4,1};
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (min > nums[j]){
                    min = nums[j];
                    nums[j] = nums[i];
                    nums[i] = min;
                }
            }
        }
        return nums;
    }

    void showArray(int[][] nums){
        System.out.println(nums[0][0]); 

    }


    public static void main(String[] args) {
        Sortirobka sortirobka = new Sortirobka();

        int[] num = {5,3,2,4,1};

        System.out.println(Arrays.toString(sortirobka.sortirovka(num)));
    }

}
