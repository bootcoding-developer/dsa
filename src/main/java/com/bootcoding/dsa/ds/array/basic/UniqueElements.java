package dsa.ds.array.basic;

import java.util.HashMap;
import java.util.Map;

public class UniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2}; // 8
        int i = sumOfUnique(nums);
        System.out.println(i);
    }
    // Corner Cases / Edge Cases
    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> elements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(elements.containsKey(nums[i])){
                elements.put(nums[i], elements.get(nums[i]) + 1);
            }else{
                elements.put(nums[i], 1);
            }
        }
        for(Integer element : elements.keySet()){
            if(elements.get(element) == 1){
                sum = sum + element;
            }
        }
        return sum;
    }
}
