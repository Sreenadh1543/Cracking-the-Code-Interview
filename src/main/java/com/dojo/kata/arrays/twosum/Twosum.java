package com.dojo.kata.arrays.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {

    public static void main(String[] args){
        int[] nums = {1,3,5,7,9,2};
        int target =11;

        System.out.println(Arrays.toString(getIndicesForTwoSum(nums,target)));
    }

    private static int[] getIndicesForTwoSum(int[] nums,int target){
        Map<Integer,Integer> indexMapper = new HashMap<>();
        for (int pointer=0;pointer<nums.length;pointer++) {
            int num = nums[pointer];
            int numberToFind = target- num;
           if(indexMapper.containsKey(num)){
               int[] indicesArray= new int[2];
               indicesArray[0]=(pointer);
               indicesArray[1]=(indexMapper.get(num));
               return indicesArray;
           }else{
               indexMapper.put(numberToFind,pointer);
           }
        }
        return null;
    }
}
