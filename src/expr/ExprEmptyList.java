package expr;

import type.TList;
import type.Type;
import valeur.Valeur;
import valeur.ValeurList;

import java.util.Map;

/**
 * Created by Evan Graïne on 12/20/14.
 */
public class ExprEmptyList implements Expr {

    @Override
    public Valeur evaluate(String expression, Map<String, Valeur> env) throws ExprEvaluationException {
        expression.replaceAll("\\s", "");
        if(expression.contentEquals("[]"));
        return new ValeurList<Object>(null);
    }

    @Override
    public Type type(String varName, Map<String, Type> env) throws ExprEvaluationException {
        if(env!=null) {
            if (env.get(varName) != null) return env.get(varName);
        }
        else
        {
            if(varName.contentEquals("[]"));
                return new TList(null);
        }
        throw new ExprEvaluationException("Wrong type for expression "+varName+"\nExpected empty list");
    }
}
