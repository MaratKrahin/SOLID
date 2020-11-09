package shop.sortings;

import shop.models.Product;

import java.util.Comparator;

public class ProductRatingComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        return p1.getRating() - p2.getRating();
    }
}