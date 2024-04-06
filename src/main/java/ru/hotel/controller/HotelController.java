package ru.hotel.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hotel.dto.HotelDto;
import ru.hotel.dto.RoomDto;
import ru.hotel.dto.RoomNumberDto;
import ru.hotel.utils.Mocks;

import java.util.List;

@Validated
@RestController
@RequestMapping(value = "hotel", produces = MediaType.APPLICATION_JSON_VALUE)
public class HotelController {

    @GetMapping("rooms/available")
    public ResponseEntity<List<RoomDto>> getAvailableRoomsForUser() {
        return ResponseEntity.ok(Mocks.getAvailableRoomsForUser());
    }

    @GetMapping("rooms/standart")
    public ResponseEntity<RoomDto> getStandart() {
        return ResponseEntity.ok(Mocks.getStandart());
    }

    @GetMapping("rooms/family")
    public ResponseEntity<RoomDto> getFamily() {
        return ResponseEntity.ok(Mocks.getFamily());
    }

    @GetMapping("rooms/deluxe")
    public ResponseEntity<RoomDto> getDeluxe() {
        return ResponseEntity.ok(Mocks.getDeluxe());
    }




}
