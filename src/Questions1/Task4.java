package Questions1;

/*
Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.

 */
public class Task4 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int even= 0;
        int odd = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] % 2 == 0){
                     even += arr1[i][j];
                }if (arr1[i][j] % 2 == 1){
                     odd += arr1[i][j];

                }

            }
        }System.out.println(even);
        System.out.println(odd);
        System.out.println(even+odd);
    }
}
