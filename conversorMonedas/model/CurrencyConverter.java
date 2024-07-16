public class CurrencyConverter {
    private double rateUSDToEUR = 0.85;
    private double rateUSDToGBP = 0.75;
    private double rateUSDToCOP = 4100.00;
    private double rateUSDToJPY = 110.00;
    private double rateEURToUSD = 1.18;
    private double rateEURToGBP = 0.88;
    private double rateEURToCOP = 4800.00;
    private double rateEURToJPY = 130.00;
    private double rateGBPToUSD = 1.33;
    private double rateGBPToEUR = 1.14;
    private double rateGBPToCOP = 5500.00;
    private double rateGBPToJPY = 150.00;
    private double rateCOPToUSD = 0.00024;
    private double rateCOPToEUR = 0.00021;
    private double rateCOPToGBP = 0.00018;
    private double rateCOPToJPY = 0.027;
    private double rateJPYToUSD = 0.0091;
    private double rateJPYToEUR = 0.0077;
    private double rateJPYToGBP = 0.0067;
    private double rateJPYToCOP = 37.00;

    public double convert(String from, String to, double amount) {
        double rate = getRate(from, to);
        return amount * rate;
    }

    private double getRate(String from, String to) {
        switch (from + "To" + to) {
            case "USDToEUR":
                return rateUSDToEUR;
            case "USDToGBP":
                return rateUSDToGBP;
            case "USDToCOP":
                return rateUSDToCOP;
            case "USDToJPY":
                return rateUSDToJPY;
            case "EURToUSD":
                return rateEURToUSD;
            case "EURToGBP":
                return rateEURToGBP;
            case "EURToCOP":
                return rateEURToCOP;
            case "EURToJPY":
                return rateEURToJPY;
            case "GBPToUSD":
                return rateGBPToUSD;
            case "GBPToEUR":
                return rateGBPToEUR;
            case "GBPToCOP":
                return rateGBPToCOP;
            case "GBPToJPY":
                return rateGBPToJPY;
            case "COPToUSD":
                return rateCOPToUSD;
            case "COPToEUR":
                return rateCOPToEUR;
            case "COPToGBP":
                return rateCOPToGBP;
            case "COPToJPY":
                return rateCOPToJPY;
            case "JPYToUSD":
                return rateJPYToUSD;
            case "JPYToEUR":
                return rateJPYToEUR;
            case "JPYToGBP":
                return rateJPYToGBP;
            case "JPYToCOP":
                return rateJPYToCOP;
            default:
                throw new IllegalArgumentException("Conversion rate not available for " + from + " to " + to);
        }
    }
}
