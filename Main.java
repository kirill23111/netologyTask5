import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("0. Выход из программы");
            System.out.println("1. Добавить дело");
            System.out.println("2. Показать дела");
            System.out.println("3. Удалить дело по номеру");
            System.out.println("4. Удалить дело по названию");
            System.out.print("Ваш выбор: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "0":
                    System.out.println("Выход из программы.");
                    return;

                case "1":
                    System.out.print("Введите название задачи: ");
                    String task = scanner.nextLine().trim();
                    if (!tasks.contains(task)) {
                        tasks.add(task);
                        System.out.println("Добавлено!");
                    } else {
                        System.out.println("Такое дело уже есть!");
                    }
                    printTasks(tasks);
                    break;

                case "2":
                    printTasks(tasks);
                    break;

                case "3":
                    System.out.print("Введите номер для удаления: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine().trim());
                        if (index >= 1 && index <= tasks.size()) {
                            tasks.remove(index - 1);
                            System.out.println("Удалено!");
                        } else {
                            System.out.println("Нет дела с таким номером.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка ввода номера.");
                    }
                    printTasks(tasks);
                    break;

                case "4":
                    System.out.print("Введите задачу для удаления: ");
                    String text = scanner.nextLine().trim();
                    if (tasks.remove(text)) {
                        System.out.println("Удалено!");
                    } else {
                        System.out.println("Нет дела с таким текстом.");
                    }
                    printTasks(tasks);
                    break;
            }
        }
    }

    private static void printTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст.");
        } else {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}

