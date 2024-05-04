import java.io.*;
import java.util.*;
class quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            double a,b,c;
            double r1,r2;
            System.out.println("enter a,b and c:");
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();

            double det = (b * b) - (4*a*c);
            if(det>0){
                r1=(-b+Math.sqrt(det))/(2*a);
                r2=(-b-Math.sqrt(det))/(2*a);
                System.out.println("R1="+r1+" R2= "+r2);
            }
            else if(det==0){
                r1=r2=-b/(2*a);
                System.out.println("R1=R2= "+r1);
            }
            else{
                double real=-b/(2*a);
                double img=Math.sqrt(-det)/(2*a);
                System.out.println("Real ="+real+" Imaginary ="+img+"i");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
