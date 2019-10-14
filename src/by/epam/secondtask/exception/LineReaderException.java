package by.epam.secondtask.exception;

import java.io.IOException;

public class LineReaderException extends IOException {
    public LineReaderException() {
    }

    public LineReaderException(String message) {
        super(message);
    }

    public LineReaderException(String message, Throwable cause) {
        super(message, cause);
    }
}
