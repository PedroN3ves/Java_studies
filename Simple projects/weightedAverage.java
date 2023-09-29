import java.util.Scanner;

public class weightedAverage
{
    private static Scanner input = new Scanner(System.in);
    private static double n1, n2, n3;
    private static int w1 = 3, w2 = 3, w3 = 4;
    private static double mulResult, finalResult; 
    private static int finalWeight = w1 + w2 + w3;
    
    public static void main(String[] args) {
        average();
    }
    static void average(){
        multiplication();
        
        finalResult = mulResult/finalWeight;
        
        System.out.println("Your weighted average is " + finalResult);
    }
    
    static void multiplication(){
        insert();
        
        mulResult = (n1*w1)+(n2*w2)+(n3*w3);
    }
    
    static void insert(){
        System.out.println("Choose the first number: ");
        n1 = input.nextDouble();
        
        System.out.println("Choose the second number: ");
        n2 = input.nextDouble();
        
        System.out.println("Choose the third number: ");
        n3 = input.nextDouble();
    }
}
