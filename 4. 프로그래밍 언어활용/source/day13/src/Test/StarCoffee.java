package Test;

public class StarCoffee {

    int money;

    public String brewing(int money) {

        this.money += money;
        if(money == Menu.STARAMERICANO) {
            return ("");
        }
        else if(money == Menu.STARLATTE) {
            return ("");
        }
        else {
            return null;
        }
    }
}

