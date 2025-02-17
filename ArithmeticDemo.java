public class ArithmeticDemo {
    public static void main(String[] args) {
        // Step 1: Declare and Initialize Integer Variables
        int num1 = 10;
        int num2 = 5;

        // Step 2: Declare and Initialize a Double Variable
        double num3 = 3.0;

        // Step 3: Perform Addition
        int sum = num1 + num2;
        
        // Step 4: Perform Subtraction
        int difference = num1 - num2;
        
        // Step 5: Perform Multiplication
        int product = num1 * num2;
        
        // Step 6: Perform Integer Division
        int quotient = num1 / num2;

        // Step 7: Perform Modulus Operation
        int remainder = num1 % num2;

        // Step 8: Demonstrate Operator Precedence
        // The expression: num1 + num2 * 2 - (num1 / num2)
        // Following the precedence, multiplication and division happen before addition and subtraction.
        // So, num2 * 2 is computed first, then num1 / num2, and finally the addition and subtraction.
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        // Step 9: Output the Results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); // Order of operations: num1 + (num2 * 2) - (num1 / num2)
    }
}
