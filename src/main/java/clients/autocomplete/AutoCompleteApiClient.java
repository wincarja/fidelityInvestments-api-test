package clients.autocomplete;

import clients.Constants;
import clients.autocomplete.response.AutoCompleteResponse;
import com.google.gson.Gson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class AutoCompleteApiClient {

    public AutoCompleteResponse getAutoCompleteClientApi() {

        Response response = given()
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Host", Constants.HEADERHOSTVALUE)
                .header("X-RapidAPI-Key", Constants.HEADERKEYVALUE)
                .queryParam("q", "microsoft")
                .get(Constants.BASEURI + Constants.AUTOCOMPLETEENDPOINT);

        response.prettyPrint();

        Gson gson = new Gson();
        AutoCompleteResponse autoCompleteResponse = gson.fromJson(response.asString(), AutoCompleteResponse.class);

        return autoCompleteResponse;

    }

}
