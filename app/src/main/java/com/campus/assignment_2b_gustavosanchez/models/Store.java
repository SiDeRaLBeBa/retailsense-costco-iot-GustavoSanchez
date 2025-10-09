package com.campus.assignment_2b_gustavosanchez.models;

public class Store {

    private String name;
    private String city;
    private String lastUpdated; // HH:MM format
    private int activeAlerts;   // Number of active alerts

    public Store(String name, String city, String lastUpdated, int activeAlerts) {
        this.name = name;
        this.city = city;
        this.lastUpdated = lastUpdated;
        this.activeAlerts = activeAlerts;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public int getActiveAlerts() {
        return activeAlerts;
    }

    public void setActiveAlerts(int activeAlerts) {
        this.activeAlerts = activeAlerts;
    }
}
