public class Triangle {

  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double a, double b, double c, double d, double e, double f) {
    Point D = new Point (a,b);
    Point E = new Point (c,d);
    Point F = new Point (e,f);
    v1 = D;
    v2 = E;
    v3 = F;
  }

  public double findPerimeter() {
    return (v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1));
  }

  public String toString() {
    return "Triangle: A" + v1 + " B" + v2 + " C" + v3;
  }

  public Point getVertex(int index) {
    if (index == 0) {
      Point vertex = new Point(v1);
      return vertex;
    }
    if (index == 1) {
      Point vertex = new Point (v2);
      return vertex;
    } else {
      Point vertex = new Point (v3);
      return vertex;
    }
  }//return a COPY of the specified Point (0,1, or 2)
}
