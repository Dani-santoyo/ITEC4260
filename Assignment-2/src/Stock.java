public class Stock {

    private String name;
    private String symbol;
    private double price;
    private double yield;
    private double marketCap;
    private int volume;

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    public Stock(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public Stock(String name, String symbol, double price, double yield, double marketCap, int volume) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.yield = yield;
        this.marketCap = marketCap;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printStock() {
        /*
        AAPL
		Apple Inc.
		175.00
		80000000
		2800000000000
		0.005
         */
        System.out.println(symbol);
        System.out.println(name);
        System.out.println(price);
        System.out.println(volume);
        System.out.println(marketCap);
        System.out.println(yield);
    }

    @Override
    public String toString() {
        return getSymbol();
    }
}
