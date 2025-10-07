import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineKittensTest {
    @Test
    public void felineKittensTest() {
        Feline feline = new Feline();
        int expectedKittens = 10;
        int actualKittens = feline.getKittens(expectedKittens);
        assertEquals("Количество совпадает -", expectedKittens, actualKittens);
    }
}
