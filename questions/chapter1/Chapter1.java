import edu.princeton.cs.introcs.*;
class Chapter1{
 public static String equals(String[] args) {
     if (args[0].equals(args[1])&&args[0].equals(args[2])&&args[1].equals(args[2])) {
         return "equal";
     }else {return "not equal";} 
 }
 public static void main(String[] args) {
     System.out.print(equals(args));
 }
}
