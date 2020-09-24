package Calculator;

import java.util.Scanner;

public class Calculator {
    int num1, num2;
    char operation;
    String text;

    Scanner scanner = new Scanner(System.in);

    public void initInput() {
        System.out.print("Это калькулятор. Введите желаемое число, знак операции (+,-,*,/) и другое число: ");
        text = scanner.nextLine();
    }

    public void initVariablesFromInput() {
        try {
            String [] blocks = text.split("[+-/*]");
            num1 = Integer.parseInt(blocks[0]);
            operation = text.charAt(blocks[0].length());
            num2 = Integer.parseInt(blocks[1]);
        }
        catch (RuntimeException e) {
            throw new IllegalArgumentException("Данные были введены неверно");
        }
    }

    public int evaluate() {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Введите корректный знак операции");
        }
        return result;
    }
}
