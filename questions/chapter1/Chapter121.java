import edu.princeton.cs.algs4.*;
public class Chapter121{
    private double MinDis=10;//to record the minest distance
    private int N;//the num of points
    private double[] a;
    public Chapter121(int N){
        this.N=N;
        a=new double[N];
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,1);
        StdDraw.setPenRadius(0.005);
    }
    public double drawp(){

        for (int i=0;i<N ;i++ ) {//draw the random point 
            a[i]=StdRandom.random();
            StdDraw.setPenColor(StdDraw.DARK_GRAY);
            StdDraw.point(i,a[i]);
        }
        
       for (int i=0;i<N ;i++ ) {
           for (int j=i+1;j<N ;j++ ) {
               if(Math.sqrt((a[j]-a[i])*(a[j]-a[i])+(j-i)*(j-i))<MinDis)
               MinDis=Math.sqrt((a[j]-a[i])*(a[j]-a[i])+(j-i)*(j-i));
           }
       }    
    return MinDis;
    }
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        Chapter121 c=new Chapter121(N);
        System.out.print(c.drawp());
    }
}
