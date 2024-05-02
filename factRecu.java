import java.io.*;
class factRecu{
    public static long calFact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*calFact(n-1);
        }
    
	public static void main(String args[]){
		DataInputStream input=new DataInputStream(System.in);
		try{
			System.out.println("Enter the number:");
			int n=Integer.parseInt(input.readLine());
			long factorial=calFact(n);
			System.out.println("The factorial of "+n+" is : "+factorial);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}