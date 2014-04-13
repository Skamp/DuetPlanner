package com.duetplanner.elements;

import android.graphics.Color;

import org.joda.time.LocalTime;

/**
 * Created by Sergio on 13/04/14.
 */
public class Activity {

    private LocalTime startTime;
    private LocalTime endTime;
    private String name;
    private Color color;
    private String location;
    private Integer intensity;

    public Activity(LocalTime startTime, LocalTime endTime, String name, Color color, String location, Integer intensity) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
        this.color = color;
        this.location = location;
        this.intensity = intensity;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }
}
