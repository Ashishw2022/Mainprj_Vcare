package com.example.vcare;

public class Booking_Appointments {

    private String email;
    private int value;

    public Booking_Appointments() {
    }

    public Booking_Appointments(int value, String email) {
        this.value = value;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
