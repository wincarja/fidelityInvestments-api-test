import clients.market.international.InternationalApiClient;
import org.testng.annotations.Test;

public class InternationalApiClientTest {


    @Test
    public void ShouldBeAbleToGetInternatinalMarketInfo(){

        InternationalApiClient internationalApiClient = new InternationalApiClient();
        internationalApiClient.getInternationalMarketInfo();




    }
}
