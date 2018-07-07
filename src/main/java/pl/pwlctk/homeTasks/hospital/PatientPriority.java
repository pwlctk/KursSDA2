package pl.pwlctk.homeTasks.hospital;

import java.util.Comparator;

public class PatientPriority implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
