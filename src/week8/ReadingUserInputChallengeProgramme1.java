package week8;
import java.util.Scanner;
/*Use the hasNextInt() method from the scanner to check if the user has entered an int value.
        -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
        10 numbers.
        -Use the nextInt() method to get the number and add it to the sum.
        -Before the user enters each number, print the message Enter number #x: where x represents the
        count, i.e. 1, 2, 3, 4, etc.
        -For example, the first message printed to the user would be Enter number #1:, the next Enter number*/
public class ReadingUserInputChallengeProgramme1 {
    public static void main(String[] args) {
ReadingUserInputChallengeProgramme1 obj=new ReadingUserInputChallengeProgramme1();
obj.countNumbers();
    }
public void countNumbers(){
        Scanner sc=new Scanner(System.in);
        int count=1;
        int sum=0;
        while(count<=10){
            System.out.println("Enter number: "+count);
            boolean number=sc.hasNextInt();
            if(number){
                int number1=sc.nextInt();
                sum+=number1;
                count++;
            }
            else {
                System.out.println("Invalid number");
            }
            sc.nextLine();//always return new user input
          //  sc.close();
        }

System.out.println("Sum of all numbers = "+sum);

sc.close();


}


}