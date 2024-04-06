create keyspace hotel with replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

USE hotel;

CREATE TABLE users
(
    username TEXT primary key,
    password TEXT,
    roles    SET<TEXT>
);

CREATE TABLE rooms
(
    room_number INT primary key,
    room_description TEXT,
    room_type TEXT,
    price_per_night DECIMAL,
    availability TEXT
);

CREATE TABLE Bookings
(
    booking_id int PRIMARY KEY,
    room_number int,
    guest_name TEXT,
    check_in_date DATE,
    check_out_date DATE,
    confirmation_number TEXT,
    PRIMARY KEY (booking_id, room_number)
);

CREATE TABLE HotelPhotos
(
    photo_id int PRIMARY KEY,
    file_path TEXT,
    description TEXT,
    PRIMARY KEY (photo_id)
);

CREATE TABLE RoomPhotos
(
    photo_id int PRIMARY KEY,
    room_id int,
    file_path TEXT,
    description TEXT,
    PRIMARY KEY (photo_id, room_id)
);