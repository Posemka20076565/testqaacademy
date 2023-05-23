package Currency;

public class Dollar extends Currency implements ConvertedCurrency{

    public Dollar(double kursNBUExt) {
        super(kursNBUExt);
    }

    @Override
    public String getCurrencyName() {
        return "Dollar";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
