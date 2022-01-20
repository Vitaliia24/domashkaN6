package ru.skypro;

public class Main {
    int[] payments = generateRandomArray();

    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] payments = new int[30];
        for (int i = 0; i < payments.length; i++) {
            payments[i] = random.nextInt(100_000) + 100_000;
        }
        return payments;

    public static void main(String[] args) {
            // задача номер 1
            int sum = 0;
            for (int i = 0; i < payments.length; i++) {
                sum = sum + payments[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");

            // задача номер 2
            int min = payments[0];
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] < min) {
                    min = payments[i];
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

            int max = payments[0];
            for (int i = 0; i < payments.length; i++) {
                if (payments[i] > max) {
                    max = payments[i];
                }
            }
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

            // задача номер 3
            double average = sum / payments.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

            //задача номер 4
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

            for (int i = reverseFullName.length - 1; i >= 0; i-) {
                System.out.print(reverseFullName[i]);
            }
        }
    }

}
