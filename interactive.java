import java.util.Scanner;


public class interactive {
	public static void main(String[] args) {	
		Scanner scn = new Scanner(System.in);
	
		puzzle game = new puzzle();
		
		System.out.println("------Welcome to the game-------");
		System.out.println("Choose a difficulty " + "\n" + "1 for Easy " + "\n" + "2 for Medium"  + "\n" + "3 for Hard ");
		
		int userResponse = scn.nextInt();
		game.puzzleGameMode(userResponse);
	
	}
}
