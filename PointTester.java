public class PointTester{
  public static void main(String[] args){
    Point A = new Point(3,5);
    Point B = new Point(A);
    System.out.println(A.getX());
    System.out.println(B.getY());
  }
}
