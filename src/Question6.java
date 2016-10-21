
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vandl4973
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating a scanner
        Scanner input = new Scanner(System.in);
        //asking for daytime minutes
        System.out.println("Please enter  daytime minutes");
        double day = input.nextDouble();

        //asking for evening minutes
        System.out.println("Please enter  evening minutes");
        double eve = input.nextDouble();

        //asking for weekend minutes
        System.out.println("Please enter  weekend minutes");
        double week = input.nextDouble();

        // working out the free minutes at the beginning
        double priceA = 0;
        double priceB = 0;
        if (day >= 100) {
            priceA = day - 100;
        }

        // working out the free minutes at the beginning

        if (day >= 250) {
            priceB = day - 250;


        }
        // deter mining daytime price
        double priceA1 = priceA * 0.25;
        double priceB1 = priceB * 0.45;
        // determining the price of the evening
        double priceA2 = eve * 0.15;
        double priceB2 = eve * 0.35;
        // determinig the price of the weekend cost
        double priceA3 = week * 0.20;
        double priceB3 = week * 0.25;
        // determine total price total price 
        double planA = priceA1 + priceA2 + priceA3;
        double planB = priceB1 + priceB2 + priceB3;
        // telling the user the price of each plan
        System.out.println("The price of plan A" + planA);
        System.out.println("The price of plan B" + planB);
        if (planA > planB) {
            System.out.println("Plan B is the cheapest ");
        } 
        if (planB > planA){
            System.out.println("Plan A is the cheapest ");
        }
        if (planB==planA)
            System.out.println("They are the same");
    }
}
