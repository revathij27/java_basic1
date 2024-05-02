import java.io.*;

 class maxfunc {
    public static int findMaxOfTwo(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }


    public static int findMaxOfThree(int num1, int num2, int num3) {
        int maxOfTwo = findMaxOfTwo(num1, num2);
        return (maxOfTwo > num3) ? maxOfTwo : num3;
    }

    public static void main(String[] args) {
        DataInputStream input = new DataInputStream(System.in);

        try {    
            System.out.print("Enter the first number: ");
            int num1 = Integer.parseInt(input.readLine());

            System.out.print("Enter the second number: ");
            int num2 = Integer.parseInt(input.readLine());

            System.out.print("Enter the third number: ");
            int num3 = Integer.parseInt(input.readLine());
            int maxOfThree = findMaxOfThree(num1, num2, num3); 
	    System.out.println("The maximum of the three numbers is: " + maxOfThree);

            input.close();
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}
