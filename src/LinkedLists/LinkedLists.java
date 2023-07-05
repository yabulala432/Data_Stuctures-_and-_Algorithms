package LinkedLists;

public class LinkedLists {
    private class Node {
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        private int value;
        private Node next;
    }

    private Node node;
    private Node head;
    Node temp = null;
    private static int lengthOfList = 0;

    public LinkedLists(int value) {
        this.node = new Node(value);
        head = this.node;
        lengthOfList++;
    }

    public void addAtLast(int value) {
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(value);
        lengthOfList++;
    }

    public void addAtHead(int x) {
        temp = new Node(x);
        temp.next = head;
        head = temp;
        lengthOfList++;
    }

    public void addAtIndex(int value, int index) {
        if (index <= 0) {
            this.addAtHead(value);
            return;
        } else if (index >= lengthOfList) {
            this.addAtLast(value);
            return;
        }
        temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node1 = new Node(value);
        node1.next = temp.next;
        temp.next = node1;
        lengthOfList++;
    }

    public boolean contains(int value) {
        temp = head;
        while (temp != null) {
            if (temp.value == value) return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(int value) {
        temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.value == value) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void deleteLast() {
        if (lengthOfList == 1) {
            this.node = null;
            this.head = null;
            return;
        }
        temp = head;
        for (int i = 0; i < lengthOfList - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        if (lengthOfList > 0)
            lengthOfList--;
    }

    public void deleteFirst() {
        if (lengthOfList > 1) {
            this.temp = this.head.next;
            this.head = this.temp;

            lengthOfList--;
        }
    }

    public void deleteAt(int index){
        this.temp = head;
        if(index > lengthOfList){
            this.deleteLast();
            return;
        }else if (index <= 0){
            this.deleteFirst();
            return;
        }
        Node previous = head;
        for(int i = 0; i<index-1; i++){
            if(i == index-2){
                previous = temp;
                System.out.println("babula");
            }
            temp = temp.next;
        }
        previous.next = temp.next;
        temp = null;
        lengthOfList--;

    }

    public void displayAll() {
        temp = head;
        if (temp != null) {
            System.out.print("[");
            while (temp.next != null) {
                System.out.print(temp.value + ",");
                temp = temp.next;
            }
            System.out.println(temp.value + "]");
        } else {
            System.out.println("[]");
        }
    }

}
