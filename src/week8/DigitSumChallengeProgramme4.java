package week8;

public class DigitSumChallengeProgramme4 {
    public static void main(String[] args) {
sumDigit(125);
sumDigit(-98);
sumDigit(-3);
        System.out.println("Sum of -3 is = " + sumDigit(-3));
        System.out.println(sumDigit(-98));
        System.out.println(sumDigit(8));
    }

    public static int sumDigit(int number) {
        int sum;
        if (number <= 9) {
            return -1;


        }else { sum=(number/100)+(number/10)%10+number%10;
            System.out.println(sum);
        }
return 100;
    }
}