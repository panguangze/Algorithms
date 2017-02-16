import edu.princeton.cs.algs4.*;
public class Chapter1211 {//this is a SmaterDate class 
        private int year;
        private int month;
        private int day;

    public Chapter1211(int m,int d,int y){
       // super(m,d,y);
        if(m>12||m<=0||d<=0||y<=0) throw new OutOfDateException("month OutOfDateException");
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12&&d>31)throw new OutOfDateException("day OutofException");
        if(m==4||m==6||m==9||m==11&&d>30)throw new OutOfDateException("day outofexception");
        if(y%4==0&&m==2&&d>29)throw new OutOfDateException("day outofe");
        if(y%4!=0&&m==2&&d>28)throw new OutOfDateException("day outofe");
        month=m;day=d;year=y;
    }
public static void main(String[] args) {
   new Chapter1211(2,29,2001);
}

}
class OutOfDateException extends RuntimeException{
    public OutOfDateException(String s){}

}
