public class Driver{

 public static double distanceBetween(Point a, Point b){
  return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
 }

 public static void main(String[]args){
    Point A = new Point(1,2);
    Point B = new Point(2,2);
    Point C = new Point(5,2);
    Point D = new Point(2,6);
    Triangle ABC = new Triangle(B, C, D);
    Triangle JKL = new Triangle(3.4, 5.3, 5.7, 2.3, 6.0, 2.0);

    double d;

    System.out.println(A.toString());

    System.out.println(ABC.toString());
    System.out.println("The vertex at index 1 is " + ABC.getVertex(1));
    System.out.println("The perimeter of the triangle ABC is "
      + ABC.findPerimeter() + ".");
    ABC.setVertex(1, A);
    System.out.println("The ertex at index 1 at point A is " + ABC.getVertex(1));

    d = A.distanceTo(B);
    System.out.println("The distance between A and B is " + d + ".");

    d = distanceBetween(B,C);
    System.out.println("The distance between B and C is " + d + ".");

    System.out.println("The perimeter of the triangle ABC is "
      + ABC.findPerimeter() + ".");

    System.out.println("The perimeter of the triangle JKL is "
      + JKL.findPerimeter() + ".");
  }
}
