package kantor;


import java.util.Date;



public class Currency {
    private Date DATE;
    private double RATE;

    public Currency(Date DATE, double RATE) {
        this.DATE = DATE;
        this.RATE = RATE;
    }

    public Date getDATE() {
        return DATE;
    }

    public void setDATE(Date DATE) {
        this.DATE = DATE;
    }

    public double getRATE() {
        return RATE;
    }

    public void setRATE(double RATE) {
        this.RATE = RATE;
    }

    @Override
    public String toString() {
        return "Currency{" + "DATE=" + DATE + ", RATE=" + RATE + '}';
    }
}
