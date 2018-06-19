import java.util.Scanner; //Importing scanner for later use
public class Calculator
{
    public static void main (String [] arg)
    {
        Scanner scanny=new Scanner(System.in);
        System.out.print("Enter first operand:");
        float numFirstOperand=scanny.nextFloat(); //declaring the value of the first number
        System.out.print("Enter second operand:");
        float numSecondOperand =scanny.nextFloat(); //declaring the value of the second number
        System.out.println("Calculator Menu"); //this is the menu
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which operation do you want to perform?");
        float numResponse=scanny.nextFloat();
        if (numResponse==1) //creating paths for the menu options
        {
            System.out.println("The result of the operation is "+(numFirstOperand+numSecondOperand)+". Goodbye!");
        }
        else if (numResponse == 2) //  if subtraction is performed
        {
            System.out.println("The result of the operation is "+(numFirstOperand - numSecondOperand)+". Goodbye!");
        }
        else if (numResponse == 3) // if multiplication is performed
        {
            System.out.println("The result of the operation is "+(numFirstOperand*numSecondOperand)+". Goodbye!");
        }
        else if (numResponse == 4) // if division is performed
        {
            System.out.println("The result of the operation is "+(numFirstOperand / numSecondOperand)+". Goodbye!");
        }
    else //creating error message for improper input
        {
            System.out.println("Error: Invalid selection! Terminating program.");
            System.exit(0);//Command found on stackoverflow.com
        }
    }
}
