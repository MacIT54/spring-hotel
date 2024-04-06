package ru.hotel.dto;

import java.time.LocalDate;
import java.util.UUID;

public class BookingDto {
    private UUID bookingId;
    private UUID roomId;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String confirmationNumber;

    // Конструкторы, геттеры и сеттеры

    public BookingDto(UUID bookingId, UUID roomId, String guestName, LocalDate checkInDate, LocalDate checkOutDate, String confirmationNumber) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.confirmationNumber = confirmationNumber;
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    public UUID getRoomId() {
        return roomId;
    }

    public void setRoomId(UUID roomId) {
        this.roomId = roomId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}
