import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		String firstWord;
		System.out.print("Input an integer: ");
		firstWord = 5 + in.nextLine();
		System.out.println(Integer.parseInt(firstWord) + 5);	
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		String secondWord;
		System.out.print("Input a number: ");
		secondWord = 4 + in.nextLine() + 3;
		System.out.println(Double.parseDouble(secondWord) + 3.4);	
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		String thirdWord;
		System.out.print("Input a boolean: ");
		thirdWord = in.nextLine();
		System.out.println(!(Boolean.parseBoolean(thirdWord)));	
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		String fourthWord;
		System.out.print("Input an integer: ");
		fourthWord = in.nextLine() + 3;
		System.out.println((char)(Integer.parseInt(fourthWord) + 2));
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		String fifthWord;
		System.out.print("Input an integer: ");
		fifthWord = in.nextLine() + 1;
		System.out.println((double)(Integer.parseInt(fifthWord)/2));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		String sixthWord;
		System.out.print("Input a number: ");
		sixthWord = 1 + in.nextLine();
		System.out.println((int)(Double.parseDouble(sixthWord)));
		
	}

}
