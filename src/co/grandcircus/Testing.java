package co.grandcircus;

public class Testing {

	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			String cont = "yes";
			
			while (cont.equals("yes")) {
				// your code should start here!
				
				System.out.println("Play!");
				
				
				// your logic should stop here if it doesn't need to be included in the 
				// loop
				System.out.println("Do you want to continue? (yes/no)");
				cont = scan.next();			
			}
			
			// this is our indication that the program has ended
			System.out.println("Goodbye!");
			scan.close();
			
		}
		
	}

	}

}
