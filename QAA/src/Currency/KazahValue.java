package Currency;

public class KazahValue extends Currency implements ConvertedCurrency{
    public KazahValue(double kursNBUExt) {
        super(kursNBUExt);
    }

    @Override
    public String getCurrencyName() {
        return null;
    }

    @Override
    public boolean isFreeConverted() {
        return false;
    }
}
