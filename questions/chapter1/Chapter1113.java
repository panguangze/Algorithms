public class Chapter1113{
 public static void main (String[] args) {
    int [][] a={{1,2,3},{4,5,6}};
    int [][] b=new int[3][2];
   for (int j=0;j<3;j+=1) {
       for (int i=0;i<2;i++ ) {
           b[j][i]=a[i][j];
           System.out.print(b[j][i]);
       }
       System.out.print("\n");
   }  
  }
 
}
