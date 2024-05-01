import java.util.*;
 
class employee{
    int eno;    
    String ename;
    float esal;
    void read(){
        Scanner s=new Scanner(System.in);
        try{

            System.out.println("Enter Eno : ");
            eno=s.nextInt();
            System.out.println("Enter Ename : ");
            s.nextLine();
            ename=s.nextLine();
            System.out.println("Enter Esal : ");
            esal=s.nextFloat();
        }catch(Exception e)
        {}
    }

    void disp(){
        System.out.println("Employee No: "+eno);
        System.out.println("Employee Name: "+ename);
        System.out.println("Employee Salary: "+esal);
    }
}

class employee_dtls{
    public static void main(String args[])
    {
        int n,i,no;
        System.out.println("Enter the number of employees ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        employee e[]=new employee[n];
        try{
                for(i=0;i<n;++i)
                {
                    e[i]=new employee();
                    e[i].read();
                }
                for(i=0;i<n;++i)
                {
                    e[i].disp();
                }

                System.out.println("Enter the Eno of the Employee :");
                no=s.nextInt();
                for(i=0;i<n;++i)
                {
                    if(e[i].eno==no)
                    {
                        System.out.println("Employee Found");
                    }
                }

        }catch(Exception ee)
        {}

    }
}
