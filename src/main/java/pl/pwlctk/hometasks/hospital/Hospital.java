package pl.pwlctk.hometasks.hospital;

import java.util.PriorityQueue;
import java.util.Queue;

class Hospital {
    private Queue<Patient> patients;

    Hospital() {
        patients = new PriorityQueue<>(new PatientPriority());
    }

    void addPatient(String name, String lastName, String ailment, int priority) {
        patients.add(new Patient(name, lastName, ailment, priority));
    }

    Patient handlePatient() {
        return patients.poll();
    }

    boolean queueIsEmpty() {
        return patients.isEmpty();
    }

    int patientQueueSize() {
        return patients.size();
    }

    Queue getPatients() {
        return patients;
    }

    String viewPatient() {
        if (patients.isEmpty()) {
            return "Brak pacjentów!";
        } else {
            return patients.peek().getName() + " (" + patients.peek().getAilment() + ")";
        }
    }
}
