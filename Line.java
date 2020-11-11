public class Line{
  Point p1;
  Point p2;
  public Line(int x1, int y1, int x2, int y2){
    p1 = new Point(x1, y1);
    p2 = new Point(x2, y2);
  }

  public Point getP1(){
    return p1;
  }

  public Point getP2(){
    return p2;
  }

  public String toString(){
    String output = "[(" + p1.x + ", " + p1.y + "), (" + p2.x + ", " + p2.y + ")]";
    return output;
  }

  public double getSlope(){
    return p1.slope(p1, p2);
  }

  public boolean isCollinear(Point p3){
    if (p1.isCollinear(p2, p3)){
      return true;
    }
    else {
      return false;
    }
  }
}