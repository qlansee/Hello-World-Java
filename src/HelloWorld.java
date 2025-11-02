import org.w3c.dom.ls.LSOutput;

import  java.util.Scanner; // Импортируем класс Scanner
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Это объект который читает (ТОЛЬКО КОНСОЛЬ!!!) то, что вводит пользователь

        String name;
        String job;

        // --- Проверка имени --- //
        while (true) { // Начало цикла, будет повторяться пока мы не получим True от String name
            System.out.println("Enter your name: "); // Просьба ввести имя пользователя
            name = input.nextLine().trim(); // Ждёт пока пользователь введёт данные и нажмёт Enter / Обрезаем пробелы

            if (name.trim().isEmpty()) { // Если строчеа пуста
                System.out.println("Имя не может быть пустым. Попробуйте снова.");
            } else if (!name.matches("[a-zA-Zа-яА-ЯёЁ\\s]+")) {// Добавляем проверку по шаблону
                System.out.println("Имя может содержать только буквы. Попробуйте ещё раз.");
            } else { // После
                break; // Закончить
            }
        }

        // --- Проверка профессии --- //
        while (true) {
            System.out.println("Enter your job: ");
            job = input.nextLine().trim();

            if (job.trim().isEmpty()) {
                System.out.println("Профессия не может быть пустой. Попробуйте снова.");
            } else if (!job.matches("[a-zA-Zа-яА-ЯёЁ\\s]+")) {
                System.out.println("Профессия может содержать только буквы. Попробуйте снова.");
            } else {
                break;
            }
        }
        
        System.out.println("Привет, " + name + ", мы рады что Вы выбрали профессию - " + job + "!");

        input.close();
    }
}