/* H O M E W O R K   # 8
 * C S C   1 5
 * 
 * Student's Name Here: Ani Muradyan
 * 
 * Follow the directions on the Homework #8 hand out and submit this file via Canvas by the due date.
 * 
 * */
package Main;

public class Homework8{
	public static void main(String[] args){
		// TODO: Follow Homework #8 instructions for assignment and place code below...
		// Feel free to use the p() method to print text instead of System.out.println()
		EZFileWrite ezw = new EZFileWrite("testwrite.txt");
		// TODO: Write file data...
		for (int i = 1; i <= 5; i++) {
			ezw.writeLine("Test Line #" + i);
		}
		ezw.saveFile();
		
		// TODO: Read file data in and display...
		EZFileRead ezr = new EZFileRead("testwrite.txt");
		int loopAmt = ezr.getNumLines();
		for (int i = 0; i < loopAmt; i++) {
			p(ezr.getLine(i));
		}
		
		// TODO: Append to a file...
		EZFileWrite eza = new EZFileWrite("testwrite2.txt");
		for (int i = 0; i < loopAmt; i++) {
			eza.writeLine(ezr.getLine(i));
		}
		
		for (int i = 1; i <= 3; i++) {
			eza.writeLine("Append Line #" + i);
		}
		eza.saveFile();
		
		// TODO: Display results of new file
		EZFileRead ezr2 = new EZFileRead("testwrite2.txt");
		loopAmt = ezr2.getNumLines();
		for (int i = 0; i < loopAmt; i++) {
			p(ezr2.getLine(i));
		}
	}
	
	public static void p(String out){
		System.out.println(out);
	}
}