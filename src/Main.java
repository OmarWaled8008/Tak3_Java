// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // here we made the user choose the datatype of the numbers
        System.out.println("press 1 for int :- ");
        System.out.println("press 2 for float :- ");
        System.out.println("press 3 for double :- ");
        System.out.print("Enter here : ");
        // we take the user's choice value to use it in if condition
        // This if statement specifies which method will be used on the variables
        Scanner myObj = new Scanner(System.in);
        int choice = myObj.nextInt();
        if (choice == 1) {
            // Integer
            System.out.print("please enter the first number : ");
            int num1 = myObj.nextInt();
            System.out.print("please enter the secound number : ");
            int num2 = myObj.nextInt();
            JavaMath Jsum=new JavaMath();
            System.out.print("SUM :  ");
            Jsum.sum(num1,num2);
            System.out.print("SUB :  ");
            Jsum.sub(num1,num2);

        } else if (choice == 2) {
            // Float
            System.out.print("please enter the first number : ");
            float num1 = myObj.nextFloat();
            System.out.print("please enter the secound number : ");
            float num2 = myObj.nextFloat();
            JavaMath Jsum2=new JavaMath();
            System.out.print("SUM :  ");
            Jsum2.sum(num1,num2);
            System.out.print("SUB :  ");
            Jsum2.sub(num1,num2);
        } else if (choice == 3) {
            // Double
            System.out.print("please enter the first number : ");
            double num1 = myObj.nextDouble();
            System.out.print("please enter the secound number : ");
            double num2 = myObj.nextDouble();
            JavaMath Jsum3=new JavaMath();
            System.out.print("SUM :  ");
            Jsum3.sum(num1,num2);
            System.out.print("SUB :  ");
            Jsum3.sub(num1,num2);
        } else {
            System.out.println("sorry that's not an option");
            return;
        }
    }
}
// here the java class
class JavaMath{

    // this empty default constructor just to declare an instance
    JavaMath(){}


    // here the sum and sub overloading methods
    void sum(int num1,int num2){
        int result=num1+num2;
        System.out.println(result);
    }
    void sub(int num1,int num2){
        int result=num1-num2;
        System.out.println(result);
    }
//    /////////////////////////
void sum(float num1,float num2){
    float result=num1+num2;
    System.out.println(result);
}
    void sub(float num1,float num2){
        float result=num1-num2;
        System.out.println(result);
    }
//    ////////////////////////////
void sum(double num1,double num2){
    double result=num1+num2;
    System.out.println(result);
}
    void sub(double num1,double num2){
        double result=num1-num2;
        System.out.println(result);
    }
}