package ru.hotel.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.hotel.repository.entity.Rooms;

import java.util.UUID;

@Repository
public interface RoomRepository extends CassandraRepository<Rooms, Integer> {

}
