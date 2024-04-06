package ru.hotel.utils;

import org.springframework.http.ReactiveHttpOutputMessage;
import ru.hotel.dto.HotelDto;
import ru.hotel.dto.RoomDto;
import ru.hotel.dto.RoomNumberDto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;

public class Mocks {
    private Mocks() {

    }

    public static RoomNumberDto roomNumberDto(RoomDto room) {
        return new RoomNumberDto(room.getNumber());
    }

    public static RoomNumberDto editRoom(RoomDto room) {
        return new RoomNumberDto(room.getNumber());
    }

    public static List<RoomDto> rooms() {
        return Arrays.asList(
                new RoomDto(101, "Standart", "Standart room with balcony", "Yes"),
                new RoomDto(102, "Standart", "Standart room with balcony", "Yes")
        );
    }

    public static HotelDto about() {
        return new HotelDto("");
    }

    public static HotelDto addAbout(HotelDto desc) {
        return new HotelDto(desc.getAboutHotel());
    }

    public static List<RoomDto> getAvailableRooms() {
        RoomDto room105 = new RoomDto(105, "Yes");
        RoomDto room110 = new RoomDto(110, "Yes");
        //Period dateRange = Period.between(start, end);
        return Arrays.asList(
                room105, room110
        );
    }

    public static List<RoomDto> getOccupiedRooms() {
        return Arrays.asList(
                new RoomDto(107, "Yes"),
                new RoomDto(111, "Yes")
        );
    }

//    public static List<RoomDto> getBooked(int year, int day, int month) {
//        LocalDate dateBooked = LocalDate.of(year, day, month);
////        RoomDto room105 = new RoomDto(105, true, LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));
//        RoomDto room110 = new RoomDto(210, false);
////        Period dateRange105 = Period.between(room105.getStartOfBooking(), room105.getEndOfBooking());
////        Period dateRange110 = Period.between(room110.getStartOfBooking(), room110.getEndOfBooking());
//        //if (date.isAfter(room110.getStartOfBooking()) && date.isBefore(room110.getStartOfBooking())) {
//            return Arrays.asList(
//                    room110
//            );
//        //}
//
//    }

    public static List<RoomDto> getAvailableRoomsForUser() {
        RoomDto room105 = new RoomDto(105, "Yes");
        RoomDto room110 = new RoomDto(110, "Yes");
        //Period dateRange = Period.between(start, end);
        return Arrays.asList(
                room105, room110
        );
    }

    public static RoomDto getStandart() {
        return new RoomDto("Standart", "BIMBIMBAMBAM room for beggars");
    }

    public static RoomDto getDeluxe() {
        return new RoomDto("Deluxe", "BIMBIMBAMBAM room for no beggars");
    }

    public static RoomDto getFamily() {
        return new RoomDto("Family", "BIMBIMBAMBAM room for PYTHON BLYAD");
    }

}
