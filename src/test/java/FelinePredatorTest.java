import com.example.Feline;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelinePredatorTest {
    @Test
    public void felinePredator() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualPredatorList = feline.eatMeat();
        assertEquals("Пища хищника - ", expectedList, actualPredatorList);
    }
}
