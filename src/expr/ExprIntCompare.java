package expr;

import type.TInt;
import type.Type;
import valeur.Valeur;
import valeur.ValeurBool;
import valeur.ValeurInt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ExprIntCompare implements Expr {

    @Override
    public Valeur evaluate(String expression, Map<String, Valeur> env) throws ExprEvaluationException {
        HashMap<String, Valeur> hm = (HashMap) env;
        expression.replaceAll("\\s", "");
        String[] expressions = expression.split("=");
        if(expressions.length!=2) throw new ExprEvaluationException("Syntax error");
        ArrayList<ValeurInt> valeurInts = new ArrayList<ValeurInt>();
        for (String elem : expressions) {
            if (!Pattern.compile("[^a-zA-Z]").matcher(elem).find()) {
                valeurInts.add((ValeurInt) (new ExprConstanteInt()).evaluate(elem, hm));
            } else {
                if ((new ExprConstanteInt()).type(elem, null).compare(new TInt()))
                    valeurInts.add(new ValeurInt(Integer.valueOf(elem)));
            }
        }

        if (valeurInts.get(0).getVal()==valeurInts.get(1).getVal())
            return new ValeurBool(true);
        else
            return new ValeurBool(false);
    }

    @Override
    public Type type(String varName, Map<String, Type> env) throws ExprEvaluationException {
        HashMap<String, Type> hm = (HashMap) env;

        return hm.get(varName);
        //return evaluate(varName,env).getType();
    }

}
