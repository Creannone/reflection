package test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    @Test
    public void test1(){
        Person person = new Person("Tom",12);
        person.show();
        person.age = 10;
        System.out.println(person);
    }

    @Test
    public void test2() throws Exception{
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor(String.class,int.class);

        Object obj = cons.newInstance("tom", 12);
        System.out.println(obj.toString());

        Field age = clazz.getDeclaredField("age");
        age.set(obj,10);
        System.out.println(obj.toString());

        Method show = clazz.getDeclaredMethod("show");
        show.invoke(obj);

        Constructor con1 = clazz.getDeclaredConstructor(String.class);
        con1.setAccessible(true);
        Person person = (Person) con1.newInstance("xiao");
        person.age = 10;
        System.out.println(person);

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"xiaoxiao");
        System.out.println(person);

        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String str = (String) showNation.invoke(person,"China");
        System.out.println(person);
        System.out.println(str);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        Person person1 = new Person();
        Class clazz2 = person1.getClass();
        System.out.println(clazz2);

        Class clazz3 = Class.forName("test.Person");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);

        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("test.Person");
        System.out.println(clazz4);
    }

    @Test
    public void test4(){

    }
}
