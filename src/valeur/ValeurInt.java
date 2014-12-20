package valeur;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ValeurInt implements Valeur {


    private Integer val;

    public Integer getVal() {
        return val;
    }
    public ValeurInt(int v){ this.val=v; }


    @Override
    public String toString(){
        return String.valueOf(val);
    }

}
