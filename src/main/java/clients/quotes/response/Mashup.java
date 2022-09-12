
package clients.quotes.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mashup {

    @SerializedName("financialMetric")
    @Expose
    private FinancialMetric financialMetric;
    @SerializedName("marketSentiment")
    @Expose
    private MarketSentiment marketSentiment;
    @SerializedName("valuation")
    @Expose
    private Valuation valuation;
    @SerializedName("analystOpinion")
    @Expose
    private AnalystOpinion analystOpinion;
    @SerializedName("ownership")
    @Expose
    private Ownership ownership;
    @SerializedName("returnsPerformance")
    @Expose
    private ReturnsPerformance returnsPerformance;
    @SerializedName("basicFact")
    @Expose
    private BasicFact basicFact;
    @SerializedName("dividend")
    @Expose
    private Dividend dividend;
    @SerializedName("distributions")
    @Expose
    private Distributions distributions;
    @SerializedName("portfolioComposition")
    @Expose
    private PortfolioComposition portfolioComposition;
    @SerializedName("earning")
    @Expose
    private Earning earning;

    public FinancialMetric getFinancialMetric() {
        return financialMetric;
    }

    public void setFinancialMetric(FinancialMetric financialMetric) {
        this.financialMetric = financialMetric;
    }

    public MarketSentiment getMarketSentiment() {
        return marketSentiment;
    }

    public void setMarketSentiment(MarketSentiment marketSentiment) {
        this.marketSentiment = marketSentiment;
    }

    public Valuation getValuation() {
        return valuation;
    }

    public void setValuation(Valuation valuation) {
        this.valuation = valuation;
    }

    public AnalystOpinion getAnalystOpinion() {
        return analystOpinion;
    }

    public void setAnalystOpinion(AnalystOpinion analystOpinion) {
        this.analystOpinion = analystOpinion;
    }

    public Ownership getOwnership() {
        return ownership;
    }

    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    public ReturnsPerformance getReturnsPerformance() {
        return returnsPerformance;
    }

    public void setReturnsPerformance(ReturnsPerformance returnsPerformance) {
        this.returnsPerformance = returnsPerformance;
    }

    public BasicFact getBasicFact() {
        return basicFact;
    }

    public void setBasicFact(BasicFact basicFact) {
        this.basicFact = basicFact;
    }

    public Dividend getDividend() {
        return dividend;
    }

    public void setDividend(Dividend dividend) {
        this.dividend = dividend;
    }

    public Distributions getDistributions() {
        return distributions;
    }

    public void setDistributions(Distributions distributions) {
        this.distributions = distributions;
    }

    public PortfolioComposition getPortfolioComposition() {
        return portfolioComposition;
    }

    public void setPortfolioComposition(PortfolioComposition portfolioComposition) {
        this.portfolioComposition = portfolioComposition;
    }

    public Earning getEarning() {
        return earning;
    }

    public void setEarning(Earning earning) {
        this.earning = earning;
    }

}
