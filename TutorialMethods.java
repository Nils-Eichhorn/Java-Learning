package TutorialMethods;

public class TutorialMethods {

	public static void main(String[] args) {
		
//---------------------METHODS--------------------16-10-2024-
		
		
		// method = a block of code that is executed whenever it is called upon
		
				String methodsname = "Hancock";
				int methodsage = 42;
				hello(); 						// within main method
				hello();						// can be called upon at any time and as often as needed 
				hello("John");					// values can be added, need to contain matching parameters 
				hello(methodsname);				// variables can be added, need to contain matching parameters/ arguments
				hello(methodsname, methodsage);
				int xmethods = 3;
				int ymethods = 4;
				int zmethods = add(xmethods, ymethods); // calls add method (int zmethods is a local variable and only recognized only in the immediate set of curly braces of the main method 
														// declaring this variable is optional
				System.out.println(zmethods);
				System.out.println(add(xmethods, ymethods));
				
				
//---------------OVERLOADED METHODS---------------18-10-2024-	
				
				
		// overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature
				
				int OLx = sum(1,2,3,4);
				System.out.println(OLx);
				
			}	// end of main method
			
			static void hello() {				// outside of main method, "static" needs to be added to make hello referable to the static main method 
				System.out.println("Hello");
			}
			
			static void hello(String helloname) {			// arguments do not need to have the same name as the variables
				System.out.println("Hello Mr. "+ helloname);
			}
			
			static void hello(String methodsname, int methodsage) {
				System.out.println("Good day, Mr. "+ methodsname);
				System.out.println("You are "+methodsage+ " years old.");
				}
			
			// RETURN TYPES
			static int add(int xmethods, int ymethods) {	// data type of the value that needs to be returned instead of the usual void
				
				int zmethods = xmethods + ymethods;			// could also just return xmethods + ymethods;
				return zmethods; 
				}

			
//---------------OVERLOADED METHODS---------------18-10-2024-
			
			
			static int sum(int OLa, int OLb) {
				System.out.println("This is overloaded method #1");
				return OLa + OLb;
			}
			static int sum(int OLa, int OLb, int OLc) {
				System.out.println("This is overloaded method #2");
				return OLa + OLb + OLc;
			}
			static int sum(int OLa, int OLb, int OLc, int OLd) {
				System.out.println("This is overloaded method #3");
				return OLa + OLb + OLc + OLd;
			}
			

}
