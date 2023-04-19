package Questions1;

import java.util.Arrays;

//Write a program to print out duplicate elements from
//an Array of Strings?
public class Task10 {
    public static void main(String[] args) {
        int[]nums= {1,2,3,4,5,6,7};
        int[]copyArr= new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            copyArr[i] = nums[i];
        }for (int i= 0; i< copyArr.length; i++){
        System.out.println(copyArr[i]);
    }
    }
}
