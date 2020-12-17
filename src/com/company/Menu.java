package com.company;

import java.util.Scanner;

public class Menu {
    private static Scanner in = new Scanner(System.in);
    private static Workwithdata workwithdata;

    static {
        workwithdata = new Workwithdata();
        workwithdata.add(new Republic("Россия",146748590,1991,"Республика"));
        workwithdata.add(new Republic("Беларусь",9408400,1991,"Республика"));
        workwithdata.add(new Monarchy("Япония",125961625,660,"Монархия",780));
        workwithdata.add(new Monarchy("ОАЭ",9992083,1971,"Монархия",7));
        workwithdata.add(new Federation("Германия", 83149300,1871,"Федерация","Берлин"));
        workwithdata.add(new Federation("США", 328239523,1492,"Федерация","Вашингтон"));
    }

    public static void Menu(){
        int choice=-1;
        while(choice!=0) {
            System.out.println("Меню действий над базой данных");
            System.out.println("1. Вывести базу данных о странах.");
            System.out.println("2. Добавить страну с республиканской формой правления в базу данных.");
            System.out.println("3. Добавить страну с федеративной формой правления в базу данных.");
            System.out.println("4. Добавить страну с монархией, как формой правления в базу данных.");
            System.out.println("5. Удалить страну из базы данных.");
            System.out.println("6. Вывести страны только с монархической формой правления.");
            System.out.println("7. Вывести страны только с республиканской формой правления.");
            System.out.println("8. Вывести страны только с федеративной формой правления.");
            System.out.println("0. Выход из базы данных.");
            try {
                choice = check();
            } catch (Exception ex) {
                System.out.println("Ошибка ввода, введите число:");
                while (true) {
                    try {
                        choice = check();
                        break;
                    } catch (Exception e) {
                        System.out.println("Ошибка ввода, введите число:");
                    }
                }
            }
            switch (choice){
                case 1:
                    workwithdata.print();
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 2:
                    System.out.print("Название страны: ");
                    String name = in.nextLine();
                    System.out.print("Население (человек): ");
                    int population= checkPopulation();
                    System.out.print("Год создания: ");
                    int year = borders(1,2020);
                    String formPr = "Республика";
                    workwithdata.add(new Republic(name,population, year, formPr));
                    System.out.print("Страна добавлена"+"\n");
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 3:
                    System.out.print("Название страны (Федерация): ");
                    name = in.nextLine();
                    System.out.print("Население (человек): ");
                    population= checkPopulation();
                    System.out.print("Год создания: ");
                    year = borders(1,2020);
                    formPr = "Федерация";
                    System.out.print("Столица: ");
                    String capital = in.nextLine();
                    workwithdata.add(new Federation(name,population, year, formPr, capital));
                    System.out.print("Страна добавлена"+"\n");
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 4:
                    System.out.print("Название страны (Монархия): ");
                    name = in.nextLine();
                    System.out.print("Население (человек): ");
                    population = checkPopulation();
                    System.out.print("Год создания: ");
                    year = borders(1,2020);
                    formPr = "Монархия";
                    System.out.print("К-во городов: ");
                    int cityes = checkCyties();
                    workwithdata.add(new Monarchy(name,population, year, formPr, cityes));
                    System.out.print("Страна добавлена"+"\n");
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 5:
                    System.out.print ("Введите номер в базе данных: ");
                    int id = check();
                    workwithdata.delete(id);
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 6:
                    System.out.println("Вывод стран только с монархической формой правления.");
                    workwithdata.printMonarchy();
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 7:
                    System.out.println("Вывод стран только с республиканской формой правления.");
                    workwithdata.printRepublic();
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 8:
                    System.out.println("Вывод стран только с федеративной формой правления.");
                    workwithdata.printFederation();
                    System.out.print("---------------------------------------------"+"\n");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Такого пункта нет в меню.");
                    break;
            }
        }

    }

    private static int check() {
        int reader = -1;
        try{
            reader = Integer.parseInt(in.nextLine());
        }
        catch (NumberFormatException ex){
            System.out.print("Ошибка ввода, введите число:");
            reader = check();
        }
        return reader;
    }
    private static int checkPopulation()
    {
        int population;
        do {
            population = check();
            if(population < 1){
                System.out.println("Население должно быть больше нуля.");

            }
        }while (population < 1);
        return population;
    }
    private static int checkCyties()
    {
        int cityes;
        do {
            cityes = check();
            if(cityes < 1){
                System.out.println("Количество городов должно быть больше нуля.");

            }
        }while (cityes < 1);
        return cityes;
    }


    private static int borders(int min, int max)
    {
        int value;
        value= check();
        if(value < min || value > max){
            System.out.println("Значение не может быть меньше "+ min + " и больше "+ max);

        }
        while (value < min || value > max) {
            value = check();
            if (value < min || value > max) {
                System.out.println("Значение не может быть меньше " + min + " и больше " + max);

            }
        }
        return value;
    }
}


