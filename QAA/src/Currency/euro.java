package Currency;

public class euro extends Currency implements ConvertedCurrency{
    public euro(double kursNBUExt) {
        super(kursNBUExt);
    }

    @Override
    public String getCurrencyName() {
        return "Euro";
    }

    @Override
    public boolean isFreeConverted() {
        return true;
    }
}
