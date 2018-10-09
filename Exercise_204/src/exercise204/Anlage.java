package exercise204;

/**
 * @author Kilian Stöckler
 */
public class Anlage {

    private final String name;
    private final double year;
    private final int value;
    private final double nd;
    private double[] values = new double[5];

    public Anlage(String name, int value, double year, double nd) {
        this.name = name;
        this.year = year;
        this.value = value;
        this.nd = nd;
    }

    public void calc(int year) {
        if(this.year>year){
            values[0]=-1;
        }else{
            values[0] = year - this.year;
            values[1] = value / nd;
            values[2] = values[1] * values[0];
            values[3] = value - values[2];
            values[4] = values[3] - values[1];
        }
        if(values[4]<=0){
            values= new double[5];
            values[0]=-1;
        }
    }

    public double[] getValues() {
        return values;
    }

    public double getNd() {
        return nd;
    }

    public int getValue() {
        return value;
    }
    
    

    public String getName() {
        return name;
    }

    public double getYear() {
        return year;
    }

}
