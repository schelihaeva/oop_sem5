package task5_z2;

public class ToDoListPresenter {
    private ToDoListView view;
    private ToDoListModel model;
    private boolean flag;

    public ToDoListPresenter(ToDoListView view, ToDoListModel model) {
        this.model = model;
        this.view = view;
    }

    public void menu() {
        this.flag = true;
        while (flag) {
            System.out.println("1. Добавить задачу в список\n" +
                                "2. Показать весь список задач\n" +
                                "3. Выход\n");
            int choise = view.choise();
            switch (choise) {
                case 1: {
                    String task = view.takeTask();
                    model.addTask(task);
                }
                case 2: {
                    view.showToDoList(model.getList());
                }
                case 3: flag = false;
                default: System.out.println("Такого пункта меню нет!");
            }
        }
    }
    
}