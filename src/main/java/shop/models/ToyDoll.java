package shop.models;


//L -принцип замены Барбары Лисков(Liskov Substitution Principle)Наследуй только тогда,
// когда можешь играть роль за предка.
public class ToyDoll extends Product {
    private boolean forBoyOrGirl;

    public ToyDoll(String name, int price, int rating, boolean forBoyOrGirl) {
        super(name, price, rating);
        this.forBoyOrGirl = forBoyOrGirl;
    }
}