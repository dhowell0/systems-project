import java.util.Scanner;

/**
 * models a hospital system
 */
public class Runner {
    private Hospitals[] hospitals;

    /**
     * gets everything started
     * @param args not used
     */
    public static void main(String[] args) {
        Runner r = new Runner();
        r.menu();
    }

    /**
     * runs a menu
     */
    public void menu() {
        Scanner input = new Scanner(System.in);
        String mainMenu = "Menu: \n  1. Add Hospital \n  2. Remove Hospital \n  3. Edit Hospitals \n  4. exit";
        int choice = Util.getIntVal(mainMenu, 1, 4);
        boolean isValid = false;
        while (!isValid) {
            switch (choice) {
                case 1:
                    //add doctor
                    System.out.println("Name of Hospital: ");
                    String name = input.next();
                    Hospitals newHospital = new Hospitals(name);
                    newHospital.menu();
                    addHospital(newHospital);
                    break;
                case 2:
                    //remove doctors
                    if (hospitals == null) {
                        return;
                    }
                    Hospitals[] rd = new Hospitals[hospitals.length - 1];
                    String rd1 = input.next();
                    int v = 0;
                    for (int i = 0; i < hospitals.length; i++) {
                        if (rd1.equals(hospitals[i].getName())) {
                            rd[v] = hospitals[i];
                            v++;
                        } else {

                        }
                    }
                    hospitals = rd;
                    break;
                case 3:
                    //edit doctors
                    String prompt2 = "0: Abort\n";
                    for (int i = 0; i < hospitals.length; i++) {
                        prompt2 += ((i + 1) + ": " + hospitals[i].getName() + "\n");
                    }
                    int hospitalChoice = Util.getIntVal(prompt2, 0, hospitals.length);
                    if (hospitalChoice == 0) break;
                    hospitals[hospitalChoice - 1].menu();
                    break;
                case 4:
                    isValid = true;
                    break;
            }
        }
    }

    /**
     *
     * @param hospital
     */
    public void addHospital(Hospitals hospital) {
        if (hospitals == null) {
            hospitals = new Hospitals[1];
            hospitals[0] = hospital;
            return;
        }

        Hospitals[] h = new Hospitals[hospitals.length + 1];
        for (int i = 0; i < hospitals.length; i++) {
            h[i] = hospitals[i];
        }

        h[h.length - 1] = hospital;
        hospitals = h;
        return;
    }
}