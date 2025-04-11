public class MyLinkedList<T> implements MyList<T>{
    private MyNode<T> node;
    private int length;
    public MyLinkedList(){
        node = null;
        length = 0;
    }

    private class MyNode<T> {
        T data;
        MyNode<T> next;

        public MyNode(T data){
            this.data = data;
        }
    }

    @Override
    public void add(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        if(node==null){
            node = newNode;
        }
        else{
            MyNode<T> current = node;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
            length++;
        }
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public T get(int index) {
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException();
        }
        MyNode<T> current = node;
        for(int i=0;i<index;i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public int size() {
        return length;
    }
}