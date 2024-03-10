package task5_z2;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListView {
    private Scanner scanner;

    public ToDoListView() {
        scanner = new Scanner(System.in);
    }

    public int choise() {
        System.out.println("Выберете пункт меню: ");
        return scanner.nextInt();
    }

    public String takeTask() {
        System.out.println("Напишите задачу: ");
        return scanner.next().toString();
    }

    public void showToDoList(ArrayList<String> toDoList) {
        for (String task : toDoList) {
            System.out.println(task);
        }
    }
    

}