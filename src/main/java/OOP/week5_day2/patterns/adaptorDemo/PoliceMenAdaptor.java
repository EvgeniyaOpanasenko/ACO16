package OOP.week5_day2.patterns.adaptorDemo;

/**
 * Created by Lisa on 11/6/2016.
 */
public class PoliceMenAdaptor extends Policeman {
    private Militioner militioner;

    public PoliceMenAdaptor(Militioner militioner) {
        this.militioner = militioner;
    }

    @Override
    public void serve(){
        militioner.takeBribe();
    }
}
