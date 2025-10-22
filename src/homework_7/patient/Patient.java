package homework_7.patient;

import homework_7.doctor.Doctor;

public class Patient {
    private int plan;
    private Doctor doctor;

    public Patient(int plan) {
        this.plan = plan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public int getPlan() {
        return this.plan;
    }
}
