package data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CurrencyRate {

    @JacksonXmlProperty(isAttribute = true, localName = "currency")
    private String currencyCode;
    @JacksonXmlProperty(isAttribute = true, localName = "rate")
    private double rate;
}
