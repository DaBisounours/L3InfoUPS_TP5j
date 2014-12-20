package valeur;

import type.TBool;
import type.Type;

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

    @Override
    public Type getType() {
        return new TBool();
    }
}
