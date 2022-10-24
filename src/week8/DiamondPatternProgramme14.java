package week8;
import java.util.Scanner;
public class DiamondPatternProgramme14 {
    public static void main(String[] args) {
        diamondShape();
    }

    public static void diamondShape() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows(half of the diamond)");
        int row = sc.nextInt();
        System.out.println("Enter symbol: ");
        char c=sc.next().charAt(0);
        int i=1;
        int j;
        while(i<=row){
            j=1;
            while (j++<=row-i) {
                System.out.print(" ");
            }
            j=1;
            while (j++<=i*2-1){
                System.out.print(c);
            }
            System.out.println();
            i++;
            }
        i=row-1;
        while (i>0){
            j=1;
            while (j++<=row-i){
                System.out.print(" ");
            }
            j=1;
            while (j++<=i*2-1){
                System.out.print(c);
            }
            System.out.println();
            i--;
        }sc.close();

}}