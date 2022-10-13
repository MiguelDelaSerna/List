import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.List;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args){
        List lista1 = new ArrayList();

        lista1.addAtTail("88");
        lista1.addAtTail("11");
        lista1.setAt(3,"16");
        lista1.addAtFront("65");
        lista1.addAtFront("28");


        Iterator iterator = lista1.getIterator();

        while(iterator.hasNext()){
            String value = iterator.next();

            System.out.println(value);
        }
    }
}
