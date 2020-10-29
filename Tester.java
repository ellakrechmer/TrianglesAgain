public class Tester{
  public static void main(String[] args){
    Point A = new Point(0,0);
    Point B = new Point(1,1);
    Point C = new Point(4,2);
    Triangle t = new Triangle(A,B,C);
    System.out.println(t.getPerimeter());
  }
}
