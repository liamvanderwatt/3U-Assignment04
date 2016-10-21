
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // new scanner
        Scanner input = new Scanner(System.in);
        //asking for name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        //asking user for how much the test was out of
        System.out.println("What was test1 out of");
        double test1 = input.nextDouble();
        //asking user for there results
        System.out.println("What mark did you get");
        double mark1 = input.nextDouble();
        double perc1 = mark1 / test1;
        System.out.println(perc1);
        //asking user for how much the test was out of
        System.out.println("What was test2 out of");
        double test2 = input.nextDouble();
        //asking user for there results
        System.out.println("What mark did you get");
        double mark2 = input.nextDouble();
        double perc2 = mark2 / test2;
        System.out.println(perc2);
        //asking user for how much the test was out of
        System.out.println("What was test3 out of");
        double test3 = input.nextDouble();
        //asking user for there results
        System.out.println("What mark did you get");
        double mark3 = input.nextDouble();
        double perc3 = mark3 / test3;
        System.out.println(perc3);
        //asking user for how much the test was out of
        System.out.println("What was test4 out of");
        double test4 = input.nextDouble();
        //asking user for there results
        System.out.println("What mark did you get");
        double mark4 = input.nextDouble();
        double perc4 = mark4 / test4;
        System.out.println(perc4);
        //asking user for how much the test was out of
        System.out.println("What was test5 out of");
        double test5 = input.nextDouble();
        //asking user for there results
        System.out.println("What mark did you get");
        double mark5 = input.nextDouble();
        double perc5 = mark5 / test5;
        System.out.println(perc5);
        //adding all the test scores together
        double total = perc1 + perc2 + perc3 + perc4 + perc5;
        // determining the average
        double avg = total / 5;
        System.out.println(avg);
    }
}
