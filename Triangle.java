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
    Point vertex;
    if (index == 0) {
      vertex = new Point(v1);
    } else {
      if (index == 1) {
      vertex = new Point (v2);
      } else {
      vertex = new Point (v3);
      }
    }
    return vertex;
  }//return a COPY of the specified Point (0,1, or 2)

  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    } else {
      if (index == 1) {
      v2 = newP;
      } else {
        v3 = newP;
      }
    }
  }
}
