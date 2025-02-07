public class Main {
    public static void main(String[] args) {
        // Check if exactly two arguments are passed
        if (args.length != 2) {
            System.err.println("Please provide exactly two integers as arguments.");
            System.exit(1); // Exit with an error code
        }

        try {
            // Parse the command line arguments to integers
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            
            // Print the integers
            System.out.println("First Integer: " + firstNumber);
            System.out.println("Second Integer: " + secondNumber);
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format. Please provide valid integers.");
        }
    }
}
