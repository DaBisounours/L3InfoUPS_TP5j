package expr;

import type.*;
import valeur.Valeur;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ExprConstanteInt implements Expr {
    @Override
    public Valeur evaluate(String varName, Map<String, Valeur> env) throws ExprEvaluationException {
        HashMap<String, Valeur> hm = (HashMap) env;
        if (hm.get(varName)==null)
            throw new ExprEvaluationException("Unbound value "+varName);
        return hm.get(varName);
    }

    @Override
    public Type type(String varName, Map<String, Type> env) throws ExprEvaluationException  {
        HashMap<String, Type> hm = (HashMap) env;
        if(hm!=null) {
            if (hm.get(varName) == null)
                return hm.get(varName);
            else if(Pattern.compile("[^0-9]").matcher(varName).find()) return new TInt();
        }
        else
        {
            if (!Pattern.compile("[^a-zA-Z]").matcher(varName).find())
                throw new ExprEvaluationException("Unbound value " + varName);
            else if (Pattern.compile("[^0-9]").matcher(varName).find())
                throw new ExprEvaluationException("Wrong type for value "+varName+"\nExpected : "+new TInt());
            else
                return new TInt();
        }

        return null;
    }
}
