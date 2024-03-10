public class CalculatorModel {
    public double calculate(double num1, double num2, char operator) {
    double result = 0;
    switch (operator) {
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
    if (num2 != 0) {
    result = num1 / num2;
    }
    break;
    }
    return result;
    }
    }