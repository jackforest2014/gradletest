import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    Person person = new Person(10);

    @Test
    public void SampleTest(){
        Assert.assertTrue(person.getAge() == 10);
    }
}
