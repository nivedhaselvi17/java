import java.util.Scanner;
abstract class Shape
{
     int d1, d2;
     Scanner s = new Scanner(System.in);
     Shape(int d1, int d2)
     {
        this.d1=d1;
        this.d2=d2;
     }
      abstract void printArea();
}
class Rectangle extends Shape
{    
     Rectangle(int d1, int d2)
     {   super(0,0);
         System.out.println("Enter Length: ");
         this.d1 = s.nextInt();
         System.out.println("Enter breadth: ");
         this.d2 = s.nextInt();
     }
     void printArea()
     {
        System.out.println("Area: " + (d1 * d2));
     }
}
class Triangle extends Shape
{
     Triangle(int d1, int d2)
     {   super(0,0);
         System.out.println("Enter Base: ");
         this.d1 = s.nextInt();
         System.out.println("Enter Height: ");
         this.d2 = s.nextInt();
     }
     void printArea()
     {
        System.out.println("Area: " + (0.5 * d1 * d2));
     }
}
class Circle extends Shape
{
     Circle(int d1)
     {   super(0,0);
         System.out.println("Enter Radius ");
         this.d1 = s.nextInt();
     }
     void printArea()
     {
        System.out.println("Area: " + (3.14 * d1 * d1));
     }
}
class Area
{  
    public static void main(String arg[])
    {  
       Rectangle r = new Rectangle(5,10);
       r.printArea();
       
       Triangle t = new Triangle(8,6);
       t.printArea();

       Circle c = new Circle(7);
       c.printArea();
    }
}