package week8;

import java.util.Scanner;

/*Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value*/
public class SumOfEvenDigitProgramme11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        SumOfEvenDigitProgramme11 obj = new SumOfEvenDigitProgramme11();
        obj.sumEvenDigit(number);
        sc.close();
    }

    public void sumEvenDigit(int number) {
        int digit;
        int sum = 0;
        if (number > 0) {
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                number = number / 10;
            }
            System.out.println("Sum of even number is: " + sum);
        } else {
            System.out.println("Invalid input " + number + " sum = -1");
        }
    }
}
