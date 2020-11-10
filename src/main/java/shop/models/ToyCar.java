package shop.models;

//L-принцип замены Барбары Лисков(Liskov Substitution Principle)Наследуй только тогда,
// когда можешь играть роль за предка.

public class ToyCar extends Product {
int forChildrenAge;
    public ToyCar(String name, int price, int rating, int forChildrenAge) {
        super(name, price, rating);
        this.forChildrenAge = forChildrenAge;

    }
}