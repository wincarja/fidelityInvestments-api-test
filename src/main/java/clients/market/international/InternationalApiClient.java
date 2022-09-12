package clients.market.international;

import clients.Constants;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class InternationalApiClient {

    public void getInternationalMarketInfo(){

    Response response= given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .get(Constants.BASEURI+Constants.INTERNATIONALENDPOINT);

    response.prettyPrint();

    }
}
