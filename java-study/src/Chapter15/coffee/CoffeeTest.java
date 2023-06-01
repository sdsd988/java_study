package Chapter15.coffee;

public class CoffeeTest {

    public static void main(String[] args) {
        KentaAmericano americano = new KentaAmericano();
        americano.brewing();

        System.out.println();

        Coffee kenyaLatte = new Latte(new KentaAmericano());
        kenyaLatte.brewing();

        Coffee kenyaMocha = new Mocha(new KentaAmericano());
        kenyaMocha.brewing();

    }
}
