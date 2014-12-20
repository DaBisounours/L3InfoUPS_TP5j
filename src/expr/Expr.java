package expr;

import valeur.Valeur;
import type.Type;

import java.util.Map;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public interface Expr {
    public Valeur evaluate(String varName, Map<String, Valeur> env) throws ExprEvaluationException;
    public Type type(String varName, Map<String, Type> env) throws ExprEvaluationException;
}
