//объединяем model и view
public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;
    
    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
    this.model = model;
    this.view = view;
    }
    
    public void runCalculator() {
    double num1 = view.getOperand("Введите первое число: ");
    char operator = view.getOperator();
    double num2 = view.getOperand("Введите второе число: ");
    
    double result = model.calculate(num1, num2, operator); //сохраняем результат
    
    view.displayResult(result);
    }
    }