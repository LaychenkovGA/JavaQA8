import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.StatsService.StatisticsService;

public class StatisticsServiceTest {

    @Test
    public void findTheSumOfAllSales() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.allSum(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findTheAverageSalesAmount() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageAmount(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findPeakSalesMonth() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findPeakSalesMonth1() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        int expected = 6;
        int actual = service.maxSales1(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthMinimumSales() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findSalesBelowAverage() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowTheAverage(sale);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAboveAverageSales() {
        StatisticsService service = new StatisticsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverage(sale);

        Assertions.assertEquals(expected, actual);
    }
}
