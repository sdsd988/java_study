package chapter16;


class MyThread extends Thread{
    int i;

    public void run(){
        for(i=0;i<200;i++){
            System.out.println(i+"\t");
        try {
            sleep(100);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }


}



public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("start");
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println("end");
        Thread t = Thread.currentThread();
        System.out.println(t);

    }
}
