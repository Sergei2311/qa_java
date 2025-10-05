import com.example.FelineClass;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionKittensTest {

    @Mock
    FelineClass felineClass;

    @Test
    public void lionFelineTest() throws Exception {
        Lion lion = new Lion("Самец", felineClass);
        Mockito.when(felineClass.getKittens()).thenReturn(1);
        int expectedKittens = 1;
        int actualKittens = lion.getKittens();
        assertEquals("Количество львят = 1", expectedKittens, actualKittens);
    }
}