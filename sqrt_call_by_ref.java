import java.io.*;
import java.util.*;
import java.lang.*;

class sqrt{
    public int num;
}

class calc_sqrt{
    int n;
    double sqr=0;
    public void calc(sqrt n){
        int no=n.num;
        sqr=Math.sqrt(no);
        System.out.println("Sqaure root = " +sqr);
    }
}
public class sqrt_call_by_ref {
    public static void main(String[] args) {
        sqrt sq=new sqrt();
        System.out.println("Enter the number : ");
        Scanner s = new Scanner(System.in);
        try{
            sq.num=s.nextInt();
            calc_sqrt cs=new calc_sqrt();
            cs.calc(sq);
        }catch(Exception e)
        {
            System.out.println("Error : "+e);
        }
    }
}
