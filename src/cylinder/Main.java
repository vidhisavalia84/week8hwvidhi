package cylinder;

public class Main {
    public static void main(String[] args){
        Circle circle=new Circle(3.75);
        System.out.println("circle.radious= "+circle.getRadious());
        System.out.println("circle.area= "+circle.getArea());
        Cylinder cylinder=new Cylinder(5.55,7.25);
        System.out.println("cylinder.radious= "+cylinder.getRadious());
        System.out.println("cylinder.height= "+cylinder.getHeight());
        System.out.println("Cylinder.area= "+cylinder.getArea());
        System.out.println("cylinder.volume= "+cylinder.getVolume());
    }
}
