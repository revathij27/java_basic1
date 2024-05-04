import java.util.*;
class strtoken{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        String input=sc.nextLine();
        StringTokenizer token=new StringTokenizer(input);
        int sum=0;
        while(token.hasMoreTokens()){
            String tkn=token.nextToken();
            try{
                int num=Integer.parseInt(tkn);
                System.out.println(num);
                sum +=num;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("sum ="+sum);
    }
}
