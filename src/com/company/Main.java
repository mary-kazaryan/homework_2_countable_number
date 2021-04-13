package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  Напишите программу которая будет принимать на вход число и
        //  на выход будет выводить сообщение четное число или нет.
        //  Для определения четности числа используйет операцию получения
        //  остатка от деления - операция выглядит так: '% 2').


        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number %2 == 0) {
            System.out.println("Введенное Вами число четное!");
        } else
            System.out.println("Введенное Вами число нечетное!");
                }
    }
