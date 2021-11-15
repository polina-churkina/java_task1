//# 1. Пользователь вводит с клавиатуры 4 числа типа int. Сравнить их и вывести наименьшее на консоль.

import java.util.Scanner;
public class Lab1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите 1-e целое число: ");
            int min;
            int num1,num2,num3,num4;
            num1 = in.nextInt();
            min = num1;
            System.out.print("Введите 2-e целое число: ");
            num2 = in.nextInt();
            if(num2 < min) {
                min = num2;
            }
            System.out.print("Введите 3-e целое число: ");
            num3 = in.nextInt();
            if(num3 < min) {
                min = num3;
            }
            System.out.print("Введите 4-e целое число: ");
            num4 = in.nextInt();
            if(num4 < min) {
                min = num4;
            }
            System.out.print("Наименьшее: "+min);
            in.close();
        }
}
