import java.util.Scanner;

public class validation {
	
	public static void collection(int[] [] array, String user) {
		 puzzle puzzleElements = new puzzle();
		for(int i = 0; i < user.length(); i++) {
		char movee = user.charAt(i);
			 String move = Character.toString(movee);
			 puzzleElements.simulate(array,move);
		
			
		}
		 puzzleElements.printPuzzle(array);
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("Input your 4x4 puzzle configuration");
		
		int zero, one, two,three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen;
	
		
		Scanner scn = new Scanner(System.in);
		zero = scn.nextInt(); 
		one = scn.nextInt();
		two = scn.nextInt();
		three = scn.nextInt();
		four= scn.nextInt();
		five = scn.nextInt();
		six = scn.nextInt();
		seven = scn.nextInt();
		eight = scn.nextInt();
		nine = scn.nextInt();
		ten = scn.nextInt();
		eleven =scn.nextInt();
		twelve = scn.nextInt();
		thirteen = scn.nextInt();
		fourteen =scn.nextInt();
		fifteen =scn.nextInt();

	int[][] valArray = {{zero, one, two, three},
			{four, five, six, seven},
			{eight, nine, ten, eleven},
			{twelve, thirteen, fourteen, fifteen}
	};
		
	//	puzzle gameThings = new puzzle();
	//	gameThings.printPuzzle(valArray);
		System.out.println("\n" + "Input your move collection");
		String userInput = scn.next();
		
		collection(valArray,userInput);

		}
	}


