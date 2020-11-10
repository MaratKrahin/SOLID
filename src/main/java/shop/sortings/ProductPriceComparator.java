package shop.sortings;

import shop.models.Product;

import java.util.Comparator;
// I - принцип сегрегации (разделения) интерфейса (Interface Segregation Principle)
// класс реализует отдельный интерфейс (похожий по функциональности)
public class ProductPriceComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2){
        return p1.getPrice() - p2.getPrice();
    }
}