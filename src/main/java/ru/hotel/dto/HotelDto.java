package ru.hotel.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class HotelDto {

    @NotNull(message = "{validation.hotel.description.not-empty}")
    private String aboutHotel;

    @NotNull(message = "{validation.hotel.description.not-empty}")
    private String hotelName;

    @NotNull(message = "{validation.hotel.description.not-empty}")
    private String address;

    public HotelDto() {
    }

    public HotelDto(String aboutHotel) {
        this.aboutHotel = aboutHotel;
    }

    public HotelDto(String aboutHotel, String hotelName, String address) {
        this.aboutHotel = aboutHotel;
        this.hotelName = hotelName;
        this.address = address;
    }

    public String getAboutHotel() {
        return aboutHotel;
    }

    public void setAboutHotel(String aboutHotel) {
        this.aboutHotel = aboutHotel;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotel_name) {
        this.hotelName = hotel_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
