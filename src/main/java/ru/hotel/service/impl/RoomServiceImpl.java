package ru.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hotel.dto.RoomDto;
import ru.hotel.dto.RoomNumberDto;
import ru.hotel.dto.UsernameDto;
import ru.hotel.repository.RoomRepository;
import ru.hotel.repository.entity.Rooms;
import ru.hotel.repository.entity.Users;
import ru.hotel.service.RoomService;

import java.time.LocalDate;
import java.util.List;

@Service("cassandraRoomServiceImpl")
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public RoomNumberDto addRoom(RoomDto room) {
        Rooms rooms = new Rooms(room.getDescription(), room.getNumber(), room.getType(), room.getPrice(), room.getBooked());
        return new RoomNumberDto(this.roomRepository.save(rooms).getRoom_number());
    }

    @Override
    public void delete(int room_number) {

    }

    @Override
    public List<RoomDto> find() {
        return null;
    }

    @Override
    public RoomDto findBooked(Boolean booked) {
        return null;
    }

    @Override
    public RoomDto findUnBooked(Boolean booked) {
        return null;
    }


    // Логика для получения свободных номеров на заданные даты
//    public List<RoomDto> getAvailableRooms(LocalDate startDate, LocalDate endDate) {
//        return
//    }
//
//    // Логика для получения занятых номеров на заданные даты
//    public List<RoomDto> getOccupiedRooms(LocalDate startDate, LocalDate endDate) {
//        return
//    }
}
