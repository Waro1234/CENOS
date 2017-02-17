import java.util.ArrayList;

/**
 * Created by sklar on 2/17/2017.
 */
public class Scope {
    private ArrayList<Object> vars;
    private Scope parent;

    public Scope(ArrayList<Object> vars, Scope parent) {
        this.vars = vars;
        this.parent = parent;
    }

    public ArrayList<Object> getVars() {
        return vars;
    }

    public Scope getParent() {
        return parent;
    }
}
