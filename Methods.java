import java.util.Scanner;

class Methods {
	
		/*
		 * TODO: multiple
		 * Given two numbers, check if the second is multiple of the first
		 * and display result. 
		 * For example, 
		 * Given 5 and 25 this method printouts "True. The number 5 is multiple of 25"
		 * Given 3 and 4 this method printouts "False, The number 3 is not multiple of 4"
		 */


		/*
		 * TODO: monthText
		 * Given a number (1-12), this method returns the appropiate month. 
		 * For example, Given 11 this method returns "November"
		 */

		/*
		 * TODO: randomlySelectedLetter
		 * This method returns a randomly selected letter in the alphabet
		 * For example, it returns the letter 'c'
		 */


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Methods m = new Methods();

        // (1)
		System.out.println("Given two numbers, check if the second is multiple of the first.");
		System.out.print("List two numbers (separated by comma): ");
		String numbers = in.nextLine();
		int num1 = Integer.parseInt(numbers.split(",")[0].trim());
		int num2 = Integer.parseInt(numbers.split(",")[1].trim());
		System.out.printf("Checking if %d is multiple of %d\n", num2, num1);
		m.multiple(num1, num2);

        //(2)
        System.out.print("Type number (1-12): ");
        int monthNum = in.nextInt();
		String month = m.monthText(monthNum);
		System.out.printf("%s is the %d month of the year.\n", month, monthNum);

		//(3)
		char letter = m.randomlySelectedLetter();
		System.out.printf("The letter %s was randomly selected.\n", letter);


	}
}