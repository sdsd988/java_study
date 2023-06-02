package chapter16;

class Bank{
    private int money =10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public synchronized void saveMoney(int save){
        int m = this.getMoney();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        setMoney(m+save);
    }


    public synchronized void minusMoney(int save){
        int m = this.getMoney();

        try{
            Thread.sleep(200);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        setMoney(m-save);
    }
}

public class SyncTest {
}
