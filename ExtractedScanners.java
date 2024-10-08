package tutorialScanners;

import java.util.Scanner;

public class ExtractedScanners {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		// uses the Scanner class to create a scanner object
		System.out.println("What's your name?");
		String name = scanner.nextLine();
		// scanner object with nextLine method accepts an input for String name etc.
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		// scanner object with nextInt method accepts a numerical input for age
		// adding another .nextLine statement after .nextInt or a similar non-text method would result in the console skipping an input and 
			// jumping to the next output, not being able to clear the scanner 
		scanner.nextLine();
		// is added in this case to circumvent the input-skip
		System.out.println("What's your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Your name is " + name + ".");
		System.out.println("You are " + age + " years old." );
		System.out.println("You like " + food +".");
		
		scanner.close();
//-----------------------------------------------------------------------------------------------------------------------------------------------------		
	
	
		// FINDING THE HYPOTENUSE OF A RIGHT TRIANGLE (e.g. 3, 4, 5 triangle)
				
		double atri;
		double btri;
		double ctri; // 
		// Pythagorean theorem --> atri² + brti² = ctri² 
				
		Scanner scannertri = new Scanner(System.in);
				
		System.out.println("Enter side a of a right triangle (e.g. 3): ");
		atri = scannertri.nextDouble();
		System.out.println("Enter side b or a right triangle (e.g. 4): ");
		btri = scannertri.nextDouble();
		// lets the user enter values for the opposite and adjacent sides of a given right triangle 
				
		// solving the Pythagorean theorem for ctri = sqrt(atri² + btri²)
				
		ctri = Math.sqrt(atri * atri + btri * btri);
		System.out.println("The hypotenuse of your right triangle is: " + ctri);

		scannertri.close();
//--------------------------------------------------------------------------------------------------------------------------------------------
	
		Scanner gameinput = new Scanner(System.in);
		
		System.out.println("Let's play a game! Enter q or Q to quit. Enter anything else to play.");
		String response = gameinput.next(); // assigns the user's next console input to response
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("Do you really want to quit? All your unsaved progress will be lost. Enter y or Y for Yes, or n or N for No.");
			String response2 = gameinput.next(); // added for realism	
		if(response2.equals("y") || response2.equals("Y")) {
			System.out.println("You quit the game successfully. Good bye!");
		}
			else if(response2.equals("n") || response2.equals("N")) {
			System.out.println("Alright, let's keep playing! (The game is over though.)");
		}
		}
		else {
			System.out.println("You won! Congratulations!");
		}
		
		gameinput.close();
		
		// same game but using ! as an operator
		Scanner game2input = new Scanner(System.in);
		
		System.out.println("Let's play another game! Enter q or Q to quit. Enter anything else to play.");
		String response3 = game2input.next();
		
		if(!response3.equals("q") && !response3.equals("Q")) {
			System.out.println("You won! Congratulations!");
		}
		else { 
			System.out.println("You quit the game successfully. Good bye!");
		}
		
		game2input.close();

		
//--------------------------------------------------------------------------------------------------------------------------------------------		
	
		
		Scanner loopscanner = new Scanner(System.in);
		String loopname = "";
	
		while (loopname.isBlank()) { // Returns true if the string is empty or contains only white space code points,otherwise false
			System.out.println("Please enter your name: ");
			loopname = loopscanner.nextLine();
		} // will continue to ask to input a name until something has been typed and confirmed with enter
		System.out.println("Hello "+ loopname);
		
		loopscanner.close();
		
		// DO LOOP
		Scanner doloopscanner = new Scanner(System.in);
		String doloopname = "";
		
		do { // same principle as before, but is set to execute the following block of code at least once, without checking the condition first
			System.out.println("Please, do enter your name again: ");
			doloopname = doloopscanner.nextLine();
		} while(doloopname.isBlank()); //moved behind the block of code we want to execute
		
		
		System.out.println("Hello " + doloopname + ", how you doin'?");
		
		doloopscanner.close();
		
		
//--------------------------------------------------------------------------------------------------------------------------------------------		
		
		
		Scanner nestedscanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Please enter the number of rows for your rectangle: ");
		rows = nestedscanner.nextInt();
		System.out.println("Please enter the number of columns for your rectangle: ");
		columns = nestedscanner.nextInt();
		System.out.println("Please enter the symbol you would like to use to create your rectangle: ");
		symbol = nestedscanner.next();
		
		for( int i=1; i<=rows; i++ ) {
		System.out.println();
			for( int j=1; j<=columns; j++ ) {
			System.out.print(symbol);				// use print instead of println to stay in the same line
			}
		}
			
		nestedscanner.close();
		
		
//--------------------------------------------------------------------------------------------------------------------------------------------		
		
		
	}

}
