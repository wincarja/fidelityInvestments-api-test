import clients.autocomplete.AutoCompleteApiClient;
import clients.autocomplete.response.AutoCompleteResponse;
import org.testng.annotations.Test;

public class AutoCompleteApiClientTest{

@Test
    public void ShouldBeAbleToGetAutoComplete(){

        AutoCompleteApiClient autoCompleteApiClient = new AutoCompleteApiClient();
        AutoCompleteResponse autoCompleteResponse= autoCompleteApiClient.getAutoCompleteClientApi();

       int si = autoCompleteResponse.getQuotes().getSuggestions().size();
        System.out.println("si = " + si);

    }




}
