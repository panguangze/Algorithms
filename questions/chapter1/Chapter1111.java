import edu.princeton.cs.introcs.*;
public class Chapter1111{
    //creat and 
  public static void creattransform(){
    boolean [][] b={{true,false,true},{true,true,false},{false,false,true}};
   /* for(boolean[] a:b){
        System.out.print("\n");
     for(boolean c:a){
         if(c) System.out.print("* ");
         else System.out.print(" ");}
    }
    }*/
  System.out.print(" 1 2 3");
  System.out.print("\n");
  for(int i=0;i<3;i++){
    System.out.print(i);
      for(int j=0;j<3;j++){
     if(b[i][j]) System.out.print("* ");
     else System.out.print("  ");
    }
    System.out.print("\n");
  }
  }
  public static void main(String[] args) {
      creattransform();
  }
}

