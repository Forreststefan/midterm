/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n = in.nextDouble();
        System.out.print("Enter second number: ");
        double m = in.nextDouble();
        System.out.print("Enter operation (PLUS, MINUS, TIMES, DIVIDE): ");
        String operationInput = in.next().toUpperCase();

        ArithmeticBase.Operation operation;
        try {
            operation = ArithmeticBase.Operation.valueOf(operationInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid operation. Please enter one of PLUS, MINUS, TIMES, DIVIDE.");
            in.close();
            return;
        }

        ArithmeticBase r = new ArithmeticBase();
        r.setX(n);
        r.setY(m);
        double result = r.calculate(operation);

        System.out.println("Result: " + result);
        in.close();
    }
}

