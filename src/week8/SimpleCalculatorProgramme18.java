package week8;

public class SimpleCalculatorProgramme18 {
    public static void main(String[] args){
        SimpleCalculatorProgramme18 calculator=new SimpleCalculatorProgramme18();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("subtract = "+calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply ="+calculator.getmultiplicationResult());
        System.out.println("divide ="+calculator.getDivisionResult());
    }

    double firstnumber, secondnumber;

    public double getFirstNumber() {
        return firstnumber;
    }

    public double getSecondtNumber() {
        return secondnumber;
    }
    public void setFirstNumber(double firstnumber){
        this.firstnumber=firstnumber;
    }
    public void setSecondNumber(double secondnumber) {
this.secondnumber=secondnumber;
    }
    public double getAdditionResult(){
        double result=(firstnumber+secondnumber);
        System.out.println(result);
        return result;
    }
    public double getSubtractionResult(){
        return (firstnumber-secondnumber);
    }
    public double getmultiplicationResult(){
        return (firstnumber*secondnumber);
    }
    public double getDivisionResult(){
        if(secondnumber==0){
        return 0;}
        return (firstnumber/secondnumber);
    }
}
