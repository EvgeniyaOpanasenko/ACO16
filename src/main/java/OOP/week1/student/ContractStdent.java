package OOP.week1.student;

/**
 * Created by Lisa on 11/17/2016.
 */
public class ContractStdent extends Student{
    private int period;

    public ContractStdent(String name, String surname, double averageMark, int period) {
        super(name, surname, averageMark);
        this.period = period;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "ContractStdent " +
                "period - " + period + super.toString();
    }
}
