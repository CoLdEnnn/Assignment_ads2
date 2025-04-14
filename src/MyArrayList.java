import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int length;

    public MyArrayList() {
        elements = new Object[5];
        length = 0;
    }

    @Override
    public void add(T element) {
        if (length == elements.length) {
            increaseCapacity();
        }
        elements[length++] = element;
    }

    private void increaseCapacity() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i]; //upcasting
        }
        elements = newElements;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index]; //downcasting
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        elements[index] = item;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);
        elements[index] = element;
    }

    @Override
    public T getFirst() {return get(0);}

    @Override
    public T getLast() {return get(length - 1);}

    @Override
    public void addFirst(T element) {add(0, element);}

    @Override
    public void addLast(T element) {add(element);}

    @Override
    public void remove(int index){
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i+1];
        }
    }

    @Override
    public void removeFirst() {remove(length - 1);}

    @Override
    public void removeLast() {remove(length - 1);}

    @Override
    public void clear() {
        this.elements = new Object[5];
        length = 0;
    }

    @Override
    public int indexOf(T item){
        for (int i = 0; i < length; i++) {
            if (item.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object){
        for (int i = length - 1; i >= 0; i--) {
            if (object.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        return indexOf((T) object) != -1;
    }

    @Override
    public void sort() {
        for (int i = length - 1; i >= 0; i--) {
            T temp = get(i);
            int j = i - 1;
            while (j >= 0 && temp.equals(elements[j])) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = temp;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[length];
        for (int i = 0; i < length; i++) {
            result[i] = elements[i];
        }
        return result;
    }

    private void checkIndex(int index){
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + " not found");
        }
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < length;
            }

            @Override
            public T next() {
                return get(currentIndex++);
            }
        };
    }
}