import java.util.*;

class Teacher{
	String name;
	String dept;
	int age;
	
	void read(){
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter age :");
			age=s.nextInt();
			System.out.println("Enter name :");
			s.nextLine();
			name=s.nextLine();
			System.out.println("Enter department : ");
			dept=s.nextLine();
		}catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
		
	void disp(){
		System.out.println("Teacher Details");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Department : "+dept);
	}
}

class Student extends Teacher{
	String sname;
	String sdept;
	int sage;
	void read(){
		super.read();
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter age :");
			sage=s.nextInt();
			System.out.println("Enter name :");
			s.nextLine();
			sname=s.nextLine();
			System.out.println("Enter department : ");
			sdept=s.nextLine();
		}catch(Exception e){
			System.out.println("Error : "+e);
		}
	}
	void disp(){
		super.disp();
		System.out.println("\nStudent Details");
		System.out.println("Name : "+sname);
		System.out.println("Age : "+sage);
		System.out.println("Department : "+sdept);
	}
}

class method_override{
	public static void main(String args[])
	{	
		int ch=0;
		Student st=new Student();
		Scanner s=new Scanner(System.in);
		while(ch!=3){
			try{
				System.out.println("1. Read\n2.Display\n3.Exit\nEnter choice : ");
				ch=s.nextInt();
				switch(ch){
					case 1:
						st.read();
						break;	
					case 2:	
						st.disp();
						break;
				}
			}catch(Exception e)
			{}
		}
	}
}
