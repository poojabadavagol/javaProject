package org.studyeasy1;

        import java.util.HashMap;
		import java.util.Map;
		import java.util.Scanner;

		public class RomanToInteger {
		    public static void main(String[] args) {
		        Map<Character, Integer> romanToInteger = new HashMap<>();
		        romanToInteger.put('I', 1);
		        romanToInteger.put('V', 5);
		        romanToInteger.put('X', 10);
		        romanToInteger.put('L', 50);
		        romanToInteger.put('C', 100);
		        romanToInteger.put('D', 500);
		        romanToInteger.put('M', 1000);

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a Roman numeral: ");
		        String romanNumeral = scanner.nextLine().toUpperCase();
		        int result = 0;
		        scanner.close();

		        for (int i = 0; i < romanNumeral.length(); i++) {
		            if (i < romanNumeral.length() - 1 && romanToInteger.get(romanNumeral.charAt(i)) < romanToInteger.get(romanNumeral.charAt(i + 1))) {
		                result -= romanToInteger.get(romanNumeral.charAt(i));
		            } else {
		                result += romanToInteger.get(romanNumeral.charAt(i));
		            }
		        }

		        System.out.println("Integer equivalent: " + result);
		    }
		
		}
		
	

	

