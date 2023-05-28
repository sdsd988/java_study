package chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {

        StringConImpl impl = new StringConImpl();
        impl.makeString("hello","world");

        StringConcat concat = (s,v) -> System.out.println(s+","+v);
        concat.makeString("hello", "world");


        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                StringConcat concat = (s,v) -> System.out.println(s+","+v);
            }
        };
        concat2.makeString("hello","world");
    }

}
