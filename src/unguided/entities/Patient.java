package unguided.entities;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;
    private static int diagnosisCount = 0;
    
    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        diagnosisCount++;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public static int getDiagnosisCount() {
        return diagnosisCount;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return """
               Patient Details:
                  ID: """ + patientId + "\n" +
               "   Name: " + name + "\n" +
               "   Age: " + age + "\n" +
               "   Diagnosis: " + diagnosis + "\n";
    }
}
