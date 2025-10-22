package homework_7.doctor;

import homework_7.patient.Patient;

public class Therapist extends  Doctor {
    public Therapist(String name, String lastName) {
        super(name, lastName);
    }

    public void setDoctorToPatient(Patient patient) {
        int plan = patient.getPlan();
        Doctor assignedDoctor;

        switch (plan) {
            case 1:
                assignedDoctor = new Surgeon("Surgeon name", "Surgeon lastname");
                break;
            case 2:
                assignedDoctor = new Dentist("Dentist name", "Dentist lastname");
                break;
            default:
                assignedDoctor = this;
                break;
        }

        patient.setDoctor(assignedDoctor);
        System.out.println("Doctor: ");
        System.out.println(assignedDoctor);
        assignedDoctor.treat();
    }

    @Override
    public void treat() {
        System.out.println("The method treat of therapist");
    }

    @Override
    public String toString() {
        return  "Therapist: " + this.getFullName();
    }
}
