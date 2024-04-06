package ru.hotel.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.hotel.dto.DateDto;
import ru.hotel.dto.HotelDto;
import ru.hotel.dto.RoomDto;
import ru.hotel.dto.RoomNumberDto;
import ru.hotel.service.RoomService;
import ru.hotel.service.impl.RoomServiceImpl;
import ru.hotel.utils.Mocks;

import java.time.LocalDate;
import java.util.List;

@Validated
@RestController
@RequestMapping(value = "hotel/admin", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdminController {

    private final RoomService roomService;

    @Autowired
    public AdminController(RoomService roomService) {
        this.roomService = roomService;
    }
    //rooms
    @PostMapping(value = "rooms", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomNumberDto> createRoom(@RequestBody @Valid RoomDto room) {
        return ResponseEntity.ok(this.roomService.addRoom(room));
    }

    @PutMapping(value = "rooms",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RoomNumberDto> editRoom(@RequestBody RoomDto room) {
        return ResponseEntity.ok(Mocks.editRoom(room));
    }

    @DeleteMapping(value = "rooms/{number}")
    public ResponseEntity<Void> deleteRoom(@PathVariable int number) {
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "rooms")
    public ResponseEntity<List<RoomDto>> listRoom() {
        return ResponseEntity.ok(Mocks.rooms());
    }

    @PutMapping(value = "about", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HotelDto> editAbout(@RequestBody HotelDto description) {
        return ResponseEntity.ok(Mocks.about());
    }

    @DeleteMapping(value = "about")
    public ResponseEntity<HotelDto> deleteAbout() {
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "about")
    public ResponseEntity<HotelDto> getAbout() {
        return ResponseEntity.ok(Mocks.about());
    }

    @GetMapping("rooms/available")
    public ResponseEntity<List<RoomDto>> getAvailableRooms() {
        return ResponseEntity.ok(Mocks.getAvailableRooms());
    }

    @GetMapping("rooms/occupied")
    public ResponseEntity<List<RoomDto>> getOccupiedRooms() {
        return ResponseEntity.ok(Mocks.getOccupiedRooms());
    }

    @GetMapping("rooms/booked")
    public ResponseEntity<List<RoomDto>> getBooked(@RequestBody DateDto date) {
        return ResponseEntity.ok(Mocks.getOccupiedRooms());
    }


}
