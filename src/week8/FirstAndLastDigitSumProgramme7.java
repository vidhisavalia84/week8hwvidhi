package week8;
import java.util.Scanner;
/*Write a method named sumFirstAndLastDigit with one parameter of type int called number.
The method needs to find the first and the last digit of the parameter number passed to the method,
using a loop and return the sum of the first and the last digit of that number.*/
public class FirstAndLastDigitSumProgramme7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number=sc.nextInt();
        sumFirstAndLastDigit(number);
        sc.close();

    }
    public static void sumFirstAndLastDigit(int number){
        int firstDigit=0;
        int lastDigit=0;
        lastDigit=number%10;
        if(number>=0){
        System.out.println("Last digit of entered number is: "+lastDigit);
        while (number!=0){
            firstDigit=number%10;
            number/=10;
        }
        System.out.println("First digit of entered number is : "+firstDigit);
        int sum=lastDigit+firstDigit;
        System.out.println("Sum of first and last digit is : "+sum);}
        else {
            System.out.println("Entered number is invalid : -1");
        }
    }
}
