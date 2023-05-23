package Currency;

abstract public class Currency {
    private double kursNBU;


    private double marga = 0.1;

    public Currency(double kursNBUExt){
        kursNBU = kursNBUExt;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double exchangeCurrencyToGrn(double amountofCurrency){
        double tempResult = amountofCurrency * kursNBU * (1-marga);
        System.out.println("For" + amountofCurrency + "you get" + tempResult + "grn");
        return tempResult;
    }

    abstract public String getCurrencyName();

}
