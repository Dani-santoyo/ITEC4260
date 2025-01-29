import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class StockUtility {

    public static final String API_KEY = "csqnulpr01qv7qe2g130csqnulpr01qv7qe2g13g";
    public static final String API_ADDRESS = "https://finnhub.io/api/v1/quote?";
    public static final String API_ADDRESS_COMPANY_PROFILE = "https://finnhub.io/api/v1/stock/profile2?";

    public static double getCurrentPriceOfStock(String symbol) {
        ObjectMapper mapper = new ObjectMapper();
        String url = API_ADDRESS + "symbol=" + symbol + "&token=" + API_KEY;
        double price = 0;
        try {
            JsonNode root = mapper.readTree(new URL(url));
            price = root.get("c").asDouble();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return price;
    }

    public static double getMarketCapOfStock(String symbol) {
        ObjectMapper mapper = new ObjectMapper();
        String url = API_ADDRESS_COMPANY_PROFILE + "symbol=" + symbol + "&token=" + API_KEY;
        double marketCap = 0;
        try {
            JsonNode root = mapper.readTree(new URL(url));
            marketCap = root.get("marketCapitalization").asDouble();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return marketCap;
    }
}
