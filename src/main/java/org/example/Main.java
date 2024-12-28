package org.example;

import java.util.Scanner;

 class SportShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Введите имя покупателя: ");
            String name = scanner.nextLine();

            System.out.print("Введите электронную почту покупателя: ");
            String email = scanner.nextLine();

            Customer customer = new Customer(name, email);


            while (true) {
                System.out.print("Введите название покупки (или 'стоп' для завершения): ");
                String item = scanner.nextLine();

                if (item.equalsIgnoreCase("стоп")) {
                    break;
                }

                customer.addPurchase(item);
            }


            System.out.println("\nИнформация о покупателе:");
            System.out.println(customer);

        } catch (IllegalArgumentException e) {

            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {

            System.out.println("Произошла ошибка: " + e.getMessage());
        } finally {
            System.out.println("Спасибо за использование приложения магазина спортивной одежды!");
        }

        scanner.close();
    }
}