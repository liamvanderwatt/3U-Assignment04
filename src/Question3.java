
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating scanner
        Scanner input = new Scanner(System.in);
        // asking user for four numbers
        System.out.println("Please enter 4 numbers on seprate lines");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        // putting the numbers in a single line
        System.out.println(num1 + "," + num2 + "," + num3 + "and" + num4);

    }
}
