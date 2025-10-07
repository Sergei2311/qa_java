import com.example.FelineClass;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionMaleFemaleMainTest {

    private final String sex;
    private final boolean hasMane;
    FelineClass felineClass;

    public LionMaleFemaleMainTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getHasMen() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void LionTest() throws Exception {
        Lion lion = new Lion(sex, felineClass);
        assertEquals("Пол льва", hasMane, lion.hasMane);
    }
}
