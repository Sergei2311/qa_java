import com.example.FelineClass;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionMaleFemaleExceptionTest {

    FelineClass felineClass;

    @Test
    public void LionTestException() throws Exception {

        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Оно", felineClass);
        });
        String expectedMessageException = "Используйте допустимые значения пола животного - самей или самка";
        String actualMessageException = exception.getMessage();
        assertEquals("Проверка исключения", expectedMessageException, actualMessageException);
    }
}
