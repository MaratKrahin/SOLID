package shop.sortings;

import shop.interfaces.Sort;
import shop.models.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPrice implements Sort {
    Comparator priceComparator = new ProductPriceComparator();
    @Override
    public void sorting(List<Product> list){
        Collections.sort(list, priceComparator);
    }
}

// I - принцип сегрегации (разделения) интерфейса (Interface Segregation Principle)
// класс реализует отдельный интерфейс (похожий по функциональности)