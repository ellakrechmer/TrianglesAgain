public class Tester{
  public static void main(String[] args){
    //Equilateral Triangle
    Point A = new Point(0, 0);
    Point B = new Point(4, 0);
    Point C = new Point(2, Math.sqrt(12));
    Triangle abc = new Triangle(A,B,C);
    System.out.println("Triangle ABC:");
    System.out.println(abc.getPerimeter());
    System.out.println(abc.getArea());
    System.out.println(abc.classify());
    System.out.println(abc.toString());
    System.out.println();

    //Isosceles Triangle
    Point D = new Point(0,0);
    Point E = new Point(1,1);
    Point F = new Point(2,0);
    Triangle def = new Triangle(D,E,F);
    System.out.println("Triangle DEF:");
    System.out.println(def.getPerimeter());
    System.out.println(def.getArea());
    System.out.println(def.classify());
    System.out.println(def.toString());
    System.out.println();

    //Scalene Triangle
    Point G = new Point(0,0);
    Point H = new Point(0,3);
    Point I = new Point(4,0);
    Triangle ghi = new Triangle(G, H, I);
    System.out.println("Triangle GHI:");
    System.out.println(ghi.getPerimeter());
    System.out.println(ghi.getArea());
    System.out.println(ghi.classify());
    System.out.println(ghi.toString());
    System.out.println();

    //Mutator Tests
    abc.setVertex(0, new Point(3,5));
    def.setVertex(1, B);
    ghi.setVertex(2, F);
    System.out.println("Mutator Tests: ");
    System.out.println(abc.toString());
    System.out.println(def.toString());
    System.out.println(ghi.toString());
  }
}
