public class Main { 
    public static void main(String[] args) { // создаем по объекту каждого нашего класса
    CalculatorModel model = new CalculatorModel();
    CalculatorView view = new CalculatorView();
    CalculatorPresenter presenter = new CalculatorPresenter(model, view);
    
    presenter.runCalculator();
    }
    }