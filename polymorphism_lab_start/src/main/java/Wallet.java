import java.util.ArrayList;

public class Wallet  {
    private String name;
    private ArrayList<Iscan> cards;


    public Wallet(String name) {
        this.name = name;
        this.cards = new ArrayList<Iscan>();

    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.cards.size() ;
    }

    public void addItem(Iscan card) {
        this.cards.add(card);
    }


}
