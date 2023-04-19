package Questions1;
//. Maximum and minimum number in the array?
public class Task8 {
    public static void main(String[] args) {
        int [] num={103,61,93,285,770,29,52};
        int min = num[0];
        int max = num[0];


        for(int i =0; i< num.length; i++){
            if (num[i]<min){
                min = num[i];
            } if(num[i]>max){
                max = num[i];

            }
        }
        System.out.println("The highest number is "+max);
        System.out.println("The lowest number is "+min);

    }
}
