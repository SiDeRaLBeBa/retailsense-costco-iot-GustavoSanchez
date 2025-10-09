package com.campus.assignment_2b_gustavosanchez.utils;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Simulation {
    private static Simulation instance;
    private LocalTime currentTime = LocalTime.of(8, 0);

    private Simulation() {}

    public static Simulation getInstance() {
        if (instance == null) instance = new Simulation();
        return instance;
    }

    public String getFormattedTime() {
        return currentTime.format(DateTimeFormatter.ofPattern("HH:mm"));
    }

    public void advanceOneHour() {
        currentTime = currentTime.plusHours(1);
    }

    public void reset() {
        currentTime = LocalTime.of(8, 0);
    }
}
