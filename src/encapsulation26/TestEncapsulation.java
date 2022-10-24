package encapsulation26;

import java.sql.SQLOutput;

public class TestEncapsulation {
    public static void main(String[] args){
        Encapsulate obj=new Encapsulate();
        obj.setName("Panth");
        obj.setAge(11);
        obj.setRollNumber(51);
        //Displaying values of variables
        System.out.println("Prime's rollNo: "+obj.getRollNumber());
        System.out.println("Prime's Name : "+obj.getName());

        System.out.println("Prime's age: "+obj.getAge());

    }
}
