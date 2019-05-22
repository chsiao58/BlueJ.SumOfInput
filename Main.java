import java.util.Scanner;
/**
 * This program take ant interger input n from user,
 * and then it will print the sum of the numbers from 1 to n
 * 
 * Create by Joanna Hsiao
 */
public class Main {

    public static void main()
    {
        int userNum = 0;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number.");
        
        userNum = input.nextInt();
        
        for(int i = 1; i <= userNum; i++)
            sum += i;
            
        System.out.println("The sum is from 1 to " 
        + userNum + " is "+ sum);
    }
}
