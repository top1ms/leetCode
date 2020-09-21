package com.zms.leetCode.practice;



public class TwoSum {

    public static void main(String[] args) {
        int nums[]=new int[]{1,2,9};
        int bitNums[]=new int[(1<<11)-1];
        int target=10;


        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(bitNums[temp-1]!=0){
                System.out.println(temp-1);
                System.out.println(i);
            }
            bitNums[nums[i]-1]=1;
        }
    }
}
