package com.codestates;

import org.apache.tomcat.jni.Local;

import java.time.LocalDateTime;

public class CommonResponseDto {
    private LocalDateTime compltedAt;
    public CommonResponseDto() {
        this.compltedAt = LocalDateTime.now();
    }
}
