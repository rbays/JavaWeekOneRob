package dayOne;



/**
 * Created by student on 27-Jun-16.
 */
public class ArrayExercise {
    public static void main (String[] args){


        System.out.println(bigDiff(new int[]{2, 10, 7, 2}));

    }

    // all the array methods...

    static boolean firstLast6(int[] nums){
        return nums[0] == 6 || nums[nums.length - 1]==6;
    }

    static boolean sameFirstLast(int[] nums){
        return nums[0] == nums[nums.length - 1] && nums.length > 0;
    }

    static boolean commonEnd(int[] nums1, int[]nums2){
        return nums1[nums1.length - 1] == nums2[nums2.length - 1] || nums1[0] == nums2[0];
    }

    static int[] maxEnd3(int[] nums){
        if (nums.length == 3){
            int max = nums[0];
            if (nums[nums.length - 1] > max){
                max = nums[nums.length -1];
            }
            nums[0] = max;
            nums[1] = max;
            nums[2] = max;
        }
        else{
            System.out.println("array too long");
        }
        return nums;
    }

    static boolean has23(int[] nums){
        return(nums[0] == 2 || nums[0] ==3 || nums[1] == 2 || nums[1] == 3);
    }

    static int evensCount(int[] nums){
        int total = 0;
        int arrayLength = nums.length;
        for(int i = 0; i < arrayLength; i++){
            if (nums[i] % 2 == 0){
                total ++;
            }
        }
        return total;
    }

    static int bigDiff(int[] nums){
        int min = nums[0];
        int max = nums[0];
        int arrayLength = nums.length;
        for(int i = 1; i < arrayLength; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return(max-min);
    }

    static int sum13(int[] nums){
        int total = 0;
        int arrayLength = nums.length;
        boolean add = true;
        for (int i = 0; i < arrayLength; i++){
            if (add){
                if (nums[i] == 13){
                    add = false;
                }
                else {
                    total += nums[i];
                }
            }
            else {
                add = true;
            }
        }
        return total;
    }

    static int sum67(int[] nums){
        int total = 0;
        int arrayLength = nums.length;
        boolean add = true;
        for (int i = 0; i < arrayLength; i++){
            if (add){
                if (nums[i] == 6){
                    add = false;
                }
                else {
                    total += nums[i];
                }
            }
            else{
                if (nums[i] == 7){
                    add = true;
                }
            }
        }
        return total;
    }

    public static boolean has22(int[] nums){
        boolean first = false;
        boolean second = false;
        for (int i = 0; i < nums.length; i++){
            if (first){
                if (nums[i] == 2){
                    second = true;
                }
                else{
                    first = false;
                }
            }
            else{
                if(nums[i] == 2){
                    first = true;
                }
            }
        }
        return second;
    }



}
