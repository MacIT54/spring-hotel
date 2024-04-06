package ru.hotel.service;

import ru.hotel.dto.RoomDto;
import ru.hotel.dto.RoomNumberDto;

import java.time.LocalDate;
import java.util.List;

public interface RoomService {
//    List<RoomDto> getAvailableRooms(LocalDate startDate, LocalDate endDate);
//
//    List<RoomDto> getOccupiedRooms(LocalDate startDate, LocalDate endDate);
    RoomNumberDto addRoom(RoomDto room);

    void delete(int room_number);

    List<RoomDto> find();

    RoomDto findBooked(Boolean booked);

    RoomDto findUnBooked(Boolean booked);
}
