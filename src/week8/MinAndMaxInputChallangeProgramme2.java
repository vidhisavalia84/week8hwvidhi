package week8;
import java.util.Scanner;
/*-Read the numbers from the console entered by the user and print the minimum
        and maximum number the user has entered.
        -Before the user enters the number, print the message Enter number:
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum
        number.*///-Use an endless while loop.-Create a class with the name MinAndMaxInputChallenge.
public class MinAndMaxInputChallangeProgramme2 {
    public static void main(String[] args){
MinAndMaxInputChallangeProgramme2 obj=new MinAndMaxInputChallangeProgramme2();
obj.findMinAndMax();
    }
    public void findMinAndMax(){
       Scanner sc=new Scanner(System.in);
       int largestnumber=Integer.MIN_VALUE;
       int smallestnumber=Integer.MAX_VALUE;
       int number;
       do {
           System.out.println("Enter an integer, or enter -99 to stop : ");
           number = sc.nextInt();
           if (number == -99) {
               break;
           }
           if (number > largestnumber) {
               largestnumber = number;
           }
           if (number < smallestnumber) {
               smallestnumber = number;
           }}
           while (number != -99) ;
        System.out.println("Largest number is: "+largestnumber);
        System.out.println("Smallest number is:  "+smallestnumber);
sc.close();
       }




        }







