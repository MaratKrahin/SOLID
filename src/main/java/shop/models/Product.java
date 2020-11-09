package shop.models;

import lombok.AllArgsConstructor;
import lombok.Data;

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