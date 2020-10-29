public class PointTester{
  public static void main(String[] args){
    Point A = new Point(3,5);
    Point B = new Point(A);
    Point C = new Point(4,7);
    System.out.println(A.distanceTo(C));
    System.out.println(A.equals(B));
    System.out.println(A.equals(C));
  }
}
