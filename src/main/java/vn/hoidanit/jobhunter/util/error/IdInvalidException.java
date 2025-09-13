package vn.hoidanit.jobhunter.util.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class IdInvalidException extends RuntimeException {

    public IdInvalidException(String message) {
        super(message);
    }
}
