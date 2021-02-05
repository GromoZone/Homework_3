import java.util.Scanner;

public class MainZagornov {
    public static void main(String[] args) {
        /*Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
        При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
        После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Привет, давай, поиграем!");
        int num = 10;
        int count = 0;
        int number = (int) (Math.random() * num);
        for (int i = 3; i > 0; i--) {
            System.out.println("Нужно угадать число от 0 до 10.\nВведи свой вариант");
            int answer = sc.nextInt();
            if (answer == number) {
                System.out.println("Вы выиграли, а я проиграл... =(");
                break;
            } else if (answer < number) {
                System.out.println("Ваше число меньше! Осталось " + (i - 1) + " попыток!");
                count++;
            } else {
                System.out.println("Ваше число больше! Осталось " + (i - 1) + " попыток!");
                count++;
            }
        }
        System.out.println("Я проиграл, бывает");
        System.out.println("Повторим? 1 - да, 0 - тоже да, но нет");
        String userData = sc.next();
        if (userData.equals("1")) {
            main(null);
        }
    }
}
