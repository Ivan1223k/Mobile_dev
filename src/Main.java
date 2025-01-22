import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Задача 1: Четное или нечетное число
//        System.out.println("Введите число: ");
//        int num = scanner.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("Четное");
//        } else {
//            System.out.println("Нечётное");
//        }


//        // Задача 2: Минимальное из трех чисел
//        System.out.println("Введите три числа:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        System.out.println("Минимальное число: " + Math.min(a, Math.min(b, c)));
//
//        // Задача 3: Таблица умножения
//        System.out.println("Таблица умножения на 5: \n");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 x " + i + " = " + (5 * i) );
//            System.out.println("\n");
//
//        }

//        // Задача 4: Сумма чисел от 1 до N
//        System.out.println("Введите число N:");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println("Сумма от 1 до " + n + ": " + sum);


//        // Задача 5: Число Фибоначчи
//        System.out.println("Введите число N для последовательности Фибоначчи:");
//        int n = scanner.nextInt();
//        int first = 0, second = 1;
//        System.out.println("Первые " + n + " чисел Фибоначчи: ");
//        for (int i = 0; i < n; i++) {
//            System.out.println(first + " ");
//            int next = first + second;
//            first = second;
//            second = next;
//        }

//        // Задача 6: Проверка простого числа
//        System.out.println("Введите число для проверки на простое:");
//        int number = scanner.nextInt();
//        boolean isPrime = true;
//        if (number <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//        System.out.println("Число " + number + (isPrime ? " простое." : " не является простым."));

//        // Задача 7: Обратный порядок чисел
//        System.out.println("Введите число N:");
//        int n = scanner.nextInt();
//        System.out.println("Числа от " + n + " до 1:");
//        for (int i = n; i >= 1; i--) {
//            System.out.println(i + " ");
//        }

//        // Задача 8: Сумма четных чисел
//        System.out.println("Введите два числа A и B:");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = 0;
//        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//            if (i % 2 == 0) sum += i;
//        }
//        System.out.println("Сумма четных чисел: " + sum);

//        // Задача 9: Реверс строки
//        System.out.println("Введите строку:");
//        String str = scanner.nextLine();
//        System.out.println("Реверс строки: " + new StringBuilder(str).reverse());

//        // Задача 10: Количество цифр в числе
//        System.out.println("Введите число:");
//        int number = scanner.nextInt();
//        System.out.println("Количество цифр: " + String.valueOf(Math.abs(number)).length());

//        // Задача 11: Факториал числа
//        System.out.println("Введите число N:");
//        int n = scanner.nextInt();
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println("Факториал: " + factorial);

//        System.out.println("Введите число:");
//        int number = scanner.nextInt();
//        int sum = 0;
//        for (char digit : String.valueOf(Math.abs(number)).toCharArray()) {
//            sum += Character.getNumericValue(digit);
//        }
//        System.out.println("Сумма цифр: " + sum);

//        // Задача 13: Палиндром
//        System.out.println("Введите строку:");
//        String str = scanner.nextLine();
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println("Палиндром: " + str.equals(reversed));

//        // Задача 14: Максимальное число в массиве
//        System.out.println("Введите размер массива:");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        System.out.println("Введите элементы массива:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int max = array[0];
//        for (int num : array) {
//            if (num > max) max = num;
//        }
//        System.out.println("Максимальное число: " + max);

//        // Задача 15: Сумма всех элементов массива
//        int sum = 0;
//        int[] array = {1, 2, 3, 4, 5}; // Пример массива с числами
//
//        for (int num : array) {
//            sum += num;
//        }
//        System.out.println("Сумма элементов массива: " + sum);

//        // Задача 16: Количество положительных и отрицательных чисел
//        int positive = 0, negative = 0;
//        int[] array = {1, -1, 3, 4, -2};
//        for (int num : array) {
//             if (num > 0) positive++;
//             else if (num < 0) negative++;
//         }
//         System.out.println("Положительных: " + positive + ", Отрицательных: " + negative);


//         // Задача 17: Простые числа в диапазоне
//         System.out.println("Введите два числа A и B:");
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         System.out.println("Простые числа в диапазоне:");
//         for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
//             boolean isPrime = true;
//             if (i <= 1) continue;
//             for (int j = 2; j <= Math.sqrt(i); j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) System.out.println(i + " ");
//         }


//         // Задача 18: Гласные и согласные
//         System.out.println("Введите строку:");
//         String str = scanner.nextLine().toLowerCase();
//         String vowelsList = "аеёиоуыэюя";

//         int vowels = 0, consonants = 0;
//          for (char ch : str.toCharArray()) {
//              if (vowelsList.indexOf(ch) != -1)
//              {
//                  vowels++;
//              }
//              else if (Character.isLetter(ch))
//              {
//                  consonants++;
//              }
//          }
//          System.out.println("Гласных: " + vowels + ", Согласных: " + consonants);


//        // Задача 19: Перестановка слов
//        System.out.println("Введите строку:");
//        String str = scanner.nextLine();
//        String[] words = str.split(" ");
//        System.out.println("Слова в обратном порядке:");
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.println(words[i] + " ");
//        }
//        System.out.println();


        // Задача 20: Число Армстронга
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int original = number, armstrongSum = 0, digits = String.valueOf(Math.abs(number)).length();
        while (number != 0) {
            int digit = number % 10;
            armstrongSum += (int) Math.pow(digit, digits);
            number /= 10;
        }
        System.out.println("Число " + original + (armstrongSum == original ? " является" : " не является") + " числом Армстронга.");

        scanner.close();
    }
}