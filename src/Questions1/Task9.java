package Questions1;

import java.util.Arrays;

/*
Write a java program to find the second largest
number in the array?
 */
public class Task9 {
    public static void main(String[] args) {
        int [] num={11,29,73,54,25,69,77};

        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}

