import java.io.*;
import java.util.*;

interface area{
    public double calc_area();
}

class triangle implements area{
    float base,height;
    triangle(float a,float b)
    {
        this.base=a;
        this.height=b;
    }

    public double calc_area()
    {
        double area;
        area=0.5*base*height;
        return area;
    }
}

class square implements area{
    float side;
    square(float a)
    {
        this.side=a;
    }

    public double calc_area()
    {
        double area;
        area=side*side;
        return area;
    }
}

public class runtime_poly {
    public static void main(String[] args) {
        area obj[];
        int i,n,ch;
        System.out.println("Enter the number of objects");
        Scanner s=new Scanner(System.in);
        try{
            n=s.nextInt();
            obj=new area[n];
            for(i=0;i<n;++i){
                System.out.println("1. Area of Triangle \n2. Area of Square\nEnter choice :");
                ch=s.nextInt();
                if(ch==1)
                {
                    float l,b;
                    System.out.println("Enter base and height");
                    l=s.nextFloat();
                    b=s.nextFloat();
                    obj[i]=new triangle(l,b); 
               }
               else  if(ch==2){
                float si;
                    System.out.println("Enter side");
                    si=s.nextFloat();
                    obj[i]=new square(si); 
               }
            }
            for(i=0;i<n;++i)
            {
                if(obj[i] instanceof triangle){
                    System.out.println("Area of Triangle : ");
                    System.out.println(obj[i].calc_area());
                }
                else if(obj[i] instanceof square){
                    System.out.println("Area of Square : ");
                    System.out.println(obj[i].calc_area());
                }
            }
        }catch(Exception ee)
        {
            System.out.println("Error"+ee);
        }
        
    }
}
