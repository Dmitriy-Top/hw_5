package ru.hw_5;


import ru.hw_5.Utilites.CommandFactory;
import ru.hw_5.Utilites.ConsoleExectutable;
import ru.hw_5.Utilites.Initializing;
import ru.hw_5.Utilites.Reader;

import java.util.Scanner;

public class Main {
    private static boolean isStop;

    public static void main(String[] args) {
        Initializing.initProductDb();
       Scanner sc = Reader.getInstance();
        System.out.println("Добро пожаловать в интернет-магазин");
        while (!isStop){
            String input = sc.nextLine();
            ConsoleExectutable command = CommandFactory.getCommand(input);
            String result = command.execut();
            System.out.println(result);
        }
    }

    public static void setIsStop(boolean isStop) {
        Main.isStop = isStop;
    }
}
