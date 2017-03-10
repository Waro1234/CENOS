/**
 * Created by frank on 10/03/2017.
 */
public class Variable {
    private String name;
    private Scope.Type type;
    private String value;

    public Variable(String name, Scope.Type type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Scope.Type getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
