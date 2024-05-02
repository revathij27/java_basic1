import java.io.*;
public class recursion{
	public static void main(String args[]){
		DataInputStream dr=new DataInputStream(System.in);
		try{
			System.out.println("Enter a number:");
			int n=Integer.parseInt(dr.readLine());
			System.out.println("Numbers from "+n+" to 1:");
			dispDesc(n);
			System.out.println("Numbers from 1 to "+n+" :");
			dispAsc(1,n);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void dispDesc(int n){
		if(n>=1){
			System.out.println(n + " ");
			dispDesc(n-1);
		}
	}
	public static void dispAsc(int start,int n){
		if(start<=n){
			System.out.println(start + " ");
			dispAsc(start+1,n);
		}
	}
}
			