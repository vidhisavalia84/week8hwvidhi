package week8;
/*Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.*/
public class PilindromProgramme5 {
    public static void main(String[] args){
        PilindromProgramme5 obj=new PilindromProgramme5();
       // obj.reverseNumber(12321);
        boolean x=obj.isPalindrome(12321);
        System.out.println(x);
        boolean y=obj.isPalindrome(-1234);
        System.out.println(y);
    }
    public int reverseNumber(int number){
        int result=0;
        int remainder;
        while(number>0){
            remainder=number%10;
            number=number/10;
            result=result*10+remainder;
        }
     return result;
    }

    public boolean isPalindrome(int number){
        if(number==reverseNumber(number)){
            System.out.println(number+" is palindrome number");
            return true;
        }
        else {
            System.out.println(number+" not Palindrome number");
            return false;
        }//return false;
    }

   /*  number=reverse(number);

    return true;}*/
}
