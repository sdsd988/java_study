package chapter11;

public class Powder extends Material{

    public String toString(){
        return "재료는 파우더입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("파우더로 프린팅 합니다.");
    }
}
