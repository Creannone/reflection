import org.junit.Test;

public class NewReflectionTest {
    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
        Person p1 = clazz.newInstance();

    }
}
