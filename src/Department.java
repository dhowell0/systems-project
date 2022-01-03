import java.util.Scanner;

public class Department {
    private String name;
    private String location;
    private Doctor[] doctors;
    private Nurse[] nurses;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Doctor[] getDoctor() {
        return doctors;
    }

    public void setDoctor(Doctor[] doctor) {
        this.doctors = doctor;
    }

    public Nurse[] getNurse() {
        return nurses;
    }

    public void setNurse(Nurse[] nurse) {
        this.nurses = nurse;
    }

    /**
     * add a doctor object
     *
     * @param doctor
     */
    public void addDoctor(Doctor doctor) {
        if (doctors == null) {
            doctors = new Doctor[1];
            doctors[0] = doctor;
            return;
        }

        Doctor[] d = new Doctor[doctors.length + 1];
        for (int i = 0; i < doctors.length; i++) {
            d[i] = doctors[i];
        }

        d[d.length - 1] = doctor;
        doctors = d;
        return;
    }

    /**
     * add a nurse object
     *
     * @param nurse
     */
    public void addNurse(Nurse nurse) {
        if (nurses == null) {
            nurses = new Nurse[1];
            nurses[0] = nurse;
            return;
        }

        Nurse[] n = new Nurse[nurses.length + 1];
        for (int i = 0; i < nurses.length; i++) {
            n[i] = nurses[i];
        }

        n[n.length - 1] = nurse;
        nurses = n;
        return;
    }

    Scanner input = new Scanner(System.in);

    /**
     * runs a menu
     */
    public void menu() {
        String mainMenu = "Department Menu: \n  1. Edit Name \n  2. Edit Location \n  3. Add Doctor \n  4. Remove Doctor \n  5. Edit Doctors \n  6. Add Nurse \n  7. Remove Nurse \n  8. Edit Nurses \n  9. Return";
        int choice = Util.getIntVal(mainMenu, 1, 9);
        while (true) {
            switch (choice) {
                case 1:
                    setName(Util.getStringVal("Department Name: ", 1, 999));
                    break;
                case 2:
                    setLocation(Util.getStringVal("Location: ", 1, 999));
                    break;
                case 3:
                    //add doctor
                    System.out.println("Name of Doctor: ");
                    String name = input.next();
                    Doctor newDoctor = new Doctor(name);
                    newDoctor.menu();
                    addDoctor(newDoctor);
                    break;
                case 4:
                    //remove doctors
                    if (doctors == null) {
                        return;
                    }
                    Doctor[] rd = new Doctor[doctors.length - 1];
                    String rd1 = input.next();
                    int v = 0;
                    for (int i = 0; i < doctors.length; i++) {
                        if (rd1.equals(doctors[i].getName())) {
                            rd[v] = doctors[i];
                            v++;
                        } else {

                        }
                    }
                    doctors = rd;
                    break;
                case 5:
                    //edit doctors
                    String prompt2 = "0: Abort\n";
                    for (int i = 0; i < doctors.length; i++) {
                        prompt2 += ((i + 1) + ": " + doctors[i].getName() + "\n");
                    }
                    int doctorsChoice = Util.getIntVal(prompt2, 0, doctors.length);
                    if (doctorsChoice == 0) break;
                    doctors[doctorsChoice - 1].menu();
                    break;
                case 6:
                    //add nurses
                    System.out.println("Name of Nurse: ");
                    String name2 = input.next();
                    Nurse newNurse = new Nurse(name2);
                    newNurse.menu();
                    addNurse(newNurse);
                    break;
                case 7:
                    //remove nurses
                    Nurse[] r = new Nurse[nurses.length - 1];
                    String r1 = input.next();
                    int g = 0;
                    for (int i = 0; i < nurses.length; i++) {
                        if (r1.equals(nurses[i].getName())) {
                            r[g] = nurses[i];
                            g++;
                        } else {

                        }
                    }
                    nurses = r;
                    break;
                case 8:
                    //edit nurses
                    String prompt = "0: Abort\n";
                    for (int i = 0; i < nurses.length; i++) {
                        prompt += ((i + 1) + ": " + nurses[i].getName() + "\n");
                    }
                    int nurseChoice = Util.getIntVal(prompt, 0, nurses.length);
                    if (nurseChoice == 0) break;
                    nurses[nurseChoice - 1].menu();

                    break;
                case 9:
                    return;
            }
        }
    }
}