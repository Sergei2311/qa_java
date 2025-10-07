import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineFamilyTest {

    @Test
    public void felineFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        assertEquals("Кошачьи - ", expectedFamily, actualFamily);
    }

}
