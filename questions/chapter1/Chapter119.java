public class Chapter119{
 public static void main(String[] args) {
     String s="";
     int N=100;
     for(int n=N;n>0;n/=2)
     s=n%2+s;
     System.out.print(s);
 }
}
