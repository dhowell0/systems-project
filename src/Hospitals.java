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
public class Hospitals {
    private Department[] departments;
    private String name;
    private String address;
    private Patient[] patients;

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
    Scanner input = new Scanner(System.in);
    public void menu() {
        String mainMenu = "Hospital Menu: \n  1. Edit Name \n  2. Edit Location \n  3. Add Department \n 4. Return";
        int choice = Util.getIntVal(mainMenu, 1, 4);
        switch (choice){
            case 1:
                setName(Util.getStringVal("Hospital Name: ", 1, 999));
                break;
            case 2:
                setLocation(Util.getStringVal("Location: ", 1, 999));
                break;
            case 3:
                //add Department
                System.out.println("Name of Department: ");
                String name = input.next();
                Department newDepartment = new Department(name);
                newDepartment.menu();
                addDepartment(newDepartment);
                break;    
            case 4:
                return;
    
    
    
    
    
    
    
    
    /* sadness --> 
import java.util.Arrays;
import java.util.Scanner;


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
                                        for (int i = 0; i < hospitals.length; i++) {
                                            h[i] = hospitals[i];
                                        }
                                        System.out.println("name of hospital");
                                        String user3 = input.next();
                                        h[h.length - 1] = user3;
                                        hospitals = h;
                                        break;
                                    case 2:
                                        //Removes Hospitals
                                        String[] rh = new String[hospitals.length - 1];
                                        String rh1 = input.next();
                                        int k = 0;
                                        for (int i = 0; i < hospitals.length; i++) {
                                            if (rh1 != hospitals[i]) {
                                                rh[k] = hospitals[i];
                                                k++;
                                            } else {

                                            }
                                        }
                                        hospitals = rh;  
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
                                                        for (int i = 0; i < patients.length; i++) {
                                                            p[i] = patients[i];
                                                        }
                                                        System.out.println("name of patient");
                                                        String user5 = input.next();
                                                        p[p.length - 1] = user5;
                                                        patients = p;
                                                        break;
                                                    case 2:
                                                        //Removes Patients
                                                        String[] rp = new String[patients.length - 1];
                                                        String rp1 = input.next();
                                                        int t = 0;
                                                        for (int i = 0; i < patients.length; i++) {
                                                            if (rp1 != patients[i]) {
                                                                rp[t] = patients[i];
                                                                t++;
                                                            } else {

                                                            }
                                                        }
                                                          patients = rp;  
                                                          break;

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
                                                        for (int i = 0; i < departments.length; i++) {
                                                            de[i] = departments[i];
                                                        }
                                                        System.out.println("name of department");
                                                        String user5 = input.next();
                                                        de[de.length - 1] = user5;
                                                        departments = de;
                                                        break;
                                                    case 2:
                                                        //Removes Departments
                                                        String[] rp = new String[departments.length - 1];
                                                        String rp1 = input.next();
                                                        int q = 0;
                                                        for (int i = 0; i < departments.length; i++) {
                                                            if (rp1 != departments[i]) {
                                                                rp[q] = departments[i];
                                                                q++;
                                                            } else {

                                                            }
                                                        }
                                                        patients = rp;
                                                        break;
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
                                                                        for (int i = 0; i < doctors.length; i++) {
                                                                            d[i] = doctors[i];
                                                                        }
                                                                        System.out.println("name of doctor");
                                                                        String user7 = input.next();
                                                                        d[d.length - 1] = user7;
                                                                        doctors = d;
                                                                        break;
                                                                    case 2:
                                                                        //Removes Doctors
                                                                        String[] rd = new String[doctors.length - 1];
                                                                        String rd1 = input.next();
                                                                        int v = 0;
                                                                        for (int i = 0; i < doctors.length; i++) {
                                                                            if (rd1 != doctors[i]) {
                                                                                rd[v] = doctors[i];
                                                                                v++;
                                                                            } else {

                                                                            }
                                                                        }
                                                                          hospitals = rd;  
                                                                          break;


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
                                                                        for (int i = 0; i < nurses.length; i++) {
                                                                            n[i] = nurses[i];
                                                                        }
                                                                        System.out.println("name of patient");
                                                                        String user7 = input.next();
                                                                        n[n.length - 1] = user7;
                                                                        nurses = n;
                                                                        break;
                                                                    case 2:
                                                                        //Removes Nurses
                                                                        String[] rn = new String[nurses.length - 1];
                                                                        String rn1 = input.next();
                                                                        int l = 0;
                                                                        for (int i = 0; i < nurses.length; i++) {
                                                                            if (rn1 != nurses[i]) {
                                                                                rn[l] = nurses[i];
                                                                                l++;
                                                                            } else {

                                                                            }
                                                                        }
                                                                         nurses = rn;  
                                                                         break;


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
    }
 */

}
