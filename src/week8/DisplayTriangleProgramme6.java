package week8;
/*Write a program in Java to display the pattern like a triangle with a number.
    For eg.    Input number of rows: 5 Expected Output:
        1
        12
        123
        1234
        12345*/
import java.util.Scanner;
public class DisplayTriangleProgramme6 {
public static void main(String[] args){
    DisplayTriangleProgramme6 obj=new DisplayTriangleProgramme6();
    obj.trianglePattern();
}
public void trianglePattern(){
    System.out.println("Enter number of rows: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
            System.out.print(j);
        System.out.println(" ");

    }
    sc.close();
}
}
