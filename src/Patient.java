/**
 * holds the primitives for a patient
 */
public class Patient {
    private String name;
    private int ssn;
    private String dob;
    private String date;

    public Patient(String name2) {
        name = name2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * runs a menu
     */
    public void menu() {
        String mainMenu = "Patient Menu: \n  1. Edit Name \n  2. Edit Date \n  3. Edit DOB \n  4. Edit SSN \n  5. Return";
        int choice = Util.getIntVal(mainMenu, 1, 5);
        switch (choice) {
            case 1:
                setName(Util.getStringVal("Patient Name: ", 1, 999));
                break;
            case 2:
                setDate(Util.getStringVal("Date: ", 1, 999));
                break;
            case 3:
                setDob(Util.getStringVal("Date of Birth: ", 1, 999));
                break;
            case 4:
                setSsn(Util.getIntVal("Social Security Number: ", 1, 99999));
                break;
            case 5:
                return;
        }
    }
}
