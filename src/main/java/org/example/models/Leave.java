package org.example.models;

public class Leave {
    private int startDay;
    private int endDay;

    public Leave(int startDay, int endDay) {
        this.startDay = startDay;
        this.endDay = endDay;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "startDay=" + startDay +
                ", endDay=" + endDay +
                '}';
    }
}
