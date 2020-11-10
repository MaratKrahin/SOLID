package shop.ui;


import shop.interfaces.Sort;
import shop.models.Product;
import shop.models.ToyCar;
import shop.models.ToyDoll;
import shop.models.User;
import shop.sortings.SortByName;
import shop.sortings.SortByPrice;
import shop.sortings.SortByRating;

import java.util.*;

public class StartApp {
    public static void startApp() {
        User user = new User("Max", 1);
        List<Product> dolls = new ArrayList<>();
        Map<String, List<Product>> products = new HashMap<>();
        List<Product> cars = new ArrayList<>();
        cars.add(new ToyCar("Ferrari", 2200, 9, 10));
        cars.add(new ToyCar("Porsche", 1500, 8, 12));
        cars.add(new ToyCar("BMW", 1100, 7,10));
        cars.add(new ToyCar("Lada", 600, 3, 11));
        dolls.add(new ToyDoll("Giuseppe", 2500, 6, true));
        dolls.add(new ToyDoll("Luisa", 2100, 4, false));
        dolls.add(new ToyDoll("Alfredo", 4300, 7, true));
        dolls.add(new ToyDoll("Magdalena", 3650, 20, false));

        products.put("Cars", cars);
        products.put("Dolls", dolls);


        while (true) {
            System.out.println("Категории товаров:");
            printCategory(products);

            System.out.println("Введите название катергории");
            Scanner scanner = new Scanner(System.in);
            String categoryStr = scanner.nextLine();

            if (!products.containsKey(categoryStr)) {
                System.out.println("Такой категории не существует");
            } else {
                System.out.println("Доступные товары: ");
                printProducts(products, categoryStr);
            }

            System.out.println("Для фильтрации введите да, для отмены нажмите enter");
            String needToFilter = scanner.nextLine();
            if (needToFilter.equals("да")) {
                System.out.println("Введите номер фильтрации");
                System.out.println("1 - фильтр по наименованию");
                System.out.println("2 - фильтр по цене");
                System.out.println("3 - фильтр по рейтингу");
                int filterNumber = Integer.parseInt(scanner.nextLine());
                switch (filterNumber) {
                    case 1:
                        Sort byName = new SortByName();
                        byName.sorting(products.get(categoryStr));
                        printProducts(products, categoryStr);
                        break;
                    case 2:
                        Sort byPrice = new SortByPrice();
                        byPrice.sorting(products.get(categoryStr));
                        printProducts(products, categoryStr);
                        break;
                    case 3:
                        Sort byRating = new SortByRating();
                        byRating.sorting(products.get(categoryStr));
                        printProducts(products, categoryStr);
                }
            }

            System.out.println("Для добавления товара в корзину введите его название");
            String good = scanner.nextLine();

            user.addToBasket(findProduct(products, categoryStr, good));

            System.out.println("Хотите закончить выбор товаров? Введите да/нет");
            String cont = scanner.nextLine();
            if (cont.equals("да")) {
                break;
            }
        }


        System.out.println("Ваша корзина:");
        user.printBasket();
        System.out.println("Общая стоимость товаров в корзине: " + user.sumCost());
    }


    public static void printCategory(Map<String, List<Product>> goods) {
        int i = 0;
        for (String s : goods.keySet()) {
            i++;
            System.out.println(i + " " + s);
        }
    }

    public static void printProducts(Map<String, List<Product>> products, String category) {
        int number = 0;
        for (Product i : products.get(category)) {
            number++;
            System.out.println(number + " " + i);
        }
    }

    public static Product findProduct(Map<String, List<Product>> products, String category, String product) {
        Product item = null;
        for (Product i : products.get(category)) {
            if (i.getName().equals(product)) return i;
        }
        return item;
    }

}
