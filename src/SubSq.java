//impoprts
import java.util.*;
/**
 * This Class will calculate if the sequence entered is the subsequence of the second enetered sequence by the user.
 * A Subsequence should containt he characters of the original sequence if not it is not a subsequence.
 * @author Denys Ladden
 * @version Sep 28, 2019
 * Palindrome Project
 * Fall 2019
 */
public class SubSq {
	
	
	private String A;//First sequesnce whcih will be checked
	private String B;//Second sequesnce whcih will be checked
	
	private LinkedStack <Character> seqA = new LinkedStack <Character>();//stack whch hold the chracters for seq A
	private LinkedStack <Character> seqB = new LinkedStack <Character>();//stack which holds the charcters for seq B
	private String resultSeq = "";//String which will hold the reslult of the calulation 
	private boolean subTrue;// returns true if the sequence A is subsequence 
	/**
	 * Empty Constructor
	 */
	public SubSq() {
		
	}//end Subsequence
	
	/**
	 * Constructor that take in two Strings 
	 * @param sOne
	 * @param sTwo
	 */
	public SubSq(String sOne, String sTwo) {
	
	A = sOne;
	B = sTwo;
		fillStacks();
		compareSeq();
	}//end constroctor
	
	/**
	 * A methid whch adds sequences to the stack
	 */
	public void fillStacks() {
		for(int i = A.length(); i > 0; i--) {
			
			seqA.push(A.charAt(i - 1));
			
		}//for
		for(int i = B.length(); i > 0; i--) {
			
			seqB.push(B.charAt(i - 1));
		}//for
		
		
	}//end fill stacks
	
	
	/**
	 * Empties out stacks as long as seq B is full and compares them
	 * and adds the results to the resultSeq
	 */
	public void compareSeq() {
		try {
			while(seqB.isEmpty() == false) {
				if(seqA.peek() == seqB.pop()) {
					resultSeq += seqA.pop();
				}
			}//end while
	
		} catch(java.util.EmptyStackException ignore) {//try: which ignores the error when the stack is empty
			
		}//end ignore exeption 
		
	}//end compare seq
	
	
	/**
	 * Checks if the resulting sequence equals the sequence A and returns a boolean
	 * in subtrue
	 * @return
	 */
	public boolean subsequenceTrue() {
		
		subTrue = resultSeq.equals(A);
	    return subTrue;

	}
	

}//end class!
