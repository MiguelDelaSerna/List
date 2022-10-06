import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.arraylist.ArrayListIterator;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args){
        //List lista1 = new ArrayList();
        List lista2 = new LinkedList();

        lista2.addAtTail("82");
        lista2.addAtTail("6");
        lista2.addAtFront("18");
        lista2.setAt(1,"44");
        lista2.addAtFront("73");

        Iterator iterator = lista2.getIterator();

        while(iterator.hasNext()){
            String value = iterator.next();

            System.out.println(value);
        }
    }
}
