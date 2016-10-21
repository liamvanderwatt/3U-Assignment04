
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create scanner
        int player = 1;
        Scanner input = new Scanner(System.in);
        while (true) {
            
            // asking user for dice sum
            System.out.println("Enter sum of dice:");
            int roll = input.nextInt();
            player = player + roll;
            // adding ladders
            if (player == 9){
                player = 34;
            }
            if (player == 40){
                player = 64;
            }
            if (player == 67){
                player = 86;
            }
            // adding snakes
            if (player == 54){
                player = 19;
            }
            if (player == 90){
                player = 48;
            }
            if (player == 99){
                player = 77;
            }
            // telling user if they won or not
            if (player == 100){
                System.out.println("You Win!");
                break;
            }
            if (player > 100 ){
                
               player = player - roll; 
            }
            // telling user what square they are on
            System.out.println("You are now on square " + player);
            
             
        }
    }
}
