import java.util.ArrayList;

public class Main {
    public static ArrayList<Goods> goods = new ArrayList<Goods>();

    public static void main(String[] args) {
        populateListOfGoods();
    }

    private static void populateListOfGoods() {
        goods.add(new Goods());
    }
}
