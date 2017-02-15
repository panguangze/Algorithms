public class Chapter1115{
  public static int[] histogram(int M,int[] a){
      //the return array b
      int[] b=new int[M];
      int count=0;
   for(int i=0;i<a.length-1;i++,count=0){
       //foreach the array a,count the number of equal ones
     if(a[i]<M){
       for(int j=0;j<a.length-1;j++){//search to find if the equals present
        if(a[i]==a[j]){
         count++;
         b[a[i]]=count;
        } 
          
       }
     }
   }
  return b;
 }
 public static void main(String[] args) {
     int m=4;
     int [] a={2,0,0,0,2,3,4,5,6,19};
     for(int c:histogram(m,a)){
       System.out.print(c);
     
     }
 }


}
