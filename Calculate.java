public class Calculate {
	public static void main (String [] args) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[1]);
		int sum = first + second;
		System.out.println("Sum: "  + sum);
		
		int subtraction = first - second;
		System.out.println("Substraction: " + subtraction);
		
		int multiplication = first * second;
		System.out.println("Multiplication: " + multiplication);
		
		int division = first/second;
		System.out.println("Division: " + division);
		
		int power = (int)Math.pow(first, second);
		System.out.println(first + " to the power " + second + ": " + power);
	}
}	