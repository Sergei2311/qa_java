import com.example.FelineClass;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionHasManeTest {

    @Mock
    FelineClass felineClass;

    @Test
    public void lionHasManeTest() throws Exception {
        Lion lion = new Lion("Самец", felineClass);
        boolean expected = true;
        boolean actual = lion.doesHaveMane();

        assertEquals("Пол льва", expected, actual);
    }
}
