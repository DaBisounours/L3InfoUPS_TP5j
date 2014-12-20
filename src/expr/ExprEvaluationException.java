package expr;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ExprEvaluationException extends Exception {
    String m;

    public ExprEvaluationException(String message){
        super();
        m = message;
    }

    @Override
    public void printStackTrace(){
        System.err.println("Error : "+m+"\n");
    }
}
