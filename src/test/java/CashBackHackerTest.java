import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashbackHackService;

public class CashBackHackerTest {
    @Test
    public void shouldBuyHowMuchMoreTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyHowMuchMoreTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldBuyHowMuchMoreTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
}
