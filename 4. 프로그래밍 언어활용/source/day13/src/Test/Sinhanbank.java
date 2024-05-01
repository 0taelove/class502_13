package Test;

public class Sinhanbank {
    private static Sinhanbank instance = new Sinhanbank();

    private Sinhanbank() {}
    public static Sinhanbank getInstance() {
        if(instance == null )
            instance = new Sinhanbank();
        return instance;
    }
    public Card createCard() {

        Card card = new Card();
        return card;
    }
}
