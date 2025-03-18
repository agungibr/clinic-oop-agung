package unguided;

import unguided.entities.*;
import unguided.utils.DataChecker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("TDR3000", "Dr. James", "Cardiology");
        Doctor doctor2 = new Doctor("TDR3001", "Dr. Paul", "Pediatrics");   

        Patient patient1 = new Patient("TP150", "Eden Hazard", 34, "High Blood Pressure");
        Patient patient2 = new Patient("TP151", "Adriano", 45, "Common Cold");

        if (!DataChecker.isValidAge(patient1.getAge())) {
            System.out.println("Invalid age for patient: " + patient1.getName());
        }

        if (!DataChecker.isValidDiagnosis(patient2.getDiagnosis())) {
            System.out.println("Invalid diagnosis for patient: " + patient2.getName());
        }

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        Appointment appointment1 = new Appointment("APT-001", doctor1, patient1, now);
        Appointment appointment2 = new Appointment("APT-002", doctor2, patient2, now.plusDays(1));

        if (!DataChecker.isValidAppointmentId(appointment1.getAppointmentId())) {
            System.out.println("Invalid appointment ID: " + appointment1.getAppointmentId());
        }

        System.out.println("===== Clinic Management System =====");
        System.out.println("\n--- Doctors ---");
        System.out.println(doctor1);
        System.out.println(doctor2);

        System.out.println("\n--- Patients ---");
        System.out.println(patient1);
        System.out.println(patient2);

        System.out.println("\n--- Appointments ---");
        System.out.println(appointment1);
        System.out.println(appointment2);

        System.out.println("\n--- Statistics ---");
        System.out.println("Total Diagnoses Recorded: " + Patient.getDiagnosisCount());
    }
}
