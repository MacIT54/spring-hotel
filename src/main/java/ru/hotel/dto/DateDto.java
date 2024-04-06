package ru.hotel.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.*;

public class DateDto {

    @Size(min = 10, max = 1000)
    @NotEmpty(message = "{validation.hotel.description.not-empty}")
    private int year;
    private int day;
    private int month;

    public DateDto() {

    }

    public DateDto(int year, int day, int month) {
        this.year = year;
        this.day = day;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
