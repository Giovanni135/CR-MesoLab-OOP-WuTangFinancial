import java.util.TreeMap;
import java.util.Map;



public class CurrencyConverter {

    // necessary conversions
    private double convertToInternational;
    private double convertToUsd;
    private double convertedAmount;

    private TreeMap<String, Double> currencyMap = new TreeMap<String, Double>() {

        {
            put("USD", 1.00);
            put("EUR", 0.94);
            put("GBP", 0.82);
            put("INR", 68.32);
            put("AUD", 1.35);
            put("CAD", 1.32);
            put("SGD", 1.43);
            put("CHF", 1.01);
            put("MYR", 4.47);
            put("JPY", 115.84);
            put("CNY", 6.92);
        }
    };

    public double internationalToUSD(String nation, double amount) {
        convertToUsd = amount / currencyMap.get(nation);
        return convertToUsd;
    }
    public double usdToInternational(String nation, double amount) {
        convertToInternational = amount * currencyMap.get(nation);
        return convertToInternational;
    }
    public double convertCurrency(String fromNation, String toNation, double amount){
        convertedAmount = usdToInternational(toNation, internationalToUSD(fromNation, amount));
        return convertedAmount;
    }

}