import edu.princeton.cs.algs4.*;
public class Chapter121E
{
    public static void main(String[] args) {
        int N=Integer.parseInt(args[0]);
        Point2D [] P=new Point2D[N];
        for (int i=0;i<N ;i++ ) {
            P[i]=new Point2D(StdRandom.random(),StdRandom.random());
            P[i].draw();
        }
        double dis=P[0].distanceTo(P[1]);
        for (int i=0;i<N ;i++ ) {
            for (int j=i+1;j<N ;j++ ) {
                if(P[i].distanceTo(P[j])<dis) dis=P[i].distanceTo(P[j]);
            }
        }
        System.out.print(dis);
    }

}
