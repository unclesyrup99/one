import java.util.Scanner;
public class calculator{
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);

     displayMenu();
     System.out.print("Enter your choice: ");
     int choice = scan.nextInt();

     if(choice == 1){
       System.out.print("Enter two numbers to add: ");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       System.out.println("Sum = " + add(num1, num2));
     }
     
 
  }

  public static void displayMenu(){
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Subtract with doubles");
    System.out.println("4. Multiple");
    System.out.println("5. Divide");
 }

 public static int add(int a, int b){
    int sum = a + b;
    return sum;
 }

 public static int subtract(int a, int b){
    return a - b;
 }
 public static double multiply(double a, double b){
	    return  a * b;  
	 }
 public static double divide(double a, double b){
	    return  a / b;  
	 }

 public static double dsubtract(double a, double b){
	   double difference = a-b;
	   return difference;

	 }
    
 public static void calc(){
	   Scanner scan = new Scanner(System.in);
	  displayMenu();

	     System.out.print("Enter your choice: ");

	     int choice = scan.nextInt();

	 

	     if(choice == 1){

	       System.out.print("Enter two numbers to add: ");

	       int num1 = scan.nextInt();

	       int num2 = scan.nextInt();

	       System.out.println("Sum = " + add(num1, num2));

	     }

	     

	     else if (choice == 2){

	    System.out.print("Enter two numbers to subtract: ");

	    int num1 = scan.nextInt();

	        int num2 = scan.nextInt();

	        System.out.println("Difference = " + subtract(num1, num2));

	        

	    }

	 

	     else if (choice == 3){

	    System.out.print("Enter two numbers to subtract: ");

	    double num1 = scan.nextDouble();

	        double num2 = scan.nextDouble();

	        System.out.println("Difference = " + dsubtract(num1, num2));

	    }
//multiplication
	     else if (choice == 4){
	    System.out.print("Enter two numbers to multiply: ");

	    double num1 = scan.nextDouble();

	        double num2 = scan.nextDouble();

	        System.out.println("Product = " + multiply(num1, num2));

	  }
 //division
	     else if (choice == 5){
System.out.print("Enter two numbers to divide");
double num1 = scan.nextDouble();

double num2 = scan.nextDouble();

System.out.println("Quotient = " + divide(num1, num2));
 }
	   
	    
}
}