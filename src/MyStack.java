public class MyStack<T> {
    private final MyList<T> list;

    public MyStack() {this.list = new MyArrayList<>();}

    public void push(T item) {list.addLast(item);}

    public T pop() {
        T item = list.getLast();
        list.removeLast();
        return item;
    }

    public T peek() {return list.getLast();}

    public boolean isEmpty() {return list.size() == 0;}

    public int size() {return list.size();}
}