import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import data.CurrencyRate;
import data.Envelope;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ParserXml {

    private final String path;
    private Envelope data;
    private Map<String, Double> rates;

    public ParserXml() {
        this("referencesRate.xml");
    }

    public ParserXml(String path) {
        this.path = path;
        this.parse();
    }

    private void parse() {
        ObjectMapper mapper = new XmlMapper();
        try {
            this.data = mapper.readValue(new FileReader(path), Envelope.class);
            TreeMap<String, Double> map = new TreeMap<>();
            for (CurrencyRate currencyRate : data.getCurrenciesRatesList().getCurrencyRateList()) {
                map.put(currencyRate.getCurrencyCode(), currencyRate.getRate());
            }
            this.rates = map;
        } catch (IOException e) {
            throw new RuntimeException("file not found");
        } catch (Exception e){
            throw new RuntimeException("something went wrong");
        }
    }

    public Map<String, Double> getRates(){
        return rates;
    }
}
