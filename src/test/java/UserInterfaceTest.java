import data.CurrencyRate;
import org.junit.jupiter.api.Test;

import javax.naming.spi.DirObjectFactory;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInterfaceTest {

    Map<String, Double> currencyRates = new HashMap<>();
    UserInterface userInterface = new UserInterface(currencyRates);

    @Test
    public void shouldMultipleTwoNumbers() {

        currencyRates.put("USD", 1.0338);
        double valueA = 1.01;
        double valueB = 1.21;
        double actualResult = userInterface.convert(valueA, valueB);
        assertEquals(1.2221, actualResult);
    }

    @Test
    public void shouldFindProperValue() {
        currencyRates.put("USD", 1.0338);
        String currencyCode = "USD";
        double actualResult = userInterface.findRate(currencyCode);
        assertEquals(1.0338, actualResult);
    }
}

