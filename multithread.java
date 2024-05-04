import java.util.*;
import java.lang.*;
class RandGen extends Thread{
    private boolean running;
    public RandGen(){
        this.running=true;
    }
    public void stopGen(){
        this.running=false;
    }
    public void run(){
        Random random=new Random();
        while(running){
            try{
                Thread.sleep(1000);
                int num=random.nextInt(100);
                System.out.println("random number is "+num);
                if(num%2 == 0){
                    Squaret st=new Squaret(num);
                    st.start();
                }
                else{
                    cubet ct=new cubet(num);
                    ct.start();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }

        }
    }

}
class Squaret extends Thread{
    private int num;
    public Squaret(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Square ="+(num*num));
    }
}
class cubet extends Thread{
    private int num;
    public cubet(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Cube ="+(num*num*num));
    }
} 
class multithread{
    public static void main(String[] args) {
        RandGen rg=new RandGen();
        rg.start();
        try{
            Thread.sleep(10000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        rg.stopGen();
    }
}

