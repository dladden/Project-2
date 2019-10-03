//imports
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 * This Class will have
 * 
 * @author Denys Ladden
 * @version Sep 28, 2019
 * Palindrome Project
 * Fall 2019
 */
public class Interface {

	private String A;//first seqence A
	private String B;//second seqence B
	private SubSq subSq;//SubSq object 
	
	private Scanner sc = new Scanner(System.in);//Instentiating a scanner for the users input 
	private String input;//Strnig holder for the users input thriugh scanner
	/**
	 * interface Constructor
	 */
	public Interface() {
		fileOrManual();
	}//end constroctor 
	/**
	 * This method will use users input to diret it to manual or file option of sequence entery
	 */
	public void fileOrManual() {
		System.out.print("Would you like to enter sequence manually or from a file? (M/F): ");
		input = sc.next();
		if(input.equalsIgnoreCase("M")) {
			manual();
			
		}//end if
		else if( input.equalsIgnoreCase("F")){
			file();
		}
	}//end manual or file 
	
	/**
	 * This method is called when the user wants to enter the seqence manualy
	 */
	public void manual() {
		System.out.println("Enter the first sequence: ");
		input = sc.next();
		A = input;//storing first sequence into A 
		System.out.println("Enter the second sequence: ");
		input = sc.next();
		B = input;//storing second sequence into B 
	
			subSq = new SubSq(A, B);//calls to SubSq constructor 
			if(subSq.subsequenceTrue() == true) {
				
				System.out.println(A + "IS A SUBSEQUENCEC of " + B);
				
			}else {
				
				System.out.println(A + "IS NOT A SUBSEQUENCE of " + B);
				
			}//end esle
			
			manualPlus();
			
	}//END MANUAL
	
	
	
	/*
	 * File method is used when the user selects F, promted by fileOrManual
	 * Using specific format checks to see if the files sequnces are 
	 * subsequences or not
	 */
	public void file() {
		
		System.out.print("Enter the name of the file to process: ");
		String fileName = sc.next();
	
		try {	
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			while((input = reader.readLine()) != null ) {
			String[] line = input.split(", ");
			
			A = line[0];
			B = line[1];
			
			subSq = new SubSq(A, B);//calls to SubSq constructor 
			if(subSq.subsequenceTrue() == true) {
				
				System.out.println(A + "IS A SUBSEQUENCEC of " + B);
				
			}else {
				
				System.out.println(A + "IS NOT A SUBSEQUENCE of " + B);
				
			}//end esle
				
			
			
			}//end while	
				
				
		}//end TRY
		catch (java.io.IOException e) {//catching input output exceptions 
			
			
		}//end ctach
	
		
	}//END FILE
	
	/**
	 * Manualplus is extension of manual that asks user if user 
	 * wants to enter more sequences to repeat the process
	 */
	public void manualPlus(){
		
		System.out.println("Would you like to enter more sequences? (Y/N): ");
		input = sc.next();
		if(input.equalsIgnoreCase("Y")) {
		manual();	
		
		}else if(input.equalsIgnoreCase("N")) {
			
			System.out.println(" <END RUN> ");
			
		}//end esle if
			

		
	}//end addition of manualPlus 
	
	
}//end Class
