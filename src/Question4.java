
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner 
        Scanner input = new Scanner(System.in);
        // ask the user to enter ticket price
        System.out.println("Please enter ticket price");
        double price = input.nextDouble();
        // asking user for expenses
        System.out.println("Please enter expenses");
        double exp1 = input.nextDouble();
        double exp2 = input.nextDouble();
        double exp3 = input.nextDouble();
        double exp4 = input.nextDouble();
        double exp5 = input.nextDouble();
        double exp6 = input.nextDouble();
        //geting the total expense
        double allexp = exp1 + exp2 + exp3 + exp4  + exp5 + exp6;
        double sales = allexp/price;
        sales = Math.ceil(sales);
        System.out.println(sales);
    }
}
