public class Nurse {
    private String name;
    private String specialty;
    private String position;
    private int badgeNumber;

    public Nurse(String name2) {
        name = name2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public void menu() {
        String mainMenu = "Nurse Menu: \n  1. Edit Name \n  2. Edit Specialty \n  3. Edit Position \n  4. Edit Badge Number \n  5. Return";
        int choice = Util.getIntVal(mainMenu, 1, 5);
        switch (choice) {
            case 1:
                setName(Util.getStringVal("Nurse Name: ", 1, 999));
                break;
            case 2:
                setSpecialty(Util.getStringVal("Specialty: ", 1, 999));
            case 3:
                setPosition(Util.getStringVal("Position: ", 1, 999));
            case 4:
                setBadgeNumber(Util.getIntVal("Badge Number: ", 1, 99999));
            case 5:
                return;
        }
    }
}
