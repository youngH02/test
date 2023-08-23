package com.codestates.coffee;

import lombok.Getter;

import java.time.LocalDateTime;

public class CoffeeResponseDto {
    @Getter
    private String name;
    @Getter
    private String contnt;

    public void setName(String name) {
        this.name = name;
    }

    public void setContnt(String contnt) {
        this.contnt = contnt;
    }

    private LocalDateTime completedAt;
    public CoffeeResponseDto(){
        this.completedAt = LocalDateTime.now();
    }
}
