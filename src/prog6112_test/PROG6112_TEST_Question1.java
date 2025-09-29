/**
 * @author Nkosinathi Maqungela ST10450853
 */
package prog6112_test;

import java.util.Scanner;
import java.util.ArrayList;


public class PROG6112_TEST_Question1 { 
    public static void main(String[] args) {
        
        //declaring the variables used to store the player runs
        String JacquesKingsmead;
        String JacquesStGeorges;
        String JacquesWanderers;
        String HashimKingsmead;
        String HashimStGeorges;
        String HashimWanderers;
        String ABKingsmead;
        String ABStGeorges;
        String ABWanderers;
        
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        
        while (!done) {
            System.out.println("\nSA CRICKETER APPLICATION");
            System.out.println("---------------------------------------------");
        
            System.out.println("Enter the number of runs scored by Jacques "
                               + "Kallis at KINGSMEAD: ");
            JacquesKingsmead = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by Hashim "
                               + "Amla at KINGSMEAD: ");
            HashimKingsmead = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by Ab de "
                               + "Villiers at KINGSMEAD: ");
            ABKingsmead = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by Jacques "
                               + "Kallis at ST GEORGES: ");
            JacquesStGeorges = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by Hashim "
                               + "Amla at ST GEORGES: ");
            HashimStGeorges = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by AB de "
                               + "Villiers at ST GEORGES: ");
            ABStGeorges = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by Jacques "
                               + "Kallis at WANDERERS: ");
            JacquesWanderers = scanner.nextLine();
        
            System.out.println("Enter the number of runs scored by Hashim "
                               + "Amla at WANDERERS: ");
            HashimWanderers= scanner.nextLine();
          
            System.out.println("Enter the number of runs scored AB de "
                               + "Villiers at WANDERERS: ");
            ABWanderers= scanner.nextLine();
            
            //displays the values combined
            System.out.println("---------------------------------------------");
            System.out.println("RUNS SCORED REPORT");
            System.out.println("---------------------------------------------");
            
            System.out.println("Jacques Kallis runs scored at KINGSMEAD: " 
                                + JacquesKingsmead);
            System.out.println("Jacques Kallis runs scored at ST GEORGES: " 
                                + JacquesStGeorges);
            System.out.println("Jacques Kallis runs scored at WANDERES: " 
                                + JacquesWanderers);
            
            System.out.println("Hashim Amla runs scored at KINGSMEAD: " 
                                + HashimKingsmead );
            System.out.println("Hashim Amla runs scored at ST GEORGES: " 
                                + HashimStGeorges );
            System.out.println("Hashim Amla runs scored at WANDERERS: " 
                                + HashimWanderers );
            
            System.out.println("AB de Villiers runs scored at KINGSMEAD: " 
                                + ABKingsmead );
            System.out.println("AB de Villiers runs scored at ST GEORGES: " 
                                + ABStGeorges );
            System.out.println("AB de Villiers runs scored at WANDERERS: " 
                                + ABWanderers );
            
            System.out.println("---------------------------------------------");
            System.out.println("TOTAL RUNS AT STADIUMS");
            System.out.println("---------------------------------------------");
            
            System.out.println("KINGSMEAD  " + (JacquesKingsmead +
                                HashimKingsmead + ABKingsmead));
            
            System.out.println("ST GEORGES  " + (JacquesStGeorges +
                                HashimStGeorges + ABStGeorges));
            
            System.out.println("WANDERERS  " + (JacquesWanderers +
                                HashimWanderers + ABWanderers));
            
            
           
        }
    }
      
}
    
