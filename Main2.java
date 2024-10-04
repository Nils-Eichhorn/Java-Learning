// Tutorial by Bro Code ( https://www.youtube.com/watch?v=rWCnZKF-U3Q&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=6 )

package myFirstProgram;

import javax.swing.JOptionPane;

import java.util.Random;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
//---------------------------TEXTS----------------------------27-09-2024-
		
	// COMMENTS
		
		// This is a single-line comment
		
		/* This
		 * is
		 * a
		 * multi-line
		 * comment
		 */
		
		/* Everything in between /* 
		 * 
		 *					and */ 
		 
		/* counts as part of a 
		 * 
		 * multi-line comment
		 */
		
	// PRINT()
		System.out.print("I like pizza!");
		System.out.print("It is yummy.");
		// "print" alone prints text in a single line.
		
	// ESCAPE SEQUENCES (A.K.A. ANYTHING STARTING WITH A "\")
		System.out.print("I like 2 pizzas!\n");
		System.out.print("It is yummy 2.\n\n");
		// "\n" equals pressing enter to jump to the next line
		
	// OTHER ESCAPE CHARACTERS
		System.out.print("\tI like 3 \t\tpizzas!\n\t");
		System.out.print("\tIt is yummy 3.\n\n");
		// "\t" equals pressing tab
		
		System.out.print("I like \"pizza\"!\n");
		// "\"" prints a quotation mark
		System.out.print("\\I like pizza!\\\n");
		// "\\" prints a backslash
		
	// PRINTLN()
		System.out.println("I like ln pizzas!"); 
		System.out.println("It is ln yummy\n");
		// "println" prints the respective text in a separate line
		// like pressing enter after a line
		
	// MISCELLANEOUS SHORTCUTS
		
		// sysout + Ctrl & Space = System.out.println()
		
		// Ctrl + F --> Find & Replace (instead of changing a large number of lines manually)
		
		// Ctrl + + --> zoom in; Ctrl + - --> zoom out (do not use the numpad + and - though)
		
		
//-----------------------VARIABLES----------------------28-09-2024-
		
// DATA TYPES
	
	/*   8 primitive data types (store data, limited, can only hold one value, use less memory, are comparatively faster) 
	 * + 1 reference data type (store an address, unlimited because user-defined, can hold more than one value, use more memory, are comparatively slower)  
	 */
		
	// BOOLEAN 
		
		// primitive data type that uses 1 bit, namely "true" or "false"
		
		boolean boot = true;
		boolean boof = false;
		
		System.out.println(boot);
		System.out.println(boof + "\n");
		
	// INTEGERS
		
		// BYTE
		
		// primitive data type that uses 1 byte. can store integers from -128 to 127
		
		byte bx = Byte.MIN_VALUE;
		byte by = Byte.MAX_VALUE;
		// Datatype.MIN_VALUE and Datatype.MAX_VALUE hold the minimum and maximum storage capability respectively
		
		System.out.println(bx);
		System.out.println(by + "\n");
		
		byte bx2 = -128;
		byte by2 = 127;
		
		System.out.println(bx2);
		System.out.println(by2 + "\n");
		
	// SHORT
		
		// primitive data type that uses 2 bytes. can store integers from -32768 to 32767
		
		short sx = Short.MIN_VALUE;
		short sy = Short.MAX_VALUE;
		
		System.out.println(sx);
		System.out.println(sy + "\n");
		
		short sx2 = -32768;
		short sy2 = 32767;
		
		System.out.println(sx2);
		System.out.println(sy2 + "\n");
		
	//INT
		
		// primitive data type that uses 4 bytes. can store integers from negative -2147483648 to 2147483647
		
		int ix = Integer.MIN_VALUE;
		int iy = Integer.MAX_VALUE;
		
		System.out.println(ix);
		System.out.println(iy + "\n");
		
		int ix2 = -2147483648;
		int iy2 = 2147483647;
		
		System.out.println(ix2);
		System.out.println(iy2 + "\n");
		
	//LONG
		
		// primitive data type that uses 8 bytes. can store integers from -9223372036854775808 to 9223372036854775807
		
		long lx = Long.MIN_VALUE;
		long ly = Long.MAX_VALUE;
		
		System.out.println(lx);
		System.out.println(ly + "\n");
		
		
		
		long lx2 = -9223372036854775808L;
		long ly2 = 9223372036854775807L;
		// assigned values need to be followed by "L" by convention !!!!!!!!!!!!
		
		System.out.println(lx2);
		System.out.println(ly2 + "\n");
		
  // DECIMALS
		
	// FLOAT
		
		// primitive data type that uses 4 bytes. can store fractional numbers up to 6-7 digits
		
		float fx = 3.141592f;
		// assigned values need to be followed by "f" by convention !!!!!!!!!!!!
		
		System.out.println(fx + "\n");
		
	// DOUBLE
		
		// primitive data type that uses 8 bytes. can store fractional numbers up to 15 digits
		
		double dx = 3.141592653589793;
				
		System.out.println(dx + "\n");
		
	// CHARACTERS
		
		// CHAR 
		
		// primitive data type that uses 2 bytes. can store a single character/ letter/ ASCII value
		
		// assigned values need to be in between 'inverted commas'
		
		char cx = 'm';
		
		System.out.println(cx + "\n");
		
		// STRING
		
		// reference data type that uses memory depending on its makeup. can store a sequence of characters.
		
		String greeting = "Hello world!";
		
		System.out.println(greeting + "\n");
		
// CREATING VARIABLES
		
		// DECLARATION
		
		int yda; // defines an integer called yda 
		
		// ASSIGNMENT
		
		yda = 123; // assigns the value 123 to yda 
		
		System.out.println(yda + "\n");
		
		// INITIALIZATION = DECLARATION + ASSIGNMENT IN ONE STEP
		
		int yi = 456; // defines an integer called yi and assigns the value 456
		
		System.out.println(yi + "\n");
		
		// COMBINING DIFFERENT DATA TYPES
		
		// different data types can be printed together by using "+" in between them
		
		String Personal = "My number is: ";
		
		int yc = 789;
		
		System.out.println(Personal + yc + "\n");
		
		
//-------------------SWAPPING TWO VARIABLES------------------29-09-2024-
		
		
		String swapx = "coffee";
		String swapy = "green tea";
		
		System.out.println("swap x: " + swapx);
		System.out.println("swap y: " + swapy + "\n");
		
		swapx = swapy;
		
		System.out.println("swap x: " + swapx);
		System.out.println("swap y: " + swapy + "\n");
		
//----------------------------------------------------------------------		
		
		String swapx2 = "coffee2";
		String swapy2 = "green tea2";
		
		System.out.println("swap x2: " + swapx2);
		System.out.println("swap y2: " + swapy2 + "\n");
		
		swapy2 = swapx2;
		
		System.out.println("swap x2: " + swapx2);
		System.out.println("swap y2: " + swapy2 + "\n");
		
		// assigning one variable directly to the other results in both variables being the same

//----------------------------------------------------------------------		
		
		// another (temporary) variable needs to be introduced
		
		String swapx3 = "coffee3";
		String swapy3 = "green tea3";
		String temp;
		
		// the temporary variable is used as an empty "container" for another variable
		
		System.out.println("swap x3: " + swapx3);
		System.out.println("swap y3: " + swapy3 + "\n");
		
		temp = swapx3;
		// one of the variables is then placed in the "container"
		// swapx3 is now "empty"
		
		swapx3 = swapy3;
		//swapy3 can now be placed inside swapx3, becoming "empty" in turn
		
		swapy3 = temp;
		//lastly, the value of swapx3 that had been stored in temp gets assigned to swapy3
		
		System.out.println("swap x3: " + swapx3);
		System.out.println("swap y3: " + swapy3 + "\n");
		// the contents of the two variables have successfully been swapped 
		
		
//--------------------ACCEPTING USER INPUT------------------30-09-2024-
		
		// import java.util.Scanner; beforehand, outside of the public class
		
	    /*     Scanner scanner = new Scanner(System.in);
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
		
		TAKEN OUT TO GET THE OPTIONPANE-PORTION TO WORK UNTIL I FIND A WAY TO RUN BOTH AT THE SAME TIME */
		
//--------------------ARITHMETIC EXPRESSIONS--------------------01 10-2024-
		
		
		// an expression is a combination of operands and operators
		// operands represent values, variables, numbers or quantities
		// operators are symbols (+, -, *, /, %) for addition, subtraction, multiplication, division and percentages respectively
		
		int plants = 40;
		
		plants = plants + 1;
		// plants and 1 are the summands, + is the operator to add them up to a sum
		System.out.println(plants);
		// displays the sum
		
		plants = plants - 2;
		// plants is now the minuend and 2 is the substrahend, - is the operator to subtract the substrahend from the minuend
		System.out.println(plants);
		// displays the difference
		
		plants = plants * 2;
		// plants as well as 2 are factors or multipliers
		System.out.println(plants);
		// displays the product
		
		plants = plants / 3;
		// plants is now the dividend and 3 is the divisor
		System.out.println(plants);
		// displays the quotient		
		
		plants++;
		// shorthand for incrementing a variable by 1
		System.out.println(plants);
		
		plants--;
		//shorthand for decreasing a variable by 1
		System.out.println(plants);
		
		// when simply dividing two integers resulting in a remainder, the quotient's decimal places will be truncated
		// thus, double or float should be chosen for divisions of integers
		
		float pie = 10f;
		pie = pie / 3;
		System.out.println(pie + " pieces of pie per person.");
		
		double cake = 10;
		cake = cake / 3;
		System.out.println(cake + " pieces of cake per person.");
		
			
//-----------------------------GUI--------------------------02-10-2024-
		
		
		// import javax.swing.JOptionPane; beforehand, outside of the public class
		
	 	/* String name2 = JOptionPane.showInputDialog("Please enter your name");
		// shows a Pane prompting the user to enter their name and confirm or cancel. the name gets stored as a String value
		JOptionPane.showMessageDialog(null, "Hello " + name2 + "!");
		// reacts on confirmation by showing another Message-dialogue box with a personalized greeting
		// cancellation gives out "Hello null!" instead.
		
		int age2 = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
		// show.InputDialog by itself only accepts String as a data type. Integer.parseInt () fixes that. 
		JOptionPane.showMessageDialog(null, "You are " + age2 + " years old");
		
		float height = Float.parseFloat(JOptionPane.showInputDialog("Please enter your height in meters, using \".\" as a decimal separator ;)"));
		// the standard locale does not use comma as a decimal separator
		JOptionPane.showMessageDialog(null, "You are " + height + " m tall"); 
		*/
	
		
		// tried finding a more elegant solution via google/ stackoverflow but gave up for now. 
		
		/* Locale locale = Locale.GERMANY;
		
		JOptionPane.setDefaultLocale(locale);
		
		double height2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height in meters, this time using \",\" as a separator :)"));
		
		JOptionPane.showMessageDialog(null, "You are " + height2 + " m tall"); */
		
		
//---------------------------MATH----------------------------03-10-2024-		
		
		
		double am = 2.71828;
		double bm = -10;
		
	// Math.max(a,b)
		double cm = Math.max(am, bm);
		// compares two numeric values and assigns the larger to another variable
		System.out.println(cm);
		
	// Math.min(a,b)
		double dm = Math.min(am, bm);
		// compares two numeric values and assigns the lesser to another variable
		System.out.println(dm);
		
	// Math.abs(a,b)
		double absb = Math.abs(bm);
		// assigns the absolute value of a number to another variable
		System.out.println(absb);
		
	// Math.sqrt(a)
		double em = 16;
		
		double sqrte = Math.sqrt(em);
		// assigns the square root of a number to another variable
		System.out.println(sqrte);
		
	// Math.round(a)
		double amr = Math.round(am);
		// rounds a number to the closest integer
		System.out.println(amr);
		
	// Math.ceil(a)
		double fm = 3.14;
		double fmc = Math.ceil(fm);
		// always rounds UP to the next larger integer
		System.out.println(fmc);
		
	// Math.floor(a)
		double amf = Math.floor(am);
		// always rounds DOWN to the next smaller integer
		System.out.println(amf);
		
// FINDING THE HYPOTENUSE OF A RIGHT TRIANGLE (e.g. 3, 4, 5 triangle)
		
		/* double atri;
		double btri;
		double ctri; // 
		// Pythagorean theorem --> atri² + brti² = ctri² 
		
		         Scanner scannertri = new Scanner(System.in);
		
		System.out.println("Enter side a (e.g. 3): ");
		atri = scannertri.nextDouble();
		System.out.println("Enter side b (e.g. 4): ");
		btri = scannertri.nextDouble();
		// lets the user enter values for the opposite and adjacent sides of a given right triangle 
		
		// solving the Pythagorean theorem for ctri = sqrt(atri² + btri²)
		
		ctri = Math.sqrt(atri * atri + btri * btri);
		System.out.println("The hypotenuse is: " + ctri);
		
		scannertri.close();    
		     
		*/
		
		
	// Optional way with input via OptionPane for convenience
		/* double sidea = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of side a of the right triangle (e.g. 3)"));
		JOptionPane.showMessageDialog(null, "Side a is " + sidea + " units long." );
		
		double sideb = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of side b of the right triangle (e.g. 4)"));
		JOptionPane.showMessageDialog(null, "Side b is " + sideb + " units long.");
		
		double hypotenuse = Math.sqrt(sidea * sidea + sideb * sideb);
		JOptionPane.showMessageDialog(null, "The hypotenuse of the right triangle is " + hypotenuse + " units long");
		*/
		
//----------------------RANDOM NUMBERS----------------------04-10-2024-
		
		
		// import java.util.Random; beforehand, outside of the public class 
		
		Random random = new Random(); // cf. Scanner
		
		// creates !pseudo-random! numbers
		
		int xr = random.nextInt();
		System.out.println(xr); 
		// outputs span the entire range of the respective data type's storage capabilities
		
		int xrdice1 = random.nextInt(6);
		System.out.println(xrdice1);
		// limits the range of possible integers, but includes 0
		
		int xrdice2 = random.nextInt(6)+1;
		System.out.println(xrdice2);
		// excludes 0, resulting in random integers between 1 and 6
		
		double yr = random.nextDouble();
		System.out.println(yr);
		// outputs a random decimal between 0 and 1
		double yrp1 = random.nextDouble()+1;
		System.out.println(yrp1);
		// adding to the random.nextDouble shifts the results accordingly 
		
		boolean zr = random.nextBoolean();
		System.out.println(zr);
		// outputs either true or false
		
		
//-----------------------IF STATEMENTS---------------------04-10-2024-	
		
		
		// if statement = performs a block of code (within {}) if its condition evaluates to be true
		
		/* int age3 = 17;
		
		if(age3>=18) {
			System.out.println("You are of age! Have a schnaps!");
		}
		else if(age3>=16 && age3<18) { // && allows for multiple conditions in the same (else) if statement 
			System.out.println("You are older than 16! Have a beer!");
		}
		else { 
			System.out.println("You are not an adult yet. No booze for you.");
		}
		*/
		
		//application with user-input 
		int age4 = Integer.parseInt(JOptionPane.showInputDialog("Good evening and welcome to our bar! How old are you, if I may ask?"));
		
		if (age4 >= 18) {
			JOptionPane.showMessageDialog(null, "You're of age! Have a schnaps!");
		}
		else if (age4 >= 16 && age4 < 18) {
			JOptionPane.showMessageDialog(null, "You're older than 15 but not 18 yet! Have a beer!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You're too young to be in here! Get out!");
		}
			
			
			
			
	}	 
	
	
}