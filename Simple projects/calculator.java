
import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        double num1, num2, result;
        char operator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose the first number: ");
        num1 = input.nextDouble();
        
        System.out.println("Choose the operator +, -, * or /");
        operator = input.next().charAt(0);
        
        System.out.println("Choose the second number: ");
        num2 = input.nextDouble();
        
        switch(operator){
            case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;
            
            case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
            
            case '*':
            result = num1*num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
            
            case '/':
            result = num1/num2;
            System.out.println(num1 + " / " + num2 + " = " + result);
            break;
            
            default:
            System.out.println("Error!");
        }
        input.close();
    }
}
