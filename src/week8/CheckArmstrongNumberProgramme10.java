package week8;
import java.util.Scanner;
//Write a program to input any number and check if it Armstrong number or not
/*153 = (1*1*1)+(5*5*5)+(3*3*3)
        where:
        (1*1*1)=1
        (5*5*5)=125
        (3*3*3)=27
        So:
        1+125+27=153*/
public class CheckArmstrongNumberProgramme10 {
    public static void main(String[] args){
CheckArmstrongNumberProgramme10 obj=new CheckArmstrongNumberProgramme10();
obj.armstongNumOrNot();
    }
public void armstongNumOrNot(){
        int num,number,temp,total=0;
    System.out.println("Enter number: ");

    Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            number=num;
          while (number!=0){
              temp=number%10;
              total=total+temp*temp*temp;
              number/=10;
          }
          if(total==num)
              System.out.println(num+" is an Armstrong number");
        else
              System.out.println(num+" is not Armstrong number");
}
}
