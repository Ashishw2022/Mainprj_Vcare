package com.example.vcare;

public class Admin_Appointments {

    private String Date,Time,Doctor,Patient_phone,email ;

    public Admin_Appointments() {
    }

    public Admin_Appointments(String date, String time, String doctor, String patient_phone,String email) {
        Date = date;
        Time = time;
        Doctor = doctor;
        Patient_phone = patient_phone;
        email=email;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String doctor) {
        Doctor = doctor;
    }

    public String getPatient_phone() {
        return Patient_phone;
    }

    public void setPatient_phone(String patient_phone) {
        Patient_phone = patient_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
