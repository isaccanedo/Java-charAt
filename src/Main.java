
public class Main {
	
	/*
	 * What is the output of this code?
	 * (Qual � a sa�da deste c�digo?)
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
