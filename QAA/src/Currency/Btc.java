package Currency;

public class Btc extends Currency{
    public Btc(double kursNBUExt) {
        super(kursNBUExt);
    }

    @Override
    public String getCurrencyName() {
        return "Bitcoin";
    }

    @Override
    public double exchangeCurrencyToGrn(double amountOfCurrency) {
        System.out.println("Операция недоступна");
        return amountOfCurrency;
    }
}