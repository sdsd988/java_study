package Chapter15.coffee;

public class Mocha extends Decorator{

    public Mocha(Coffee coffee) {
        super(coffee);
    }


    public void brewing() {
        super.brewing();
        System.out.println("Adding Mocha");
    }
}
