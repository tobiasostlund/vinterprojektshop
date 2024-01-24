import java.util.ArrayList;
import java.util.Scanner;

public class Shoppingcart {
    Scanner scan = new Scanner(System.in);

    //lista med alla produkter
    ArrayList<Products> allProd= new ArrayList<>();

    int money=200;

    public Shoppingcart(){
        start();
    }

    //startar programmet
    public void start(){
        System.out.println("Du har 200 kr att handla för.");
        //huvuddelen av programmet som körs på repeat
        while(true){
            System.out.println("Vad vill du göra?");
            System.out.println("1. Betala");
            System.out.println("2. Lägg till vara i varukorgen");
            System.out.println("3. Ta bort vara från varukorgen");
            System.out.println("4. Se varorna i varukorgen");
            int val=scan.nextInt();
            switch(val){
                case 1:
                    //price=0;

                case 2:
                    System.out.println("Vilken vara vill du lägga till?");
                    System.out.println("1. Juice " +
                            "2. Läsk " +
                            "3. Kaffe " +
                            "4. Köttbullar " +
                            "5. Glass " +
                            "6. Uran 234");
                    int bought_item=scan.nextInt();
                    switch(bought_item){
                        case 1:
                            allProd.add(new Juice());
                        case 2:
                            allProd.add(new Soda());
                        case 3:
                            allProd.add(new Coffee());
                        case 4:
                            allProd.add(new Meatballs());
                        case 5:
                            allProd.add(new Icecream());
                        case 6:
                            allProd.add(new Uran234());
                    }
                case 3:
                    for(int i=0; i<allProd.size(); i++){

                    }
                case 4:

            }
        }
    }
}
