import java.io.*;
import java.util.*;

public class FTwoCopyAlt {
    public static void main(String[] args) {
        FileReader fr1,fr2;
        BufferedReader br1,br2;
        FileWriter fwr;
        BufferedWriter bwr;
        Scanner s = new Scanner(System.in);
        String f1,f2,f3;
        try{
            System.out.println("Enter first file name : ");
            f1 = s.nextLine();
            System.out.println("Enter second file name : ");
            f2 = s.nextLine();
            System.out.println("Enter destination file name : ");
            f3 = s.nextLine();
            fr1 = new FileReader(new File(f1));
            br1 = new BufferedReader(fr1);
            fr2 = new FileReader(new File(f2));
            br2 = new BufferedReader(fr2);
            fwr = new FileWriter(new File(f3));
            bwr = new BufferedWriter(fwr);
            

            String data1 = br1.readLine();
            String data2 = br2.readLine();
            while(data1!=null && data2!=null){
                bwr.write(data1);
                bwr.newLine();
                bwr.write(data2);
                bwr.newLine();
                data1=br1.readLine();
                data2 = br2.readLine();
            }
            while(data1!=null){
                bwr.write(data1);
                bwr.newLine();
                data1=br1.readLine();
            }
            while(data2!=null){
                bwr.write(data1);
                bwr.newLine();
                data2=br2.readLine();
                
            }
            br1.close();
            br2.close();
            bwr.close();
        }
        catch(FileNotFoundException e1){
            System.out.println("Error "+e1);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
