# 🏥 Clinic Management System - Java OOP Assignment

## 📖 Project Overview
This project is a simple Clinic Management System designed to manage doctors, patients, and appointments. It is built using Object-Oriented Programming (OOP) principles to ensure clean, modular, and maintainable code. The system emphasizes encapsulation, a core OOP concept, to protect the internal state of objects and provide controlled access to their data.

## 📂 Project Structure
```
clinic-oop-agung/
├── src/
│   └── Guided/
│   └── Unguided/           # Root package
│       └── entities/       # Core classes
│           ├── Doctor.java
│           ├── Patient.java
│           └── Appointment.java
│       └── utils/  
│           ├── DataChecker.java
└── README.md
```

## ✅ Core Classes

### 1. Appointment Class
![Image](https://github.com/user-attachments/assets/f9d5bc0d-f4b4-430b-aeb8-9fe2c68c1340)

Represents an appointment between a doctor and a patient. It encapsulates the following attributes:

- `appointmentId`: A unique identifier for the appointment.
- `doctor`: The doctor assigned to the appointment.
- `patient`: The patient attending the appointment.
- `dateTime`: The date and time of the appointment.

The class provides getter methods (getAppointmentId(), getDoctor(), getPatient(), getDateTime()) to access these attributes and a setter method (setPatient(Patient)) to update the patient. The toString() method returns a formatted string representation of the appointment details.

### 2. Doctor Class
![Image](https://github.com/user-attachments/assets/2479a6ee-d553-488e-8e03-a69741d4fe02)

Represents a doctor in the clinic. It encapsulates the following attributes:

- `doctorId`: A unique identifier for the doctor.
- `name`: The doctor's name.
- `specialization`: The doctor's area of expertise.

The class provides getter methods (getDoctorId(), getName(), getSpecialization()) to access these attributes. The toString() method returns a formatted string representation of the doctor's details.

### 3. Patient Class
![Image](https://github.com/user-attachments/assets/f48f89fe-c3d8-47bc-a135-17527b9fa539)

Represents a patient in the clinic. It encapsulates the following attributes:

- `patientId`: A unique identifier for the patient.
- `name`: The patient's name.
- `age`: The patient's age.
- `diagnosis`: The medical diagnosis for the patient.
- `diagnosisCount`: A static variable that tracks the total number of diagnoses recorded.

The class provides getter methods (getPatientId(), getName(), getAge(), getDiagnosis(), getDiagnosisCount()) to access these attributes and setter methods (setName(String), setAge(int)) to modify them. The toString() method returns a formatted string representation of the patient's details.

### 4. DataChecker Class
![Image](https://github.com/user-attachments/assets/bc313eb6-9177-4b81-959c-1d3ca8c2b5fb)

This is a utility class used for data validation. It contains three static methods:

- `isValidAge(int)` checks if a patient's age is valid (between 1 and 119).
- `isValidDiagnosis(String)` ensures the diagnosis is not empty or null.
- `isValidAppointmentId(String)` validates the format of the appointment ID (e.g., "APT-001").

## 🌟 Output
```
===== Clinic Management System =====

--- Doctors ---
Doctor Details:
   ID: TDR3000
   Name: Dr. Felipe Segura
   Specialization: Sports Medicine

Doctor Details:
   ID: TDR3001
   Name: Dr. Gary O'Driscoll
   Specialization: Sports Medicine

--- Patients ---
Patient Details:
   ID: TP150
   Name: Eden Hazard
   Age: 34
   Diagnosis: Ankle Injury

Patient Details:
   ID: TP151
   Name: Ronaldo Luís Nazário de Lima
   Age: 45
   Diagnosis: Knee Injury

--- Appointments ---
Appointment 1:
   Date & Time: 2023-10-25 14:30
   Doctor: Dr. Felipe Segura
   Patient: Eden Hazard

Appointment 2:
   Date & Time: 2023-10-26 14:30
   Doctor: Dr. Gary O'Driscoll
   Patient: Ronaldo Luís Nazário de Lima

--- Statistics ---
Total Diagnoses Recorded: 2
```