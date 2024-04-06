package ru.hotel.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public class RoomDto {
    //@Size(min = 1, max = 3)
    @NotNull(message = "{validation.hotel.room.number.not-empty}")
    private int number;
    @Size(min = 1, max = 30)
    @NotEmpty(message = "{validation.hotel.room.type.not-empty}")
    private String type;
    @Size(min = 1, max = 500)
    @NotEmpty(message = "{validation.hotel.room.description.not-empty}")
    private String description;

    private String booked;

    private BigDecimal price;

    public RoomDto() {

    }

    public RoomDto(int number, String type, String description, String booked, BigDecimal price) {
        this.number = number;
        this.type = type;
        this.description = description;
        this.booked = booked;
        this.price = price;
    }

    public RoomDto(int number, String type, String description, String booked) {
        this.number = number;
        this.type = type;
        this.description = description;
        this.booked = booked;
    }

    public RoomDto(int number, String booked) {
        this.number = number;
        this.booked = booked;
    }

    public RoomDto(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBooked() {
        return booked;
    }

    public void setBooked(String booked) {
        this.booked = booked;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

//    private UUID roomId;
//    private String roomDescription;
//    private int roomNumber;
//    private String roomType;
//    private BigDecimal pricePerNight;
//    private boolean availability;
//
//    // Конструкторы, геттеры и сеттеры
//
//    public RoomDto(UUID roomId, String roomDescription, int roomNumber, String roomType, BigDecimal pricePerNight, boolean availability) {
//        this.roomId = roomId;
//        this.roomDescription = roomDescription;
//        this.roomNumber = roomNumber;
//        this.roomType = roomType;
//        this.pricePerNight = pricePerNight;
//        this.availability = availability;
//    }
//
//    public RoomDto(UUID roomId, String roomDescription) {
//        this.roomId = roomId;
//        this.roomDescription = roomDescription;
//    }
//
//    public UUID getRoomId() {
//        return roomId;
//    }
//
//    public void setRoomId(UUID roomId) {
//        this.roomId = roomId;
//    }
//
//    public String getRoomDescription() {
//        return roomDescription;
//    }
//
//    public void setRoomDescription(String roomDescription) {
//        this.roomDescription = roomDescription;
//    }
//
//    public int getRoomNumber() {
//        return roomNumber;
//    }
//
//    public void setRoomNumber(int roomNumber) {
//        this.roomNumber = roomNumber;
//    }
//
//    public String getRoomType() {
//        return roomType;
//    }
//
//    public void setRoomType(String roomType) {
//        this.roomType = roomType;
//    }
//
//    public BigDecimal getPricePerNight() {
//        return pricePerNight;
//    }
//
//    public void setPricePerNight(BigDecimal pricePerNight) {
//        this.pricePerNight = pricePerNight;
//    }
//
//    public boolean isAvailability() {
//        return availability;
//    }
//
//    public void setAvailability(boolean availability) {
//        this.availability = availability;
//    }
