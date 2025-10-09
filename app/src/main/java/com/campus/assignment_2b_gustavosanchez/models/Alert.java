package com.campus.assignment_2b_gustavosanchez.models;

public class Alert {
    private String severity, message, deviceLabel, storeName, timestamp;

    public Alert(String severity, String message, String deviceLabel, String storeName, String timestamp) {
        this.severity = severity;
        this.message = message;
        this.deviceLabel = deviceLabel;
        this.storeName = storeName;
        this.timestamp = timestamp;
    }

    public String getSeverity() { return severity; }
    public String getMessage() { return message; }
    public String getDeviceLabel() { return deviceLabel; }
    public String getStoreName() { return storeName; }
    public String getTimestamp() { return timestamp; }
}
