package org.example;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private String email;
    private List<String> purchases;

    // Конструктор
    public Customer(String name, String email) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым!");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Неверный формат электронной почты!");
        }

        this.name = name;
        this.email = email;
        this.purchases = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым!");
        }
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Неверный формат электронной почты!");
        }
        this.email = email;
    }


    public void addPurchase(String item) {
        if (item == null || item.isEmpty()) {
            throw new IllegalArgumentException("Название товара не может быть пустым!");
        }
        purchases.add(item);
    }


    public List<String> getPurchases() {
        return purchases;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', email='" + email + "', purchases=" + purchases + '}';
    }
}