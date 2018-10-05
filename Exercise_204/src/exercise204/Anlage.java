package exercise204;

/**
 * @author Kilian Stöckler
 */
public class Anlage {

    private final String name;
    private final String year;
    private final String value;
    private double yearValue;

    public Anlage(String name, String year, String value) {
        this.name = name;
        this.year = year;
        this.value = value;
    }
    
    public void calc(int year) {

    }

    public void setYearValue(double yearValue) {
        this.yearValue = yearValue;
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
