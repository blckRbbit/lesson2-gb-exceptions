package tasks.decisions;

import java.util.Scanner;

public class Task1Decision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println(
                "Укажите индекс элемента массива, " +
                        "в который хотите записать значение 1");
        int index = 0;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        } else {
            System.err.println("Введено не число");
        }

        try {
            arr[index] = 1;
        }
//        catch (InputMismatchException e) {
//            System.err.println("Вы ввели не число");
        // todo не всегда нужно обрабатывать исключения в catch, так как это не очень быстро
//        }
        catch (Exception e) {
            System.err.println("Указан индекс за пределами массива");
        }
    }
}
