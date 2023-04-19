package Questions1;
/*
Write a Java Program to print the first 10 numbers of
Fibonacci series
0 1 1 2 3 5 8 13 21 34
 */
public class Task7 {
    public static void main(String[] args) {
    int num =0, num1= 1, sum= 0;
        System.out.println(num+" "+num1);
        for(int i = 2; i<10;i++){
            sum=num+num1;
            System.out.println(" "+sum);
            num=num1;
            num1=sum;
        }
    }
}
