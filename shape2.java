import java.io.*;
interface shape{
    public void disp();
    public double calc();
}
class rectangle implements shape{
    double l,b,h;
    public rectangle(double l,double b,double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public  void disp(){
        System.out.println("Shape:Rectangle");
    }
    public double calc(){
        return l*b*h;
    }
}
class circle implements shape{
    double r;
    public circle(double r){
        this.r=r;
    }
    public void disp(){
        System.out.println("Shape:Circle");
    }
    public double calc(){
        return 4/3*3.14*r*r*r;
    }
}
class shape2{
    public static void main(String args[]){
        shape obj;
        int n,i,ch;
        int l,b,h,r;
        DataInputStream din=new DataInputStream(System.in);
        try{
            System.out.println("1.Rectangle\n 2.Circle\n Enter your choice:");
            ch=Integer.parseInt(din.readLine());
            if(ch==1){
                
                System.out.println("Enter the length:");
                l=Integer.parseInt(din.readLine());
                System.out.println("Enter the breadth:");
                b=Integer.parseInt(din.readLine());
                System.out.println("Enter the height:");
                h=Integer.parseInt(din.readLine());
                obj=new rectangle(l,b,h);
                obj.disp();
                System.out.println("Volume= "+obj.calc());
            }
            else{
                System.out.println("Enter the radius:");
                r=Integer.parseInt(din.readLine());
                obj=new circle(r);
                obj.disp();
                System.out.println("Volume= "+obj.calc());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}