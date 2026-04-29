/**
 * 
 */

package testcode.java;
import java.util.Scanner; //Import the Scanner class


/**
 * 
 */
import java.util.Random;


public class WelcomeJaayd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in); 
			
			
			
		
			
		
			System.out.println("Welcome to Jay's Game");
			String[]ht = {"heads", "tails"};
			String computerTurn = ht[new Random().nextInt(ht.length)];
			
			String playerTurn;
			
			while(true) {
				System.out.println("Enter heads or tails: ");
				playerTurn = scanner.nextLine();
				if(playerTurn.equals("heads") || playerTurn.equals("tails")) {
				break;
				}
				
			System.out.println(playerTurn + "invalid entry, please try again.");
			}
			
			System.out.println("Computer played: " + computerTurn);
			
			if (playerTurn.equals(computerTurn)) {
				System.out.println("The game was a tie!");
			}
			
			else if(playerTurn.equals("heads")) {
				if (computerTurn.equals("tails")){
					System.out.println("you won!");
					
			

				}
			}
			
			else if (computerTurn.equals("heads")) {
				System.out.println("You win!");
				
			}
			else if (playerTurn.equals("tails")) {
				System.out.println("Sorry, you lost!");
			}
			
		
				String playAgain ="yes";
			
			while
				(playAgain.equalsIgnoreCase("yes")) {
				System.out.println("Playing Heads or Tails");
				
				System.out.println("Do you want to play again? (yes/no):");
				playAgain = scanner.nextLine();	
				
				if (!playAgain.equals("no"));
				break;
			}
				
				System.out.println("Thank you for playing!");

			
				
				
				
			
				
				
				
					
				scanner.close();	
				
				
			
	
		}
	
	
	}
	







