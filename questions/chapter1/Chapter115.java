import edu.princeton.cs.introcs.*;;
public class Chapter115{
  public static boolean between(double x,double y){
    if (x==y) return true;
    else return false;
  }
  public static void main(String[] args) {
      double x =StdIn.readDouble();
      double y =StdIn.readDouble();
      StdOut.print(between(x,y));
  }

}
