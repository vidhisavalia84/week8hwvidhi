package week8;

import java.util.Scanner;

public class TwoNumbersDigitCheckProgramme13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleasr enter two numbers ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // TwoNumbersDigitCheckProgramme13 obj=new TwoNumbersDigitCheckProgramme13();
        boolean x = hasSharedDigit(num1, num2);
        System.out.println(num1 + " and  " + num2 + " has shared digit?  =  " + x);
        sc.close();
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 > 99) && (num2 < 10 || num2 > 99)) {
            return false;

        }
        int numberOneFirstDigit = num1 / 10;
        int numberTwoFirstDigit = num2 / 10;
        int numberOneLastDigit = num1 % 10;
        int numberTwoLastDigit = num2 % 10;
        if ((numberOneFirstDigit == numberTwoFirstDigit) || (numberOneFirstDigit == numberTwoLastDigit) || (numberOneLastDigit == numberTwoFirstDigit) || (numberOneLastDigit == numberTwoLastDigit)) {
            return true;

        }
        return false;

    }
}
