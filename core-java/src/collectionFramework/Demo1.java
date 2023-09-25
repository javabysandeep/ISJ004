package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Iterable iterable =  ()->{
            // Iterator<T> iterator();
            Iterator itr = new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public Object next() {
                    return null;
                }
            };
            return itr;
        };
        ArrayList arrayList = new ArrayList();
        Iterator iterator = arrayList.iterator();
        iterator.hasNext();
    }
}
