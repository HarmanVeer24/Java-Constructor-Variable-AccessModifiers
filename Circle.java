import java.util.Scanner;
public class Circle {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        int radius = sc.nextInt();
        CircleData circle1 = new CircleData();
        //default value
        System.out.println("default area output");
        circle1.AreaCalculator(0);
        CircleData circle = new CircleData(radius);
        System.out.println("parameterised area output");
        circle.AreaCalculator(radius);
        sc.close();
    }
}
//defining the circle class
class CircleData{
    int radius;
    //default constructor
    public CircleData(){
        this.radius = 0;
    }
    //constructor to initialise the details
    public CircleData(int radius){
        this.radius = radius;
    }
    //defining the void type method to calculate the area
    public void AreaCalculator(int radius){
        double area = 3.14*(radius*radius);
        double circumference = 3.14*2*radius;
        System.out.println("area of circle is ");
        System.out.println(area);
    }
}
//input
//enter the radius
//5
//default area output
//area of circle is
//0.0
//parameterised area output
//area of circle is
//78.5
