package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.

		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s) -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");

		// 2. Call the printCustonMessage method using a lambda so that the String
		// prints backwards.
		SpecialPrinter backwards = (s) -> {
			String reverse = "";
			for (int i = s.length() - 1; i <= 0; i--) {
				reverse += s.charAt(i);
			}
			s = reverse;
		};
		printCustomMessage(backwards, "hello");
		// 3. Call the printCustonMessage method using a lambda so that the String
		// prints with a mix between upper an lower case characters.
		SpecialPrinter mixed = (s) ->{
			String mix = "";
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 0) {
					s = s.toLowerCase();
					mix += s.charAt(i);
				}
				else{
					s = s.toUpperCase();
					mix += s.charAt(i);

				}
			}
			System.out.println(mix);
		};
		printCustomMessage(mixed, "does this even work");
		
		
		// 4. Call the printCustonMessage method using a lambda so that the String
		// prints with a period in between each character.
		SpecialPrinter dot = (s) -> {
			StringBuilder bob = new StringBuilder(s);
			for(int i = 0; i < bob.length(); i++) {
				if(i % 2 != 0) {
					bob.insert(i, ".");
				}
			}
			System.out.println(bob.toString());
		};
		printCustomMessage(dot, "testing");
		
		
		// 5. Call the printCustonMessage method using a lambda so that the String
		// prints without any vowels.
		SpecialPrinter vowels = (s) -> {
			String regex = "[aeiou]";
			String result = s.replaceAll(regex, "");
			System.out.println(result);
		};
		printCustomMessage(vowels, "hmm not sure how many vowels this sentence has");
	}

	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
