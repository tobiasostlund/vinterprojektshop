import java.util.ArrayList;
import java.util.Scanner;

public class Products {
    Scanner scan = new Scanner(System.in);

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

    //lägger till produkt i varukorgen
    public void add_to_cart(String stuff, int price){
        cart.add(stuff);
        cart_int.add(price);
    }

    //startar programmet
    public void start(){
        System.out.println("Du har 200 kr att handla för.");
        while(true){
            System.out.println("Vad vill du göra?");
            System.out.println("1. Betala");
            System.out.println("2. Lägg till vara i varukorgen");
            System.out.println("3. Ta bort vara från varukorgen");
            int val=scan.nextInt();
            switch(val){
                case 1:
                    price=0;

                case 2:
                    System.out.println("Vilken vara vill du lägga till?");
                    System.out.println("1. Juice " +
                            "2. Läsk " +
                            "3. Kaffe " +
                            "4. Köttbullar " +
                            "5. Glass " +
                            "6. Uran 234");
                case 3:
            }
        }
    }
}
