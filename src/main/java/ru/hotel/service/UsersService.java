package ru.hotel.service;

import ru.hotel.dto.UserDto;
import ru.hotel.dto.UsernameDto;

import java.util.List;

public interface UsersService {
  List<UsernameDto> list();

  UserDto findByUsername(String username);

  UsernameDto create(UserDto user);

  void delete(String username);
}
