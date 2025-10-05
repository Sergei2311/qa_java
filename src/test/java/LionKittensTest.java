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
public class LionFelineTest {

    @Mock
    FelineClass felineClass;

    @Test
    public void lionFelineTest() throws Exception {
        Lion lion = new Lion("Самец",felineClass);
        Mockito.when(felineClass.getKittens()).thenReturn(1);
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        assertEquals("Количество львят = 1",expectedKittens,actualKittens);
    }
}

/*
        List<String> expectedKittens = List.of("Животные", "Птицы", "Рыба");
        List<String> actualKittens = lion.getFood();
        assertEquals("Количество львят = 1",expectedKittens,actualKittens);
 */