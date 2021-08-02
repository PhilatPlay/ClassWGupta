package CalcApp;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                ArrayList<Integer> inputs = new ArrayList<>();
                String initScreenView;
                String menuView;
                float answer;
                int calcSelection;
                int methSelection;

                initScreenView = "Please select an option:\r\n"
                        + "1. Regular Calculator\r\n"
                        + "2. EMI Calculator\r\n"
                        + "3. Quit";
                menuView = "What would you like to do with them?:\r\n"
                        + "1. Add them\r\n"
                        + "2. Subtract them\r\n"
                        + "3. Multiply them\r\n"
                        + "4. Divide them";

                Scanner scanner = new Scanner(System.in);
                System.out.println(initScreenView);
                calcSelection = scanner.nextInt();
                while (calcSelection != 3 || calcSelection > 3) {
                if (calcSelection == 1) {
                    System.out.println("Please enter first number");
                    inputs.add(scanner.nextInt());
                    System.out.println("Please enter second number");
                    inputs.add(scanner.nextInt());
                    System.out.println("Your current numbers are: " + inputs.get(0) + " and " + inputs.get(1));
                    System.out.println(menuView);
                    methSelection = scanner.nextInt();

                    if (methSelection == 1) {
                        answer = (inputs.get(0) + inputs.get(1));
                        System.out.println(" -----> Your Answer: " + answer);
                        System.out.println("");
                        inputs.clear();
                    }
                    if (methSelection == 2) {
                        answer = (inputs.get(0) - inputs.get(1));
                        System.out.println(" -----> Your Answer: " + answer);
                        System.out.println("");
                        inputs.clear();
                    }
                    if (methSelection == 3) {
                        answer = (inputs.get(0) * inputs.get(1));
                        System.out.println(" -----> Your Answer: " + answer);
                        System.out.println("");
                        inputs.clear();
                    }
                    if (methSelection == 4) {
                        answer = (inputs.get(0) / inputs.get(1));
                        System.out.println(" -----> Your Answer: " + answer);
                        System.out.println("");
                        inputs.clear();
                    }
                } else if (calcSelection == 2) {
                    System.out.println("Please enter loan amount");
                    inputs.add(scanner.nextInt());
                    System.out.println("Please enter term in years");
                    inputs.add(scanner.nextInt());
                    System.out.println("Please enter the interest rate");
                    inputs.add(scanner.nextInt());
                    System.out.println("");
                    System.out.println("Current Figures ***********");
                    float prince = inputs.get(0);
                    double answerB = inputs.get(2) * .01;
                    float answerB2 = inputs.get(0) * inputs.get(1);
                    double trueB = answerB * answerB2;
                    float answerC = inputs.get(1) * 12;
                    System.out.println("Loan Amount:  $" + inputs.get(0) + "  Term: " + inputs.get(1) + " years"
                            + "  Interest: " + inputs.get(2)  + "%");
                    System.out.println(" -----> Payment per Month: $" + (prince + trueB) / answerC);
                    System.out.println("");
                    inputs.clear();

                }
                    System.out.println(initScreenView);
                    calcSelection = scanner.nextInt();
                }
            }
}
