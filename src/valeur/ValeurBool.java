package valeur;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ValeurBool implements Valeur{
    private boolean val;

    public ValeurBool(boolean v){ this.val=v; }

    @Override
    public String toString(){
        return String.valueOf(val);
    }
}
