import java.util.*;

public class Portfolio {

    private ArrayList<Stock> stocks;

    public Portfolio(){
        stocks = new ArrayList<>();
    }

    public int getSize(){
        return stocks.size();
    }

    public void addStock(Stock stock){
        stocks.add(stock);
    }

    public void removeStock(Stock stock){
        stocks.remove(stock);
    }

    public Stock findCheapestStock() {
        if (stocks == null || stocks.isEmpty()) {
            return null; // Handle empty list case
        }

        Stock cheapest = stocks.get(0);
        double cheapestPrice = StockUtility.getCurrentPriceOfStock(cheapest.getSymbol());

        for (int i = 1; i < stocks.size(); i++) {
            Stock currentStock = stocks.get(i);
            if (currentStock == null) continue; // Skip null stocks

            double currentPrice = StockUtility.getCurrentPriceOfStock(currentStock.getSymbol());
            if (currentPrice < cheapestPrice) {
                cheapest = currentStock;
                cheapestPrice = currentPrice;
            }
        }

        return cheapest;
    }


    public Stock findMostExpensiveStock() {
        if (stocks == null || stocks.isEmpty()) {
            return null; // Handle empty list case
        }

        Stock mostExpensive = stocks.get(0);
        double highestPrice = StockUtility.getCurrentPriceOfStock(mostExpensive.getSymbol());

        for (int i = 1; i < stocks.size(); i++) {
            Stock currentStock = stocks.get(i);
            if (currentStock == null) continue; // Skip null stocks

            double currentPrice = StockUtility.getCurrentPriceOfStock(currentStock.getSymbol());
            if (currentPrice > highestPrice) {
                mostExpensive = currentStock;
                highestPrice = currentPrice;
            }
        }

        return mostExpensive;
    }

    public double printAveragePriceOfAllStocks() {
        if (stocks == null || stocks.isEmpty()) {
            return 0.0; // Handle empty list case
        }

        double sum = 0;
        double averagePrice = 0.0;

        for (int i = 0; i < stocks.size(); i++) {
            Stock currentStock = stocks.get(i);
            if (currentStock == null) continue; // Skip null stocks

            sum += StockUtility.getCurrentPriceOfStock(currentStock.getSymbol());
        }

        averagePrice = sum / stocks.size();

        return averagePrice;
    }


}
