package collectionFramework;

public class ArrayList {
    Object[] values;
    int size = 0;
    int capacity = 10;

    public ArrayList() {
        values = new Object[capacity];
    }

    void add(Object data) {
        if (capacity > size) {
            values[size++] = data;
        } else {
            int newCapacity = capacity * 2;
            Object[] newArray = new Object[newCapacity];
            for (int index = 0; index < capacity; index++) {
                newArray[index] = values[index];
            }
            newArray[size++] = data;
            capacity = newCapacity;
            values = newArray;
        }
    }
}
