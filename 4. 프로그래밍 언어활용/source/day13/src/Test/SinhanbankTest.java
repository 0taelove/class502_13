package Test;

public class SinhanbankTest {
    public static void main(String[] args) {

        Sinhanbank company = Sinhanbank.getInstance();

        Card myCard = company.createCard();
        Card yourCard = company.createCard();
        Card himCard = company.createCard();

        System.out.println(myCard.getCardNumber() + "--1명째 발급");
        System.out.println(yourCard.getCardNumber() + "--2명째 발급");
        System.out.println(himCard.getCardNumber() + "....--n명째 발급");

    }
}
