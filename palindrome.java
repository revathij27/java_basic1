import java.io.*;
import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str,revStr="";
        try{
            System.out.println("Enter a string:");
            str=sc.nextLine();
            int strlen=str.length();
            for(int i=(strlen-1);i>=0;i--){
                revStr= revStr+str.charAt(i);
            }
            str=str.toLowerCase();
            revStr=revStr.toLowerCase();
            if(str.equals(revStr)){
                System.out.println("It is a palindrome");
            }
            else{
                System.out.println("It is not a palindrome");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}