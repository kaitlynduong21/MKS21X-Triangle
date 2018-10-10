public class Triangle {

  private Point P1;
  private Point P2;
  private Point P3;

  public Triangle(Point a, Point b, Point c) {
    P1 = a;
    P2 = b;
    P3 = c;
  }

  public double findPerimeter() {
    return (P1.distanceTo(P2) + P2.distanceTo(P3) + P3.distanceTo(P1));
  }
}
