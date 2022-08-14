package data;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Envelope")
public class Envelope {

    @JacksonXmlProperty(localName = "subject")
    private String subject;
    @JacksonXmlProperty(localName = "Sender")
    private Sender sender;
    @JacksonXmlProperty(localName = "Cube")
    private CurrenciesRatesList currenciesRatesList;
}
