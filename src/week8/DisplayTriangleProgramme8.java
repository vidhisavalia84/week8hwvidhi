package week8;

import java.util.Scanner;

/*Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@*/
public class DisplayTriangleProgramme8
{
    public static void main(String[] args) {
        trianglePattern();
    }

    public static void trianglePattern() {
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("@");
            System.out.println(" ");

        }
        sc.close();
    }
}
