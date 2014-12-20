package type;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class TBool implements Type{
    @Override
    public boolean compare(Type c) {
        return c.getClass()==this.getClass();
    }

    @Override
    public String toString(){
        return "bool";
    }
}
