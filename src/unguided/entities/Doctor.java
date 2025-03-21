package unguided.entities;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;

    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return """
               Doctor Details:
                  ID: """ + doctorId + "\n" +
               "   Name: " + name + "\n" +
               "   Specialization: " + specialization + "\n";
    }
}
