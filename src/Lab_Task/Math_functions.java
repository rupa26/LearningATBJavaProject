package Lab_Task;

public class Math_functions {
        public static void main(String[] args) {
            // Given values
            double x = 10.0;
            double y = 10.0;
            double z = 10.0;

            // Compute the expression: ∛(x² + y² - |z|)
            double result = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));

            // Print the result
            System.out.println("Result: " + result);
        }
    }
    /*
    Square the values of x and y using Math.pow(x, 2) and Math.pow(y, 2).
    Take the absolute value of z using Math.abs(z).
    Compute the cube root of the result using Math.cbrt(...).
    Now, if you run this with X = 10, Y = 10, Z = 10, the computed result will be:*/
//