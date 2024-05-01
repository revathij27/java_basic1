import java.io.*;
public class evenStatic{
    public static void main(String args[]){
        try{
            DataInputStream din=new DataInputStream(System.in);
            System.out.println("Enter a number:");
            int n=Integer.parseInt(din.readLine());
            System.out.println("Even number upto "+n+ ":");
            dispEven(n);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void dispEven(int n){
        for(int i=2;i<=n;i+=2){
            System.out.println(i + " ");
        }
    }
}