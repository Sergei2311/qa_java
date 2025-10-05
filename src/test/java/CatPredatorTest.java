import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatPredatorTest {
    @Test
    public void catPredator() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedList = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualPredatorList = cat.getFood();
        assertEquals("Пища хищника - ", expectedList, actualPredatorList);
    }
}
