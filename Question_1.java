package Internpe.Task2;

class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double perimeter(){
        return Math.PI*this.radius*this.radius;
    }
    public double area(){
        return 2*Math.PI*this.radius;
    }
}
public class Question_1 {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        System.out.println("Area is = "+circle.area());
        System.out.println("Perimeter is = "+circle.perimeter());
    }
}
