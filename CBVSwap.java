import java.io.*;
public class CBVSwap{
   public static void swap(float a,float b){
        float temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a= "+a+" and b= "+b);
   } 
   public static void main(String args[]){
        float a,b;
        String s;
        DataInputStream din;
        din=new DataInputStream(System.in);
        try{
            System.out.println("Enter num1:");
            s=din.readLine();
            a=Float.parseFloat(s);
            System.out.println("Enter num2:");
            s=din.readLine();
            b=Float.parseFloat(s);
            System.out.println("before swapping a= "+a+" and b= "+b);
            swap(a,b);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
   }
}