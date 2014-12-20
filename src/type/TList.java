package type;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class TList implements Type {
    Type lt;

    public TList(Type listType){ this.lt=listType; }

    @Override
    public boolean compare(Type c) {
        return c.getClass()==this.getClass();
    }

    @Override
    public String toString(){
        return lt+" list";
    }
}
