package shop;

import shop.ui.StartApp;

public class Main {
    public static void main(String[] args) {
        StartApp.startApp();
    }
}



/*
S - Разделение на классы (код разделен на классы, у каждого своя функция)
O - ToyCar и ToyDoll наследуются от Product(класс не меняется а в дочерние классы добавляем необходимые поля)
L - классы ToyCar и ToyDoll являются наследниками Product и расширяют его(могут заменить собой родителя)
I - интерфейс Sort имеет  один метод для конкретного назначения
D - при фильтрации зависим не от конкретных реализаций а от интерфейса

ПО мимо этого в коде избегаем "магических чисел" а так же используем правило "DRY",
дублирующийся код вынесен в отдельные методы
*/

