package data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;
@Data
public class CurrenciesRatesList {

    @JacksonXmlProperty(localName = "Cube")
    @JacksonXmlElementWrapper(localName = "Cube")
    private List<CurrencyRate> currencyRateList;

}
