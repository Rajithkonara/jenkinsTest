import org.junit.Assert;
import org.junit.Test;

public class CaseOne {

    @Test
    public void testPrintHelloWorld() {
        Assert.assertEquals(TestCase.getHelloWorld(), "Hello World-+");
    }
}
