import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineOneKittensTest {
    @Test
    public void felineOneKittensTest() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        assertEquals("Количество котят = 1 -", expectedKittens, actualKittens);
    }
}
