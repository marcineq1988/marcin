package com.marcin.dto;

import java.util.List;

public class CurrentMonthDto {

    private final long id;
    private final String name;
    private final List<EventDto> events;

    public CurrentMonthDto(long id, String name, List<EventDto> events) {
        this.id = id;
        this.name = name;
        this.events = events;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<EventDto> getEvents() {
        return events;
    }
}
