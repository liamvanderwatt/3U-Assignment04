
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner
        Scanner input = new Scanner(System.in);
        //ask the user to enter the measurement in inches
        System.out.println("Please enter measurement in inches");
        double measurement = input.nextDouble();
        //multiply by 2.54
        double ans = measurement*2.54;
        System.out.println(ans);
                
    }
}
