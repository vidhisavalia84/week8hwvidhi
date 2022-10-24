package week8;
//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class FibonanciProgramme9 {
    public static void main(String[] args){
FibonanciProgramme9 obj=new FibonanciProgramme9();
obj.fibonancySeries();
    }
    public void fibonancySeries(){
        int maxnumber=10;
        int previousNumber=1;
        int nextNumber=2;
        System.out.println("fibonancy series of "+maxnumber+" number is: ");
        for(int i=1;i<=maxnumber;i++){
            System.out.print(previousNumber+" ");
            int sum=previousNumber+nextNumber;
            previousNumber=nextNumber;
            nextNumber=sum;

        }

    }

}
