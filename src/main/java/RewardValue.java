import java.math.BigDecimal;
import java.math.RoundingMode;

public class RewardValue {

    protected double cashValue;
    protected int milesValue;
    protected double exchangeRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        double convertedCashVal;
        double doubleMiles = 1.0 * milesValue;
        convertedCashVal = doubleMiles * exchangeRate;

        // round convertedCashVal to 2 decimal points
        BigDecimal bd = BigDecimal.valueOf(convertedCashVal);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        return bd.doubleValue();
        
    }

    public int getMilesValue() {
        double milesInput;
        int convertedMileVal;
        milesInput = this.cashValue / exchangeRate;
        Double doubleMiles = milesInput;
        convertedMileVal = doubleMiles.intValue();
        return convertedMileVal;
    }
}