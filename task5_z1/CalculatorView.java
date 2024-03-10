//view -для того , чтобы мы могли видеть и взимодействовать
import java.util.Scanner;

public class CalculatorView {
private Scanner scanner; // определяем поле сканер,чтобы онон было доступно в поле класса

public CalculatorView() {
scanner = new Scanner(System.in); //используем сканер для взаимовдействия, создаем объект
}

public double getOperand(String prompt) { //берем число
System.out.print(prompt);
return scanner.nextDouble();
}

public char getOperator() {
System.out.print("Введите оператор (+, -, *, /): ");
return scanner.next().charAt(0); //берем первую строку и первый символ
}

public void displayResult(double result) { // выводим результат на экран
System.out.println("Результат: " + result);
}
}
