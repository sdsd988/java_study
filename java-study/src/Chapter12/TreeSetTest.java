package Chapter12;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }
}

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
