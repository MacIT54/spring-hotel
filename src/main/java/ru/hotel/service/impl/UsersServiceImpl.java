package ru.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hotel.dto.UserDto;
import ru.hotel.dto.UsernameDto;
import ru.hotel.exception.UsernameNotFoundException;
import ru.hotel.repository.UsersRepository;
import ru.hotel.repository.entity.Users;
import ru.hotel.service.UsersService;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
  private final UsersRepository usersRepository;

  @Autowired
  public UsersServiceImpl(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public List<UsernameDto> list() {
    return this.usersRepository.findAll().stream().map(users -> new UsernameDto(users.getUsername())).toList();
  }

  @Override
  public UserDto findByUsername(String username) {
    return this.usersRepository.findById(username)
        .map(user -> new UserDto(user.getUsername(), user.getPassword(), user.getRoles()))
        .orElseThrow(UsernameNotFoundException::new);
  }

  @Override
  public UsernameDto create(UserDto user) {
    Users users = new Users(user.username(), user.password(), user.roles());
    return new UsernameDto(this.usersRepository.save(users).getUsername());
  }

  @Override
  public void delete(String username) {
    Users users = this.usersRepository.findById(username).orElseThrow(UsernameNotFoundException::new);
    this.usersRepository.delete(users);
  }
}
