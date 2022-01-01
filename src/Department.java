public class Department {
    private String name;
    private String location;
    private Doctor[] doctor;
    private Nurse[] nurse;

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
        return doctor;
    }

    public void setDoctor(Doctor[] doctor) {
        this.doctor = doctor;
    }

    public Nurse[] getNurse() {
        return nurse;
    }

    public void setNurse(Nurse[] nurse) {
        this.nurse = nurse;
    }
}
