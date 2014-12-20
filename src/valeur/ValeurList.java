package valeur;

import type.TList;
import type.Type;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Evan Graïne on 12/19/14.
 */
public class ValeurList<ValType> implements Valeur {
    private List<ValType> list;
    private ListIterator<ValType> listIterator;

    public ValeurList(List<ValType> l){ this.list=l; listIterator=l.listIterator();}

    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        //Open list
        stringBuilder.append("[");
        //Adds each element in the string
        while(listIterator.hasNext())
            stringBuilder.append(listIterator.next()).append(", ");
        if(stringBuilder.length()>3)stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());
        //Close list
        stringBuilder.append("]");
        //Return String
        return stringBuilder.toString();
    }

    @Override
    public Type getType() {
        return new TList(null);
    }
}
