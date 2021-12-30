//big list of copy and paste
//
// Scanner input = new Scanner(System.in);
//
// System.out.println("");
//
// boolean isValid=false;
//while (!isValid){
//        printPrompt()
//        int input=getInput();
//        if(input>0 && input<=3){
//        isValid=true;
//        switch(input){
//        // do stuff
//        }
//        }
//        }
//


import java.util.Arrays;
import java.util.Scanner;
public class Hospitals {

    public static void main(String[] args) {

        //System.out.println("2. Add Hospitals");
        //System.out.println("3. Remove Hospital");
        //System.out.println("4. List Doctors");
        //System.out.println("5. Add Doctors");
        //System.out.println("6. Remove Doctors");
        //System.out.println("7. List Nurses");
        //System.out.println("8. Add Nurses");
        //System.out.println("9. Remove Nurses");
        String[] hospitals = new String[0];
        String[] patients = new String[0];
        String[] departments = new String[0];
        String[] doctors = new String[0];
        String[] nurses = new String[0];

            Scanner input = new Scanner(System.in);




                boolean isGood=false;
                while (!isGood){
                    System.out.println("Directory");
                    System.out.println("");
                    System.out.println("1. List Hospitals");
                    System.out.println("2. Exit program");
                    int user = input.nextInt();
                    if(user>0 && user<=2){
                        switch(user) {
                            case 1:
                                boolean isValid=false;
                                while (!isValid){
                                    System.out.println(Arrays.toString(hospitals));
                                    System.out.println("");
                                    System.out.println("Directory");
                                    System.out.println("");
                                    System.out.println("1. Add Hospitals");
                                    System.out.println("2. Remove Hospital");
                                    System.out.println("3. Patients");
                                    System.out.println("4. Departments");
                                    System.out.println("5. Back");
                                    int user2 = input.nextInt();
                                    //hospitals


                                    if(user2>0 && user2<=3){

                                        switch(user2) {
                                            case 1:
                                                String[] h = new String[hospitals.length + 1];
                                                System.out.println("name of hospital");
                                                String user3 = input.next();
                                                h[h.length - 1] = user3;
                                                hospitals = h;
                                                break;
                                            case 2:
                                                //ethan this is where your part will go


                                            case 3:
                                                //patients


                                                boolean isGreat=false;
                                                while (!isGreat){
                                                    System.out.println(Arrays.toString(patients));
                                                    System.out.println("1. Add Patients");
                                                    System.out.println("2. Remove Patients");
                                                    System.out.println("3. Back");
                                                    int user4 = input.nextInt();
                                                    if(user4>0 && user4<=3){
                                                    switch(user4){
                                            case 1:
                                            String[] p = new String[patients.length + 1];
                                            System.out.println("name of patient");
                                            String user5 = input.next();
                                            p[p.length - 1] = user5;
                                            patients = p;
                                            break;
                                                        case 2:
                                                            //ethan your stuff goes here



                                                        case 3:
                                                            isGreat=true;
                                        }
                                    }
                                }
                            case 4:

                            case 5:
                                isValid=true;
                        }
                    }
                }
                            case 2:
                                isGood=true;
            }
        }
    }
                    /*while (true) {
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
            */
    }
}
