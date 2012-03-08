package lab2;

public class TipService {

    private TipCalculator tipCalculator;

    public TipService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }

    public double getTip() {
        return tipCalculator.getTip();
    }

    public String getServiceQuality() {
        return tipCalculator.getServiceQuality().toString();
    }
}
