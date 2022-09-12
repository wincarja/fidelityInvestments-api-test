package clients.quotes;

import clients.Constants;
import clients.quotes.response.MashupResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class MashUpApiClient {

    public MashupResponse getMasUpApiClient(){

   Response response= given()
                .contentType(ContentType.JSON)
                .queryParam("symbol","IBIO")
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .get(Constants.BASEURI+Constants.MASHUPENDPOINT);

   response.prettyPrint();
   Gson gson = new Gson();

   MashupResponse mashupResponse = gson.fromJson(response.asString(), MashupResponse.class);

   return mashupResponse;

    }
}
