
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vandl4973
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //scanner
        Scanner input = new Scanner(System.in);
    //enter name
        System.out.println("Please Enter Name");
        // get the name from the user      
                String name = input.nextLine();
                // say hello and how are you today
                System.out.println("Hello "  +name+ " How are you today ");
    }
}
