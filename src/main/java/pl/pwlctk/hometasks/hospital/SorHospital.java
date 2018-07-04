package pl.pwlctk.hometasks.hospital;

import java.util.PriorityQueue;
import java.util.Queue;

class SorHospital {
    private Queue<Patient> patients;

    SorHospital() {
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

    void clearPatientsQueue() {
        patients.clear();
    }

    Queue getPatients() {
        return patients;
    }

    String viewPatient() {
        if (patients.isEmpty()) {
            return "Brak pacjętów!";
        } else {
            return patients.peek().getName() + " (" + patients.peek().getAilment() + ")";
        }
    }
}
