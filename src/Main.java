import expr.ExprConstanteInt;
import expr.ExprEvaluationException;
import expr.ExprIntSum;
import type.TInt;
import type.TList;
import valeur.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        TList typeList = new TList(new TList(new TInt()));
        System.out.println(typeList);


        ValeurBool vrai = new ValeurBool(true);
        ValeurBool faux = new ValeurBool(false);
        ArrayList<ValeurBool> l = new ArrayList<ValeurBool>();
        l.add(vrai);
        l.add(faux);
        l.add(faux);
        ValeurList liste = new ValeurList(l);
        System.out.println(liste);

        HashMap<String, TInt> typeHashMap = new HashMap<String, TInt>();
        typeHashMap.put("a", new TInt());
        ExprConstanteInt exprConstanteInt = new ExprConstanteInt();

        try {
            System.out.println(exprConstanteInt.type("a",(Map) typeHashMap));
        } catch (ExprEvaluationException e) {
            e.printStackTrace();
        }

        HashMap<String, ValeurInt> valHashMap = new HashMap<String, ValeurInt>();
        valHashMap.put("a", new ValeurInt(1));
        valHashMap.put("b", new ValeurInt(2));
        valHashMap.put("c", new ValeurInt(2));

        try {
            System.out.println((new ExprIntSum()).evaluate("a+b+1+c+1+1", (Map) valHashMap));
        } catch (ExprEvaluationException e) {
            e.printStackTrace();
        }
    }
}
