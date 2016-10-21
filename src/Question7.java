
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating a scanner
        Scanner input = new Scanner(System.in);
        // geting the speed limit
        System.out.println("Enter speed limit");
        int limit = input.nextInt();
        // getting drivers speed
        System.out.println("Enter drivers speed");
        int driver = input.nextInt();
        // creating fine variables
        int limit2 = limit + 20;
        int limit3 = limit + 30;
        if (driver <= limit) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
      if (driver >limit &&driver <limit2){
          System.out.println("You are speeding and your fine is $100");
          
      }
      if (driver >limit2 &&driver <limit3){
          System.out.println("You are speeding and your fine is $270");
          
      }
      if (driver > limit3){
          System.out.println("You are speeding and your fine is $500");
      }
    }
}
