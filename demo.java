public class demo{

 public static double distanceBetween(Point a, Point b){
  return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
 }

 public static void main(String[]args){
    Point P1 = new Point(1,2);
    Point P2 = new Point(2,2);
    Point P3 = new Point(5,2);
    Point P4 = new Point(2,6);
    Triangle P2P3P4 = new Triangle(P2, P3, P4);

    double d;

    d = distanceBetween(P1,P2);
    System.out.println("The distance between P1 and P2 is " + d + ".");

    d = Point.distanceBetween(P1,P2);
    System.out.println("The distance between P1 and P2 is " + d + ".");

    d = P1.distanceTo(P2);
    System.out.println("The distance between P1 and P2 is " + d + ".");

    d = distanceBetween(P2,P3);
    System.out.println("The distance between P2 and P3 is " + d + ".");

    d = Point.distanceBetween(P2,P3);
    System.out.println("The distance between P2 and P3 is " + d + ".");

    d = P2.distanceTo(P3);
    System.out.println("The distance between P2 and P3 is " + d + ".");

    System.out.println("The perimeter of the triangle made up of P2, P3, and P4 is "
      + P2P3P4.findPerimeter() + ".");
  }
}
