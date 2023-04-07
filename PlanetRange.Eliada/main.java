//Planet Rage Calculator
//Eliada Ballazhi
//24/03/2023

import java.util.Scanner;
public class main {

    public static void main(String[] args){
        //sCANNER to take input
        Scanner scanner = new Scanner(System.in);

        //Outside loop; to be shown once
        System.out.println("Welcome to the planet calculator!\n");
        System.out.println("Please choose one of the options below:\n");
        System.out.println("*****************************************");

        //Planet object
        planet planet = null;

        //WHile loop
        while (true) {
           
            System.out.println("1. Create a new planet");
            System.out.println("2. Calculate the range of an object thrown upwards");
            System.out.println("3. Exit");

            //User choide & use of switch
            int choice = scanner.nextInt();
            scanner.nextLine(); 


            switch (choice) {
                case 1:
                    System.out.println("Enter the planet name: ");
                    String planetName = scanner.nextLine();
                    System.out.println("Enter the planet gravity: ");
                    double planetGravity = scanner.nextDouble();
                    planet = new planet(planetName, planetGravity);
                    System.out.println("You have created " + planet.getName() + " with a gravity of " + planet.getGravity());
                    System.out.println("*****************************************");
                    break;
                case 2:
                    if (planet == null) {
                        System.out.println("No planet has been created. Plse create a planet first!!!");
                        break;
                    }
                    System.out.println("Enter the angle (in radians): ");
                    double angle = scanner.nextDouble();
                    System.out.println("Enter the initial speed (in m/s): ");
                    double speed = scanner.nextDouble();
                    scanner.nextLine(); 
                    double range = planet.calculateRange(angle, speed);
                    System.out.printf("Range of object thrown upwards at angle %.2f and initial speed %.2f m/s on planet %s: %.2f meters\n", angle, speed, planet.getName(), range);
                    break;
                case 3:
                    System.out.println("Thank you for using the Planet Range Calculator. Bye!");
                    System.out.println("********************************************+");
                    break;
                default:
                    System.out.println("System error! Please try again!");
                    break;
            
            }        

        }
    }  
       
}
    