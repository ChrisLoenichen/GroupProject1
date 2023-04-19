package Questions1;
/*
Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week
 */
public class Task1 {
    public static void main(String[] args) {
        int [] temps={71,81,63,85,70,89,82};
            int lowest = temps[0];
            int highest = temps[0];

            for(int i =0; i< temps.length; i++){
                if (temps[i]<lowest){
                    lowest = temps[i];
                } if(temps[i]>highest){
                    highest = temps[i];

                }
            }
        System.out.println("The highest temperature this week was "+highest);
        System.out.println("The lowest temperature this week was "+lowest);

    }
}
