import javax.naming.Name;

public class NameNotPrimitiveType implements Expression {

    @Override
    public String interpret(String context) {
        if(context.equals("int") || context.equals("boolean") || context.equals("double")) {
            context = context + "1";
        }
        return context;
    }
}
