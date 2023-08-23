package com.codestates;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class ResTimestamp extends ResponseEntity {

    LocalTime timestamp;
    HttpHeaders headers = new HttpHeaders();
    public ResTimestamp(HttpStatus status) {

        super(null, headers, status);
    }

    public ResTimestamp(Object body, HttpStatus status) {
        super(body, status);
    }

    public ResTimestamp(MultiValueMap headers, HttpStatus status) {
        headers.put("resTime", String.valueOf(LocalTime.now()));
        super(headers, status);
    }

    public ResTimestamp(Object body, MultiValueMap headers, HttpStatus status) {
        super(body, headers, status);
    }

    public ResTimestamp(Object body, MultiValueMap headers, int rawStatus) {
        super(body, headers, rawStatus);
    }

}
