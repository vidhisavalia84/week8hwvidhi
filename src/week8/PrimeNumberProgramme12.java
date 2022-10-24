package week8;

import java.util.Scanner;

//Write a programme to input any number and check if it is prime or not
public class PrimeNumberProgramme12 {
    public static void main(String[] args) {
        PrimeNumberProgramme12 obj = new PrimeNumberProgramme12();
        obj.isPrimeNumber();
    }

    public void isPrimeNumber() {
        int temp;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
        sc.close();
    }

}
