package shop.sortings;

import shop.interfaces.Sort;
import shop.models.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName implements Sort {
    Comparator nameComparator = new ProductNameComparator();
    @Override
    public void sorting(List<Product> list){
        Collections.sort(list, nameComparator);
    }
}