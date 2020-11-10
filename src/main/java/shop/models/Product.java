package shop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

//O - принцип открытости/закрытости(Open Closed Principle)
// Программные сущности должны быть открыты для расширения, но закрыты для модификации
@Data
@AllArgsConstructor
public class Product {
    private String name;
    private int price;
    private int rating;


    @Override
    public String toString() {
        return this.getName() + ", стоимость: " + this.getPrice() + ", средняя оценка: " + this.getRating();
    }
}