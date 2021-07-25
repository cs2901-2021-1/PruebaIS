import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PruebaTest {

    @Test
    public static void test1() {
        var p1 = new Prueba();
        Assert.assertEquals(p1.getEdad(), 19);
    }
}