package clients.market.orders;

import clients.Constants;
import clients.market.orders.response.OrdersResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class OrdersApiClient {

    public OrdersResponse getOrders(){

    Response response= given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .get(Constants.BASEURI+Constants.ORDERSENDPOINT);

//    response.prettyPrint();


    Gson gson = new Gson();
    OrdersResponse ordersResponse = gson.fromJson(response.asString(), OrdersResponse.class);

    return ordersResponse;
    }
}
