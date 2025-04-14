public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        print(list);
        System.out.println("___________________________________________________");

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        print(linkedList);

        MyArrayList<Student> list2 = new MyArrayList<>();
        list2.add(new Student("Akerke", 20));
        list2.add(new Student("Carl", 30));
        list2.add(new Student("Danial", 40));
    }

    public static void print(MyList<Integer> list) {
        for (int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

}