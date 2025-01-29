import org.junit.Assert;
import org.junit.Test;

public class PortfolioTest {

    Portfolio ira = new Portfolio();
    Stock iono = new Stock("IONO Inc", "IONO");
    Stock gme = new Stock("GameStop", "GME");
    Stock rblx = new Stock("Roblox", "RBLX");

    @Test
    public void testAddStock() {

        ira.addStock(iono);
        Assert.assertEquals(1, ira.getSize());

    }

    @Test
    public void testRemoveStock() {

        ira.addStock(iono);
        ira.removeStock(iono);
        Assert.assertEquals(0, ira.getSize());

    }

    @Test
    public void testFindCheapestStock() {

        ira.addStock(iono);
        ira.addStock(gme);
        ira.addStock(rblx);

        Assert.assertEquals(iono, ira.findCheapestStock());

    }

    @Test
    public void testFindMostExpensiveStock() {

        ira.addStock(iono);
        ira.addStock(gme);
        ira.addStock(rblx);

        Assert.assertEquals(rblx, ira.findMostExpensiveStock());

    }

    @Test
    public void testPrintAveragePriceOfAllStocks() {

        ira.addStock(iono);
        ira.addStock(gme);
        ira.addStock(rblx);

        Assert.assertNotEquals(0, ira.printAveragePriceOfAllStocks());

    }
}
