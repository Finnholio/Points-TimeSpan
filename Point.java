import java.util.*;

public class Point{
  int x;
  int y;

  public Point(int newX, int newY){
    x = newX;
    y = newY;
  }

  public Point(){
    x = 0;
    y = 0;
  }

  public int manhattanDistance(Point other){
    int xDistance = Math.abs(other.x - x);
    int YDistance = Math.abs(other.y - y);

    return xDistance + YDistance;
  }

  public boolean isVertical(Point other){
    if (other.x == x){
      return true;
    }
    else {
      return false;
    }
  }

  public double slopeWithMyself(Point other){
    double dx = Math.abs(other.x - x);
    double dy = Math.abs(other.y - y);

    return dy/dx;
  }

  public double slope(Point p1, Point p2){
    double dx = Math.abs(p1.x - p2.x);
    double dy = Math.abs(p1.y - p2.y);

    return dy/dx;
  }

  public boolean isCollinear(Point p1, Point p2){
    if (isVertical(p1) && isVertical(p2)){
      return true;
    }
    else if (slope(p1, p2) == slopeWithMyself(p2) && slopeWithMyself(p2) == slopeWithMyself(p1)){
      return true;
    } 
    else {
      return false;
    }
  }
}