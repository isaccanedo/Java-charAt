
public class Main {
	
	/* +---------------------------------------------
	 * | @author Isac Canedo
	 * +---------------------------------------------
	 */
	
	/*
	 * What is the output of this code?
	 * (Qual é a saída deste código?)
	 * 
	 * 1 - ello ==> correct
	 * 2 - The code does not compile
	 * 3 - Hello
	 * 4 - A runtime exceptions is thrown
	 * 
	 */

	public static void main(String[] args) {
		
		String message = "Hello";
		for (int i = 0; i < message.length(); i++) {
			
			System.out.println(message.charAt(i + 1));
			
		}		
		
	}

}
