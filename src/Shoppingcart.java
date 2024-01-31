import java.util.ArrayList;
import java.util.Scanner;

public class Shoppingcart {
    Scanner scan = new Scanner(System.in);

    //lista med alla produkter
    ArrayList<Products> allProd= new ArrayList<>();

    int money=200;

    //constructor
    public Shoppingcart(){
        start();
    }

    //methods

    //tar bort vara från varukorgen,
    public void remove_from_cart(String x){
        for(int i=0; i<allProd.size(); i++){
            if(allProd.get(i).stuff.equals(x)){
                allProd.remove(i);
                break;
            }
        }
    }


    //startar programmet
    public void start(){
        System.out.println("Du har 200 kr att handla för.");
        //huvuddelen av programmet som körs på repeat
        while(true){
            System.out.println();
            System.out.println("Vad vill du göra?");
            System.out.println("1. Betala");
            System.out.println("2. Lägg till vara i varukorgen");
            System.out.println("3. Ta bort vara från varukorgen");
            System.out.println("4. Se varorna i varukorgen");
            int val=scan.nextInt();
            //kör det valet som man skriver in från menyn
            switch(val){
                case 1:

                    int price=0;
                    //hittar "price" värdet på alla varor i varukorgen och adderar dem för att få summan
                    for(int i=0; i<allProd.size(); i++){
                        price=price+(allProd.get(i).price);
                    }
                    System.out.println("Pris: "+price+" kr");
                    //minskar användarens pengar och tömmer varukorgen om användaren har råd att att betala
                    if(price<=money){
                        money=money-price;
                        allProd.clear();
                        System.out.println("Köp lyckat, du har "+money+" kr kvar.");
                    }else{
                        System.out.println("Du har inte råd...");
                    }
                    break;

                case 2:
                    System.out.println("Vilken vara vill du lägga till?");
                    System.out.println("1. Juice " +
                            "2. Läsk " +
                            "3. Kaffe " +
                            "4. Köttbullar " +
                            "5. Glass " +
                            "6. Uran 234");
                    int bought_item=scan.nextInt();
                    //lägger till varor i varukorgen
                    switch(bought_item){
                        case 1:
                            allProd.add(new Juice());
                            break;
                        case 2:
                            allProd.add(new Soda());
                            break;
                        case 3:
                            allProd.add(new Coffee());
                            break;
                        case 4:
                            allProd.add(new Meatballs());
                            break;
                        case 5:
                            allProd.add(new Icecream());
                            break;
                        case 6:
                            allProd.add(new Uran234());
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Vilken vara vill du ta bort?");
                    System.out.println("1. Juice " +
                            "2. Läsk " +
                            "3. Kaffe " +
                            "4. Köttbullar " +
                            "5. Glass " +
                            "6. Uran 234");
                    int removed_item=scan.nextInt();
                    switch(removed_item){
                        case 1:
                            remove_from_cart("Juice");
                            break;
                        case 2:
                            remove_from_cart("Soda");
                            break;
                        case 3:
                            remove_from_cart("Coffee");
                            break;
                        case 4:
                            remove_from_cart("Meatballs");
                            break;
                        case 5:
                            remove_from_cart("Icecream");
                            break;
                        case 6:
                            remove_from_cart("Uran 234");
                            break;
                    }
                    break;
                case 4:
                    //räknar ut priset
                    price=0;
                    for(int i=0; i<allProd.size(); i++){
                        price=price+(allProd.get(i).price);
                    }
                    //skriver ut alla produkter i varukorgen
                    System.out.println("Din varukorg:");
                    for(int i=0; i<allProd.size(); i++){
                        System.out.println(allProd.get(i).stuff);
                    }
                    System.out.println("Pris: "+price+" kr");

                    break;
            }
        }
    }
}
