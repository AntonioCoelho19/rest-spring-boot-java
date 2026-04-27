package io.github.AntonioCoelho19.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}

