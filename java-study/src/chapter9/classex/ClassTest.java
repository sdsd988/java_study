package chapter9.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("chapter9.classex.Person");
        Person person1 = (Person) c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};

        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person person2 = (Person) cons.newInstance(initargs);
        System.out.println(person2);
    }
}
