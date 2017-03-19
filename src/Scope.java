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
    private ArrayList<String> methods;

    public Scope() {
        this.vars = new ArrayList<>();
        this.methods = new ArrayList<>();
    }

    public ArrayList<Variable> getVars() { return vars; }
    public ArrayList<String> getMethods() { return methods ;}

    public void addVar(Variable var){ this.vars.add(var); }
    public void addMethod(String id){ this.methods.add(id); }
}
