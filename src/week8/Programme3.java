package week8;
import java.util.Scanner;
/*Write a Java program that takes the user to provide a single character from the
        alphabet. Print Vowel of Consonant, depending on the user input. If the user input
        Is not a letter (between a and z or A and Z), or is a string of length > 1, print an*/
public class Programme3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character ");
        char character=sc.next().charAt(0);
        Programme3 obj=new Programme3();
        obj.findVowelOrNot(character);
        sc.close();
    }
    public void findVowelOrNot(char ch ){
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("Entered character "+ch+" is Vowel ");
        } else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
            System.out.println("Entered character "+ch+" is Consonent");
        }
        else {
            System.out.println("Invalid input ");
        }
    }


}
