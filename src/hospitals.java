import java.util.Scanner;
public class hospitals {

    public static void main(String[] args) {

        class LinkedList{
            private Node head;

            public void insert(int value){

                Node add = new Node();
                add.value = value;
                add.next=null;

                add.next = head;
                head = add;
                return;

            }

            public void insertMid(int value, int index){
                Node add = new Node();
                add.value = value;
                add.next=null;

                if(index == 0){
                    insert(value);
                } else {
                    Node pos = head;

                    for(int i = 0; i < index-1; i++){
                        pos = pos.next;
                    }
                    add.next = pos.next;
                    pos.next = add;
                }
            }

            public void append(int value){
                Node add = new Node();
                add.value = value;
                add.next=null;

                if(head == null){
                    head = add;
                } else {
                    Node pos = head;
                    while(pos.next != null){
                        pos = pos.next;
                    }
                    pos.next = add;
                }
            }

        }
}
