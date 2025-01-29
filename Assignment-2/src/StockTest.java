public class StockTest {

    public static void main(String[] args) {
        Stock delta = new Stock("Delta Airlines Inc", "DAL",
                65.10, 0.92, 42.01, 7690000);
        Stock coke = new Stock("Coca-cola Co", "KO",
                61.65, 3.15, 265.6, 17520000);
        Stock homeDepot = new Stock("Home Depot Inc", "HD",
                389.2, 2.31, 390, 3000000);
        Stock ups = new Stock("United Parcel Service Inc", "UPS",
                125, 5.22, 107, 4500000);
        delta.printStock(); System.out.println();
        coke.printStock(); System.out.println();
        homeDepot.printStock(); System.out.println();
        ups.printStock(); System.out.println();

        Stock gamestop = new Stock("GME");
        Stock roblox = new Stock("RBLX");
        Stock digitalOcean = new Stock("DOCN");

        double priceGME = StockUtility.getCurrentPriceOfStock("GME");
        System.out.println("The current price of GameStop is: " + priceGME);
        double priceROBLOX = StockUtility.getCurrentPriceOfStock("RBLX");
        System.out.println("The current price of Roblox is: " + priceROBLOX);
        double priceDOCN = StockUtility.getCurrentPriceOfStock("DOCN");
        System.out.println("The current price of DigitalOceanHoldings Inc. is: " + priceDOCN);

        double sharesGME = 400000/32.94;
        double sharesROBLOX = 300000/62.05;
        double sharesDOCN = 300000/34.48;
        System.out.println();

        System.out.println("The number of shares of GameStop: " + sharesGME);
        System.out.println("The number of shares of Roblox: " + sharesROBLOX);
        System.out.println("The number of shares of DigitalOceans Inc. : " + sharesDOCN);
        /*
        January 8th
        Shares GME 12143.290831815422
        Shares RBLX 4834.810636583401
        Shares DOCN 8700.696055684455
        */
        System.out.println();
        System.out.println("The market cap of DigitalOcean Inc. is: " +
                StockUtility.getMarketCapOfStock("DOCN"));
    }
}
