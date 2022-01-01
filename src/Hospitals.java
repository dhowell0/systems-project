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


        boolean isGood = false;
        while (!isGood) {
            System.out.println("Directory");
            System.out.println("");
            System.out.println("1. List Hospitals");
            System.out.println("2. Exit program");
            int user = input.nextInt();
            if (user > 0 && user <= 2) {
                switch (user) {
                    case 1:
                        //hospitals


                        boolean isValid = false;
                        while (!isValid) {
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
                            if (user2 > 0 && user2 <= 5) {

                                switch (user2) {
                                    case 1:
                                        String[] h = new String[hospitals.length + 1];
                                        System.out.println("name of hospital");
                                        String user3 = input.next();
                                        h[h.length - 1] = user3;
                                        hospitals = h;
                                        break;
                                    case 2:
                                        //ethan this is where your part will go
                                        String[] rh = new String{hospitals.length - 1];
                                        String rh1 = input.next();
                                        rh[rh.length - 1] = rh1;
                                        remove hospital = rh;
                                        break;

                                    case 3:
                                        //patients


                                        boolean isGreat = false;
                                        while (!isGreat) {
                                            System.out.println(Arrays.toString(patients));
                                            System.out.println("1. Add Patients");
                                            System.out.println("2. Remove Patients");
                                            System.out.println("3. Back");
                                            int user4 = input.nextInt();
                                            if (user4 > 0 && user4 <= 3) {
                                                switch (user4) {
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
                                                        isGreat = true;
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        //departments


                                        boolean isCake = false;
                                        while (!isCake) {
                                            System.out.println(Arrays.toString(departments));
                                            System.out.println("1. Add Departments");
                                            System.out.println("2. Remove Departments");
                                            System.out.println("3. Doctors");
                                            System.out.println("4. Nurses");
                                            System.out.println("5. Back");
                                            int user4 = input.nextInt();
                                            if (user4 > 0 && user4 <= 5) {
                                                switch (user4) {
                                                    case 1:
                                                        String[] de = new String[departments.length + 1];
                                                        System.out.println("name of department");
                                                        String user5 = input.next();
                                                        de[de.length - 1] = user5;
                                                        departments = de;
                                                        break;
                                                    case 2:
                                                        //ethan your stuff goes here

                                                    case 3:
                                                        //doctors


                                                        boolean isChocolate = false;
                                                        while (!isChocolate) {
                                                            System.out.println(Arrays.toString(doctors));
                                                            System.out.println("1. Add Doctors");
                                                            System.out.println("2. Remove Doctors");
                                                            System.out.println("3. Back");
                                                            int user6 = input.nextInt();
                                                            if (user6 > 0 && user6 <= 3) {
                                                                switch (user6) {
                                                                    case 1:
                                                                        String[] d = new String[doctors.length + 1];
                                                                        System.out.println("name of doctor");
                                                                        String user7 = input.next();
                                                                        d[d.length - 1] = user7;
                                                                        doctors = d;
                                                                        break;
                                                                    case 2:
                                                                        //ethan your stuff goes here


                                                                    case 3:
                                                                        isChocolate = true;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 4:
                                                        //nurses


                                                        boolean isLie = false;
                                                        while (!isLie) {
                                                            System.out.println(Arrays.toString(nurses));
                                                            System.out.println("1. Add Nurses");
                                                            System.out.println("2. Remove Nurses");
                                                            System.out.println("3. Back");
                                                            int user6 = input.nextInt();
                                                            if (user6 > 0 && user6 <= 3) {
                                                                switch (user6) {
                                                                    case 1:
                                                                        String[] n = new String[nurses.length + 1];
                                                                        System.out.println("name of patient");
                                                                        String user7 = input.next();
                                                                        n[n.length - 1] = user7;
                                                                        nurses = n;
                                                                        break;
                                                                    case 2:
                                                                        //ethan your stuff goes here


                                                                    case 3:
                                                                        isLie = true;
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 5:
                                                        isCake = true;
                                                        break;
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        isValid = true;
                                        break;
                                }
                            }
                        }
                        break;
                    case 2:
                        isGood = true;
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
