import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DealerShip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java DearlerShip");
        System.out.println("Select option 'a' to buy a car");
        System.out.println("Select option 'b' to sell a car");

        String option = scan.nextLine();

        switch(option){
            case "a": 
                System.out.println("what is you budget");
                int budget = scan.nextInt();
                if(budget>10000){
                    System.out.println("great! a nissan is available");
                    System.out.println("\nDo you have insurance? yes or no");
                    scan.nextLine();
                    String insurance = scan.nextLine();
                    System.out.println("\ndo you have license, yes or not");
                    String license = scan.nextLine();
                    System.out.println("what is your credit score?");
                    int creditScore = scan.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                        System.out.println("sold, pleasure doing business with you");
                    }

                }else{
                    System.out.println("sorry, you are too poor");
                }break;

            case "b": 
            System.out.println("\nWhat is your car's valued at?"); 
            int value = scan.nextInt();
            System.out.println("\nwhat is your selling price?");
            int price = scan.nextInt();

            if(value>price && price<30000 ){
                System.out.println("\nwe will buy");
            }else{
                System.out.println("\nget out, too expensive");
            }

            
            break;
            default: System.out.println("invalid option");
        
        
        
        
        scan.close();
        



        
        }



    }
}
