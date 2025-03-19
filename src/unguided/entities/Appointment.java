package unguided.entities;

import java.time.LocalDateTime;

public class Appointment {
    private String appointmentId;
    private Doctor doctor;
    private Patient patient;
    private LocalDateTime dateTime;

    public Appointment(String appointmentId, Doctor doctor, Patient patient, LocalDateTime dateTime) {
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return """
               Appointment Details:
                  ID: """ + appointmentId + "\n" +
               "  Doctor: " + doctor.getName() + " (ID:" + doctor.getDoctorId() + ")\n" +
               "  Patient: " + patient.getName() + "(ID:" + patient.getPatientId() + ")\n" +
               "  Date & Time: " + dateTime + "\n";
    }
}
