package com.campus.assignment_2b_gustavosanchez.models;

public class Device {
    private String label;
    private String type;
    private String store;      // ← add this
    private String status;
    private String lastHeartbeat;

    public Device(String label, String type, String store, String status, String lastHeartbeat) {
        this.label = label;
        this.type = type;
        this.store = store;
        this.status = status;
        this.lastHeartbeat = lastHeartbeat;
    }

    public String getLabel() { return label; }
    public String getType() { return type; }
    public String getStore() { return store; }   // ← add getter
    public String getStatus() { return status; }
    public String getLastHeartbeat() { return lastHeartbeat; }
}
