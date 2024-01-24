import java.util.ArrayList;
import java.util.Scanner;

public class Products{
    Scanner scan = new Scanner(System.in);

    //attributes
    String stuff;
    int price;
    int weight;

    ArrayList<String> cart=new ArrayList<String>();
    ArrayList<Integer> cart_int=new ArrayList<Integer>();

    //constructor
    public Products(){}
    public Products(int price, int weight, String stuff){
        this.stuff=stuff;
        this.price=price;
        this.weight=weight;
    }

    //methods

    //lägger till produkt i varukorgen
    public void add_to_cart(String stuff, int price){
        cart.add(stuff);
        cart_int.add(price);
    }

    //tar bort vara från varukorgen
    public void remove_from_cart(){

    }

    public void hello(){}


}
