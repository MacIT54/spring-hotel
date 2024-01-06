package ru.hotel.exception;

public class DefaultException extends RuntimeException{
  public DefaultException() {
    super("api.server.error");
  }
}
