import java.util.Scanner;

import java.util.Random;
import java.util.Arrays;
public class puzzle {

	int [] [] puzzleArray = { {0, 1, 2, 3},
							  {4, 5, 6, 7},
							  {8, 9, 10, 11},
							  {12, 13, 14, 15}					
};
	
	
	public int YindexOf(int [][] array, int value) {
	    for(int i = 0; i < array.length; i++) {
	    	for(int k = 0; k < array.length; k++) {
	    		 if (array[i][k] == value) {
	    	         return k;
	    	       }
	    		}	      
	    }
	    return 00000;
	}
	
	public int XindexOf(int [][] array, int value) {
	    for(int i = 0; i < array.length; i++) {
	    	for(int k = 0; k < array.length; k++) {
	    		 if (array[i][k] == value) {
	    	         return i;
	    	       }
	    		}	      
	    }
	    return 00000;
	}
	
	
	
	public void swap (int[][] array, int ind1, int ind2) {	
		int ind1x, ind1y, ind2x,ind2y; 
		
	// coordinate conversions
	if (ind1 < 10 && ind2 < 10) {
		
		ind1x = 0;
		ind1y = ind1;
		ind2x =	0;
		ind2y =	ind2;
	    int store = array [ind1x][ind1y];	
		 
		 array[ind1x][ind1y] = array[ind2x][ind2y];
		 array[ind2x][ind2y] = store;
		 
		
	}
	else if(ind1 < 10 && ind2 > 10){
		ind1x = 0;
		ind1y = ind1;
		ind2x =	ind2 /10;
		ind2y =	ind2 % 10;
	    int store = array [ind1x][ind1y];	
		 
		 array[ind1x][ind1y] = array[ind2x][ind2y];
		 array[ind2x][ind2y] = store;
		 
		
	}
	else if (ind1 > 10 && ind2 < 0) {
		ind1x = ind1 / 10;
		ind1y = ind1 % 10;
		ind2x =	0;
		ind2y =	ind2;
	    int store = array [ind1x][ind1y];	
		 
		 array[ind1x][ind1y] = array[ind2x][ind2y];
		 array[ind2x][ind2y] = store;
	
	
	}
	else {
	
	  ind1x =	ind1 / 10;
	  ind1y =   ind1 % 10;	
	  ind2x =	ind2 / 10;
	  ind2y =	ind2 % 10;
		
	 int store = array [ind1x][ind1y];	
	 
	 array[ind1x][ind1y] = array[ind2x][ind2y];
	 array[ind2x][ind2y] = store;
	 
	}
	

}
	
	public void printPuzzle (int [][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}	
	}
	
	
	
	public void simulate(int [][] array, String move) {	

  // My get Zero location methods
		
		
	int y; // =	YindexOf(array, 0);
	int x; //=	XindexOf(array, 0);
	int preCoord; //=	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
	int postCoord;
		
		if (move.equals("u") ||  move.equals("U"))  {
			y =YindexOf(array, 0);
			x =	XindexOf(array, 0);
			if(x == 0 ) {
				System.out.print("");			
			}
			else {
					
			 preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
			postCoord = Integer.valueOf(String.valueOf(x-1) + String.valueOf(y));			
			swap(array, preCoord, postCoord);
			}
		}
		else if (move.equals("d") ||  move.equals("D")) {
			y = YindexOf(array, 0);
			x =	XindexOf(array, 0);
			
			if(x == 3) {
				System.out.println("");
			}
			else {
		    preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
			postCoord = Integer.valueOf(String.valueOf(x+1) + String.valueOf(y));
			
			swap(array, preCoord, postCoord);
			}
		}
		else if (move.equals("l") || move.equals("L")) {
			y =YindexOf(array, 0);
			x =	XindexOf(array, 0);
			if(y == 0 ) {
				System.out.print("");			
			}
			else {
		    preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
			postCoord = Integer.valueOf(String.valueOf(x) + String.valueOf(y-1));
			swap(array, preCoord, postCoord);
			}
		}
		else if (move.equals("r") ||  move.equals("R")) {
			y =YindexOf(array, 0);
			x =	XindexOf(array, 0);
			
			if(y == 3) {
				System.out.println("");
			}
			else {
			preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
			postCoord = Integer.valueOf(String.valueOf(x) + String.valueOf(y+1));
			
			swap(array, preCoord, postCoord);
			}
		}		
	}
	
	public void userSimulate(int [][] array, String move) {	

		  // My get Zero location methods
				
				
			int y; // =	YindexOf(array, 0);
			int x; //=	XindexOf(array, 0);
			int preCoord; //=	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
			int postCoord;
				
				if (move.equals("u") || move.equals("U") ) {
					y =YindexOf(array, 0);
					x =	XindexOf(array, 0);
					if(x == 0 ) {
						System.out.print("Impossible move!! Carry on");			
					}
					else {
						
						
					 preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
					postCoord = Integer.valueOf(String.valueOf(x-1) + String.valueOf(y));			
					swap(array, preCoord, postCoord);
					}
				}
				else if (move.equals("d")|| move.equals("D") ) {
					y = YindexOf(array, 0);
					x =	XindexOf(array, 0);
					
					if(x == 3) {
						System.out.print("Impossible move!! Carry on");	
					}
					else {
				    preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
					postCoord = Integer.valueOf(String.valueOf(x+1) + String.valueOf(y));
					
					swap(array, preCoord, postCoord);
					}
				}
				else if (move.equals("l") || move.equals("L") ) {
					y =YindexOf(array, 0);
					x =	XindexOf(array, 0);
					if(y == 0 ) {
						System.out.print("Impossible move!! Carry on");			
					}
					else {
				    preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
					postCoord = Integer.valueOf(String.valueOf(x) + String.valueOf(y-1));
					swap(array, preCoord, postCoord);
					}
				}
				else if (move.equals("r") || move.equals("R") ) {
					y =YindexOf(array, 0);
					x =	XindexOf(array, 0);
					
					if(y == 3) {
						System.out.print("\nImpossible move!! Carry on");	
					}
					else {
					preCoord =	Integer.valueOf(String.valueOf(x) + String.valueOf(y));
					postCoord = Integer.valueOf(String.valueOf(x) + String.valueOf(y+1));
					
					swap(array, preCoord, postCoord);
					}
				}		
			}
	
	public  String getRandom(String[] array) {	
	    int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
	
	public void scramble(int diffi) {
		String [] move = {"u","d","l","r"};	
		
		
		if(diffi == 1) {
			for(int i = 0; i < 7; i++) {
				simulate(puzzleArray,getRandom(move));					
			}
		}
		
		if(diffi == 2) {
			for(int i = 0; i < 13; i++) {
				simulate(puzzleArray, getRandom(move));
			}
		}
		
		if(diffi == 3) {
			for(int i = 0; i < 27; i++) {
				simulate(puzzleArray, getRandom(move));

		}
		}
		
	}

			
		
	
	
	public boolean checkPuzzle (int [][] array) {
		int[][] standardArray = { {0, 1, 2, 3},  {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}			
}; 
		int[][] standardArray2 = {{0, 1, 2, 3},  {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}			
};
		boolean isValidSolution = false;
		
		if(Arrays.deepEquals(array, standardArray)) {
			isValidSolution = true;
		return isValidSolution;
		}
		if(Arrays.deepEquals(array, standardArray2)) {
			isValidSolution = true;
			return isValidSolution;
		}
		
		else {
			return isValidSolution;
		}	
	}
	
	public void puzzleGameMode(int difficulty) {
		Scanner scn = new Scanner(System.in);
		int count =0;
		String userResponse;
		System.out.println("Please use u, d, l, r to move the zero within the puzzle (lowercase)" + "\n");
		
		scramble(difficulty);
		printPuzzle(puzzleArray);
		
		
		while (!checkPuzzle(puzzleArray)) {
			userResponse = scn.nextLine();
			userSimulate(puzzleArray, userResponse);
			System.out.println("\nInput next move-");
			printPuzzle(puzzleArray);
		count++;
		}
		System.out.println("\n" + "Congrats you won the game in " + count + " moves!!!!!");
		
	}

}