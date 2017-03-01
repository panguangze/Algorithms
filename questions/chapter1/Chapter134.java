import edu.princeton.cs.algs4.*;
public class Chapter134{
    public static boolean isBanlance(String s){
        Stack<Character> stack=new Stack<Character>();
        for (int i=0;i<s.length();i++ ) {
            if(s.charAt(0)=='}'||s.charAt(0)==']'||s.charAt(0)==')'){return false;}
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                if(!stack.pop().equals('(')) return false;
            }
            if(s.charAt(i)==']'){
                if(!stack.pop().equals('[')) return false;
            }
            if(s.charAt(i)=='}'){
                if(!stack.pop().equals('{')) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
           System.out.print(isBanlance(StdIn.readString()));
        }

}
