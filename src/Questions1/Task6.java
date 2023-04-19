package Questions1;
/*
Write a java program to check whether a given
number is prime or not?
note:prime numbers are only divisible by 1 or itself
 */
public class Task6 {
    public static void main(String[] args) {
        int num=11;
        boolean primeNum= true;
        for(int i= 2; i<num;i++){
            if(num%i==0){
                primeNum=false;
                break;
            }
        }if(primeNum){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
}
