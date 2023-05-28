package chapter11;

public class Plastic extends Material {

    public String toString(){
        return "재료는 플라스틱입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic 프린팅 합니다.");
    }
}
