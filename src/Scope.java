import java.util.ArrayList;

public class Scope {
    public enum Type {
        BOOL,
        INT,
        STRING,
        VOID,
        LONG;
    }

    private ArrayList<Variable> vars;

    public Scope() {
        this.vars = new ArrayList<>();
    }

    public ArrayList<Variable> getVars() {
        return vars;
    }

    public void addVar(Variable var){
        this.vars.add(var);
    }
}
