package shop.models;

import java.util.ArrayList;
import java.util.List;


public class User {
    String name;
    int id;

    List<Product> basket = new ArrayList<>();

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addToBasket(Product i) {
        basket.add(i);
    }

    public void printBasket() {
        for (Product i : basket) {
            System.out.println(i);
        }
    }

    public int sumCost() {
        int cost = 0;
        for (Product i : basket) {
            cost += i.getPrice();
        }
        return cost;
    }
}