package com.campus.assignment_2b_gustavosanchez.models;

public class Reading {
    private String readingTimestamp;
    private double readingValue;
    private String readingFlags;

    // Constructor
    public Reading(String timestamp, double value, String flags) {
        this.readingTimestamp = timestamp;
        this.readingValue = value;
        this.readingFlags = flags;
    }

    // Getters
    public String getTimestamp() {
        return readingTimestamp;
    }

    public double getValue() {
        return readingValue;
    }

    public String getFlags() {
        return readingFlags;
    }

    // Optionally setters if needed
    public void setTimestamp(String timestamp) {
        this.readingTimestamp = timestamp;
    }

    public void setValue(double value) {
        this.readingValue = value;
    }

    public void setFlags(String flags) {
        this.readingFlags = flags;
    }
}
