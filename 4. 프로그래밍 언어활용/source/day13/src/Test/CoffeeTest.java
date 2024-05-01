package Test;

public class CoffeeTest {

    public static void main(String[] args) {

        Person kim = new Person("Kim", 10000);
        StarCoffee starCoffee = new StarCoffee();

        Person Lee = new Person("Lee", 10000);
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.buyStarCoffee(starCoffee, 6000);
        Lee.buyBeanCoffee(beanCoffee, 5500);

    }
}

