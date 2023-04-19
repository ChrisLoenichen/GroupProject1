package Questions1;

/*
 Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.

 */
public class Task3 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11},
                {12, 13, 14, 15, 16}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {

                if (arr1[i][j] % 2 == 0) {
                    System.out.println(arr1[i][j] + " ");
                }
            }
    

        }
    }
}
