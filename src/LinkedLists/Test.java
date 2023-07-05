package LinkedLists;

public class Test {


    public static void main(String[] args) {
        LinkedLists list = new LinkedLists(4);
        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtHead(-1);
        list.addAtLast(5);
        list.addAtLast(10);
        list.addAtIndex(6, 6);
        list.addAtIndex(7, 7);
        list.addAtIndex(8, 8);

        list.displayAll();
        list.deleteAt(4);
        list.displayAll();

        list.deleteAt(4);
        list.displayAll();

        list.deleteAt(4);
        list.displayAll();

        list.deleteAt(4);
        list.displayAll();

        list.deleteAt(7);
        list.displayAll();

        list.deleteAt(0);
        list.displayAll();


    }
}
