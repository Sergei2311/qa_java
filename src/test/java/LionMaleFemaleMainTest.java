import com.example.FelineClass;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionHasMenTest {

    private final String sex;
    private final boolean hasMane;
    FelineClass felineClass;

public LionHasMenTest(String sex, boolean hasMane){
    this.sex = sex;
    this.hasMane = hasMane;
}

@Parameterized.Parameters
    public static Object[] getHasMen(){
        return new Object[][]{
                {"Самец",true},
                {"Самка",false}
        };
    }
@Test
public void LionTest() throws Exception {
        Lion lion = new Lion(sex, felineClass);
        assertEquals("Пол льва",hasMane, lion.hasMane);
    }
@Test
public void LionTestException() throws Exception {

    Exception exception = assertThrows(Exception.class,() -> {
        new Lion("Оно", felineClass);
    });
    String expectedMessageException = "Используйте допустимые значения пола животного - самей или самка";
    String actualMessageException = exception.getMessage();
    assertEquals("Проверка исключения",expectedMessageException,actualMessageException);
}
}
