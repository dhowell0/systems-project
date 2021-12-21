import java.util.Scanner;
public class hospitals {

    public static void main(String[] args) {

        class LinkedList {
            private Node headHospital;

            public void insertHospital(int value) {

                Node add = new Node();
                add.value = value;
                add.next = null;

                add.next = head;
                headHospital = add;
                return;

            }
            public void removeHospital(int value){

                if(value==headHospital.value){
                    headHospital=headHospital.next;
                } else {
                    Node pos= headHospital;
                    for(int i=0; value != pos.next.value; i++){
                        pos=pos.next;
                    }
                    Node temp = null;
                    temp = pos.next;
                    pos.next = temp.next;
                    temp=null;
                }
            }


        }
    }
}
