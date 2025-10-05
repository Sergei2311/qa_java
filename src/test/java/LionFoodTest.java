import com.example.FelineClass;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFoodTest {

    @Mock
    FelineClass felineClass;

    @Test
    public void lionFelineTest() throws Exception {
        Lion lion = new Lion("Самец", felineClass);
        Mockito.when(felineClass.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals("Еда хищника", expectedFood, actualFood);
    }
}