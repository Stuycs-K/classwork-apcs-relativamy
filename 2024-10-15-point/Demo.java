public class Demo {

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt(Math.pow((a.getX()-b.getX()), 2) + Math.pow((a.getY()-b.getY()), 2));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    // toString test cases
    System.out.println( p1);
    System.out.println( p2);
    System.out.println( p3);

    // distance test cases with p1 and p2
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));

    // distance test cases with p1 and p3
    System.out.println( distance(p1,p3));
    System.out.println( Point.distance(p1,p3));
    System.out.println( p1.distanceTo(p3));

    // distance test cases with p2 and p3
    System.out.println( distance(p2,p3));
    System.out.println( Point.distance(p2,p3));
    System.out.println( p2.distanceTo(p3));

    // equilateral triangle points
    Point t1 = new Point(0,0);
    Point t2 = new Point(1,0);
    Point t3 = new Point(0.5,Math.sqrt(3));

    // equilateral triangle side length tests
    System.out.println( distance(t1,t2));
    System.out.println( distance(t1,t3));
    System.out.println( distance(t2,t3));

  }
}
