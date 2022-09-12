import clients.quotes.MashUpApiClient;
import clients.quotes.response.AnalystOpinionDetail;
import clients.quotes.response.MarketSentiment;
import clients.quotes.response.MashupResponse;
import clients.quotes.response.PriorScoreHistDetail;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MashUpClientTest {

    @Test
    public void ShouldBeAbleToValidateRequestedValueFromSecDetail() {

        MashUpApiClient mashUpApiClient = new MashUpApiClient();
        MashupResponse mashupResponse = mashUpApiClient.getMasUpApiClient();

        String actual = mashupResponse.getMashup().getFinancialMetric().getFinancialMetricDetails().getFinancialMetricDetail().get(0).getSecDetail().getRequested();
        String expected = "IBIO";

        System.out.println(actual + "  vs  " + expected); //IBIO  vs  IBIO
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldBeAbleToValidateScoreDateInPriorScoreHistDetails() {

        MashUpApiClient mashUpApiClient = new MashUpApiClient();
        MashupResponse mashupResponse = mashUpApiClient.getMasUpApiClient();

        List<AnalystOpinionDetail> analystOpinionDetailList = mashupResponse.getMashup().getAnalystOpinion().getAnalystOpinionDetails().getAnalystOpinionDetail();
        List<PriorScoreHistDetail> priorScoreHistDetail = analystOpinionDetailList.get(0).getEquitySummDetail().getPriorScoreHistDetails().getPriorScoreHistDetail();

        String year = "";
        for (int i = 0; i < priorScoreHistDetail.size(); i++) {
            if (priorScoreHistDetail.get(i).getTimePeriod().equals("3 Month")) {
                year = priorScoreHistDetail.get(i).getScoreDate();
            }
        }
        System.out.println("year = " + year); //year = 05/11/22

        //Get the year only from the String "year"
        String[] yearSplit = year.split("/");
        System.out.println("Year: " + yearSplit[2]); //Year: 22

        for (int i = 0; i < priorScoreHistDetail.size(); i++) {
            String scoreDate = priorScoreHistDetail.get(i).getScoreDate();
            if (scoreDate.split("/")[2].equals("22")) {
                System.out.print(priorScoreHistDetail.get(i).getTimePeriod() + " "); //1 Week 1 Month 3 Month
            }
        }

        System.out.println();
        System.out.println("====================================================");
        /*
        In marketSentiment Json search for the object if
        shortTermDriection is Bullish, and then get the
        addInfoLink.
         */

        // String = " ";
        String shortTermBull = mashupResponse.getMashup().getMarketSentiment().getSentimentDetails().get(0).getShortTermDirection();
        if (
            shortTermBull.equals("Bullish")) {
            String addInfoLink = mashupResponse.getMashup().getMarketSentiment().getSentimentDetails().get(0).getAddlInfoLink();
            System.out.println(addInfoLink);
        }

        System.out.println("====================================================");
        /*
        Fetch "timestamp" value from Json object and convert
        to human readible format using Java built in function.
        (explore in google)
    */

        long timeStamp = mashupResponse.getMashup().getMarketSentiment().getSentimentDetails().get(0).getTimestamp();
        System.out.println(timeStamp); //1660276800
        Date date = new Date(timeStamp*1000); //date = Fri Aug 12 00:00:00 EDT 2022

        String dateStr = date.toString();
        System.out.println("dateStr = " + dateStr); // Fri Aug 12 00:00:00 EDT 2022

        String[] dtArr = dateStr.split(" ");
        System.out.println("Year: "+ dtArr[dtArr.length-1]);

        System.out.println("====================================================");

       String disclosure = mashupResponse.getMashup().getAnalystOpinion().getDisclosure();
       String word = "ADRs";
       boolean present = false;
       if (disclosure.contains(word)){
           present = true;
       }
       Assert.assertTrue(present);
       System.out.println(word + " is present: " + present); //true

        System.out.println("====================================================");









    }
}