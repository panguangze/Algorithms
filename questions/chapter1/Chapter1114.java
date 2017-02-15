import edu.princeton.cs.introcs.*;
public class Chapter1114{
 public static int lo(int N){
   int n=0;
     do{
     n++;
   } while((1<<n)<=N);
     return n-1;
 }
public static void main(String[] args) {
    System.out.print(lo(StdIn.readInt()));
}
}
