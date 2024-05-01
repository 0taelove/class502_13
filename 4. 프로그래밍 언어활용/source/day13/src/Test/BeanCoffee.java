package Test;

public class BeanCoffee {

    int money;

    public String brewing(int money) {

        this.money += money;
        if(money == Menu.BEANAMERICANO) {
            return ("");
        }
        else if(money == Menu.BEANLATTE) {
            return ("");
        }
        else {
            return null;
        }
    }
}