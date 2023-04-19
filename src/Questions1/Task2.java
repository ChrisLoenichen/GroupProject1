package Questions1;
/*
Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.

 */
public class Task2 {
    public static void main(String[] args) {
        int [] values={1,2,3,4,5,6,7};
        int sum= 0;

        for(int i = 0; i< values.length; i++){
            sum+= values[i];


        }
            int bigSum= sum;
        System.out.println(bigSum);
    }
}
