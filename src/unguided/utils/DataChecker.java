package unguided.utils;

public class DataChecker {
    public static boolean isValidAge(int age) {
        return age > 0 && age < 120;
    }

    public static boolean isValidDiagnosis(String diagnosis) {
        return diagnosis != null && !diagnosis.trim().isEmpty();
    }

    public static boolean isValidAppointmentId(String appointmentId) {
        return appointmentId != null && appointmentId.matches("APT-\\d{3}");
    }
}
