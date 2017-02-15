public class Chapter126
{
    public static boolean circulartotation(String s1,String s2){
        return (s1+s1).contains(s2);
    
    }
    
    public static void main(String[] args) {
        System.out.print(circulartotation(args[0],args[1]));

    }
}
