import java.util.Scanner;
public class hospitals {

    public static void main(String[] args) {

    }
        class LinkedListHospital {
            private Node headHospital;

            public void insertHospital(String name) {

                Node add = new Node();
                add.name = name;
                add.next = null;

                add.next = headHospital;
                headHospital = add;
                return;

            }

            public void removeHospital(String name) {

                if (name == headHospital.name) {
                    headHospital = headHospital.next;
                } else {
                    Node pos = headHospital;
                    for (int i = 0; name != pos.next.name; i++) {
                        pos = pos.next;
                    }
                    Node temp = null;
                    temp = pos.next;
                    pos.next = temp.next;
                    temp = null;
                }
            }
        }
        class LinkedListDoctor {

            private Node headDoctor;

            public void insertDoctor(String name) {

                Node add = new Node();
                add.name = name;
                add.next = null;

                add.next = headHospital;
                headHospital = add;
                return;

            }

            public void removeDoctor(String name) {

                if (name == headDoctor.name) {
                    headDoctor = headDoctor.next;
                } else {
                    Node pos = headDoctor;
                    for (int i = 0; name != pos.next.name; i++) {
                        pos = pos.next;
                    }
                    Node temp = null;
                    temp = pos.next;
                    pos.next = temp.next;
                    temp = null;
                }
            }

        }
    }

