package ru.hotel.exception;

public class UsernameNotFoundException extends RuntimeException {

  public UsernameNotFoundException() {
    super("api.user.delete.api-responses.404.description");
  }
}
