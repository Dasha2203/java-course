package homework_7;

import homework_7.doctor.Therapist;
import homework_7.patient.Patient;

import java.lang.reflect.Field;

public class HomeworkSeven {
    public static void main(String args[]) {
        System.out.println("=".repeat(10) + " TASK 1");
        Therapist therapist = new Therapist("Name", "FullName");
        System.out.println(therapist);

        Patient patientOne = new Patient(1);
        Patient patientTwo = new Patient(2);
        Patient patientThree = new Patient(3);

        System.out.println("=== Patient 1 ===");
        therapist.setDoctorToPatient(patientOne);

        System.out.println("\n=== Patient 2 ===");
        therapist.setDoctorToPatient(patientTwo);

        System.out.println("\n=== Patient 3 ===");
        therapist.setDoctorToPatient(patientThree);

        System.out.println("=".repeat(10) + " TASK 2");

        Apple apple = new Apple("red");
        System.out.println("Color of apple: " + apple.getColor());

        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);

            field.set(apple, (String) "new color");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("Color after change: " + apple.getColor());
    }
}
