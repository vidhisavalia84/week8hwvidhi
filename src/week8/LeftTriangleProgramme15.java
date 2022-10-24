package week8;

public class LeftTriangleProgramme15 {
    public static void main(String[] args){
        LeftTriangleProgramme15 obj=new LeftTriangleProgramme15();
        obj.PrintLeftTriangle(5);
    }
    public void PrintLeftTriangle(int num){
        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");



        }
    }
}
