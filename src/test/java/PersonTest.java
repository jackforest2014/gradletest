import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    Person person = new Person();

    @Test
    public void SampleTest(){
        Assert.assertTrue(person != null);
    }
}
