package shop.interfaces;

import shop.models.Product;

import java.util.List;

//I - интерфейс имеет один метод для конкретного назначения

public interface Sort {
    void sorting(List<Product> list);
}