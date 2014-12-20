package expr;

import type.Type;
import valeur.Valeur;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ExprVar implements Expr {
    @Override
    public Valeur evaluate(String expression, Map<String, Valeur> env) throws ExprEvaluationException {
        HashMap<String, Valeur> hm = (HashMap) env;
        return hm.get(expression);
    }

    @Override
    public Type type(String varName, Map<String, Type> env) throws ExprEvaluationException {
        HashMap<String, Type> hm = (HashMap) env;
        return hm.get(varName);
    }

    @Override
    public String toString() {
        //TODO
        return "TODO";
    }
}
