package exercise204;

/**
 * @author Kilian Stöckler
 */
public class Anlage {

    private final String name;
    private final String year;
    private final String value;
    private final int nd;
    private double[] values;

    public Anlage(String name, String year, String value, int nd) {
        this.name = name;
        this.year = year;
        this.value = value;
        this.nd = nd;
    }

    public void calc(int year) {
        double init = Double.parseDouble(this.year);
        double value = Double.parseDouble(this.value);
        values[0] = init - year;
        values[1] = value / nd;
        values[2] = values[1] * values[0];
        values[3] = value - values[2];
        values[4] = values[3] - values[1];
    }

    public double[] getValues() {
        return values;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getYear() {
        return year;
    }

}
