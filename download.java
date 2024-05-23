import java.net.*;
import java.io.*;
import java.util.Date;
class download{
    public static void main(String args[]) throws Exception{
        int c;
        URL u= new URL("https://btu.ac.in/BTU/wp-content/uploads/2019/04/MCA-PAPERS.pdf");
        URLConnection uc= u.openConnection();
        System.out.println("Date: "+ new Date(uc.getDate()));
        System.out.println("Content type: "+ uc.getContentType());
        System.out.println("Expires: "+uc.getExpiration());
        System.out.println("Last modified: "+ uc.getLastModified());
        int len=uc.getContentLength();
        System.out.println("Content length: " +len);
        if(len>0){
            FileOutputStream fout=new FileOutputStream("test.pdf");
            InputStream input= uc.getInputStream();
            int i=0;
            while(((c = input.read())!=-1) && i<len){
                fout.write((char)c);
                i++;
            }
            input.close();
            fout.close();
        }
        else{
            System.out.println("no content available");
        }
    }
}