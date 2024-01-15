import java.util.ArrayList;

public class Products {
    //attributes
    String stuff;
    int price;
    int weight;
    ArrayList<String> cart=new ArrayList<String>();
    ArrayList<Integer> cart_int=new ArrayList<Integer>();

    //constructor
    public Products(int price, int weight, String stuff){
        this.stuff=stuff;
        this.price=price;
        this.weight=weight;
    }

    //methods
    public void add_to_cart(String stuff, int price){
        cart.add(stuff);
        cart_int.add(price);
    }
}
