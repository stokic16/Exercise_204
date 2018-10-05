

package exercise204;

/**
 * @author Kilian Stöckler
 */
public class Anlage {
    
    private final String name;
    private final String year;
    private final String value;

    public Anlage(String name, String year, String value) {
        this.name = name;
        this.year = year;
        this.value = value;
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
