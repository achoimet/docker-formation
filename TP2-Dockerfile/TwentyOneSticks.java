 import java.util.Scanner;
 
 public class TwentyOneSticks {
   
   public static void main(String[] args) {
     
     int numSticks = 21;
     System.out.println("Voulez vous commencer ? (y/n)");
     Scanner input = new Scanner(System.in);
     String goFirst = input.nextLine();
     Scanner take = new Scanner (System.in);
     int numToTake = 0;
     
     while (numSticks > 0) {
       
       if (goFirst.equals("y") || goFirst.equals("Y")) {
         System.out.println("Il y a " + numSticks + " bâtonnets");
         System.out.println("Combien de bâtonnets choisissez vous (1 ou 2) ?");
         numToTake = take.nextInt();
         
         if (numToTake > 2) {
           numToTake = 2;
           
         }
         
         else if (numToTake < 1) {
           numToTake = 1;
         }
         numSticks = numSticks - numToTake;
         
         if (numSticks <= 0) {
           System.out.println("Dommage, vous avez perdu");
         }
         else {
           
           if((numSticks - 2) % 3 == 0 || numSticks - 2 == 0) {
             numToTake = 1;
           }
           else {
             numToTake = 2;
           }
           System.out.println("L'ordinateur prend " + numToTake + " bâtonnets" );
           numSticks = numSticks - numToTake;
           
           if (numSticks <= 0) {
             System.out.println("Champion du monde");
           }
         }
         
      }
      else {
             System.out.println("Vous avez donc peur de m'affronter..");
			 numSticks = 0;
           }
         }
         
     }
   }
   