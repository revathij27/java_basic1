import java.util.*;
import java.lang.*;
class oddThread extends Thread{
    public void run(){
        for(int i=1;i<=100;i+=2){
            System.out.println("Odd thread "+i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class evenThread extends Thread{
    public void run(){
        for(int i=2;i<=100;i+=2){
            System.out.println("Even thread "+i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
class oddeventhread{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("press enter to start");
        sc.nextLine();
        oddThread od=new oddThread();
        evenThread ed=new evenThread();
        od.start();
        ed.start();
        try{
            od.join();
            ed.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("stopping");
    }
}
