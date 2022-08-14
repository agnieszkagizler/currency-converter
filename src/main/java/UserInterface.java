import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private final Map<String, Double> rates;

    public UserInterface(Map<String, Double> rates) {
        this.rates = rates;
    }

    public void showAllCurrencies() {
        System.out.println("List of available currencies");
        int i = 0;
        for (Map.Entry<String, Double> entry : rates.entrySet()) {
            System.out.println(++i + ". " + entry.getKey() + " " + entry.getValue());
        }
    }

    public String chooseCurrency(Scanner scanner) {
        String currencyCode = "";
        System.out.println("Type chosen currency code from the list: ");
        return currencyCode = String.valueOf(scanner.nextLine());
    }

    public double inputAmount(Scanner scanner) {
        double amount = 0.0;
        System.out.println("Type amount in EUR to convert");
        return amount = Double.valueOf(scanner.nextLine());
    }

    public double findRate(String currencyCode) {
        double rate = 0.0;
        for (Map.Entry<String, Double> entry : rates.entrySet()) {
            if (entry.getKey().equals(currencyCode)) {
                rate = entry.getValue();
            }
        }
        return rate;
    }

    public double convert(double amount, double rate) {
        double convertedAmount = 0;
        convertedAmount = amount * rate;
        System.out.printf("Your converted amount is: %.2f", convertedAmount);
        return convertedAmount;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in currency converter!\nThis converter will allow you to convert amount provided in euro to chosen currency");
        showAllCurrencies();
        Double amount = inputAmount(scanner);
        String currency = chooseCurrency(scanner);
        double rate = findRate(currency);
        convert(amount,rate);
    }
}
