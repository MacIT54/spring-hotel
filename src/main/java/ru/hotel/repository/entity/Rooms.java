package ru.hotel.repository.entity;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;

@Table("rooms")
public class Rooms {
    @PrimaryKey
    private int room_number;
    @Column
    private String room_description;
    @Column
    private String room_type;
    @Column
    private BigDecimal price_per_night;
    @Column
    private String availability;

    public Rooms() {
    }

    public Rooms(String room_description, int room_number, String room_type, BigDecimal price_per_night, String availability) {
        this.room_description = room_description;
        this.room_number = room_number;
        this.room_type = room_type;
        this.price_per_night = price_per_night;
        this.availability = availability;
    }

    public String getRoom_description() {
        return room_description;
    }

    public void setRoom_description(String room_description) {
        this.room_description = room_description;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public BigDecimal getPrice_per_night() {
        return price_per_night;
    }

    public void setPrice_per_night(BigDecimal price_per_night) {
        this.price_per_night = price_per_night;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
