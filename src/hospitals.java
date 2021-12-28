//big list of copy and paste
//Scanner input = new Scanner(System.in);
//System.out.println("");
//
//


import java.util.Arrays;
import java.util.Scanner;
public class hospitals {

    public static void main(String[] args) {
        System.out.println("Directory");
        System.out.println("");
        System.out.println("1. List Hospitals");
        //System.out.println("2. Add Hospitals");
        //System.out.println("3. Remove Hospital");
        //System.out.println("4. List Doctors");
        //System.out.println("5. Add Doctors");
        //System.out.println("6. Remove Doctors");
        //System.out.println("7. List Nurses");
        //System.out.println("8. Add Nurses");
        //System.out.println("9. Remove Nurses");
        String[] hospitals = new String[0];

        while (true){
            Scanner input = new Scanner(System.in);
            int user = input.nextInt();

            if (user == 1) {

                    System.out.println(Arrays.toString(hospitals));
                    System.out.println("");
                    System.out.println("Directory");
                    System.out.println("");
                    System.out.println("1. Add Hospitals");
                    System.out.println("2. Remove Hospital");
                    System.out.println("3. Back");
                    int user2 = input.nextInt();
                    while (true) {
                        if (user2 == 1) {
                            String[] h = new String[hospitals.length + 1];
                            System.out.println("name of hospital");
                            String user3 = input.next();
                            h[h.length - 1] = user3;
                            hospitals = h;
                            //note to self need to fix
                            break;
                        } else if (user2 == 2) {
                            //this is where remove goes


                        } else if (user2 == 3) {
                            //note to self need to fix
                            break;
                        }
                    }
            } else {

            }
        }
    }
}
//menu stuff will finish at a later time
boolean isValid=false;
while (!isValid){
        printPrompt()
        int input=getInput();
        if(input>0 && input<=3){
        isValid=true;
        switch(input){
        // do stuff
        }
        }
        }