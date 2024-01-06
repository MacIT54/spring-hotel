package ru.hotel.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ru.hotel.repository.entity.Users;

@Repository
public interface UsersRepository extends CassandraRepository<Users, String> {
}
