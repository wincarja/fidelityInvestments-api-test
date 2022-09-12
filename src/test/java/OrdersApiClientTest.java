import clients.market.orders.OrdersApiClient;
import clients.market.orders.response.OrdersResponse;
import clients.market.orders.response.TradeDetail;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class OrdersApiClientTest {

    @Test
    public void ShouldBeAbleToGetOrders() {

        OrdersApiClient ordersApiClient = new OrdersApiClient();
        OrdersResponse ordersResponse = ordersApiClient.getOrders();

        int size = ordersResponse.getTopTrade().getTradeDetails().size();
        System.out.println(size);//30


        for (int i = 0; i < size; i++) {
            if (ordersResponse.getTopTrade().getTradeDetails().get(i).getSymbol().equals("TSLA")) {
                Assert.assertTrue(ordersResponse.getTopTrade().getTradeDetails().get(i).getSector().equals("Consumer Discretionary"));
                System.out.println(ordersResponse.getTopTrade().getTradeDetails().get(i).getSector()); //Consumer Discretionary
            }
        }


        List<TradeDetail> listOfTradeDetail = ordersResponse.getTopTrade().getTradeDetails();

        for (int i = 0; i < listOfTradeDetail.size(); i++) {
            System.out.println(listOfTradeDetail.get(i).getSymbol());
        }


    }


}

