package Internpe.Task2;
class Rectangle{
    private double width;
    private double height;
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double area(){
        return width*height;
    }
    public double perimeter(){
        return 2*(width+height);}
}
public class Question_3 {
    public static void main(String[] args) {
    Rectangle rec = new Rectangle();
    rec.setWidth(5.5);
    rec.setHeight(8.5);
    System.out.println("Area of Rectangle is = "+rec.area());
    System.out.println("Perimeter of Rectangle is = "+rec.perimeter());
    }
}


