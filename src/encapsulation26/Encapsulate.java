package encapsulation26;

public class Encapsulate {
    //private variables can only be accesed by public method of class
    private String name;
    private int rollNo;
    private int age;
    //get method for name to access private variable name
    public String getName(){
        return  name;
    }
    //set method for name to access private variable name
    public void setName(String name){
        this.name=name;
    }
    //get method for rollnumber to access private variable rollno
    public int getRollNumber(){
        return rollNo;
    }
    // set method for rollno to access private variable rollNo
    public void setRollNumber(int rollNo){
        this.rollNo=rollNo;
    }
    //get method for age to acess private age
    public int getAge(){
        return  age;
    }
    //set method for age to access private variable aeg
    public void setAge(int age){
        this.age=age;
    }
















}
