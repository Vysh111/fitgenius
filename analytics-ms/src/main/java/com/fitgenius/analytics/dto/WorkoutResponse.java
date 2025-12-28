package com.fitgenius.analytics.dto;

public class WorkoutResponse {

    private String focus;
    private String intensity;
    private int durationMinutes;


    public WorkoutResponse(String focus, String intensity, int durationMinutes) {
        this.focus = focus;
        this.intensity = intensity;
        this.durationMinutes = durationMinutes;

    }

    public String getFocus() {
        return focus;
    }

    public String getIntensity() {
        return intensity;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}
