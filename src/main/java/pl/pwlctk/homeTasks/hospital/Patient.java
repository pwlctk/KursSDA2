package pl.pwlctk.homeTasks.hospital;

public class Patient {
    private String name;
    private String lastName;
    private String ailment;
    private int priority;


    Patient(String name, String lastName, String ailment, int priority) {
        this.name = name;
        this.lastName = lastName;
        this.ailment = ailment;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + ";" + lastName + ";" + ailment + ";" + priority;
    }

    int getPriority() {
        return priority;
    }

    String getName() {
        return name;
    }

    String getAilment() {
        return ailment;
    }
}