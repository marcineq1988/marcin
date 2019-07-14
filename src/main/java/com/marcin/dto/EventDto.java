package com.marcin.dto;

import java.time.LocalDate;

public class EventDto {

    private final long id;
    private final String title;
    private final String comment;
    private final LocalDate eventDate;

    public EventDto(long id, String title, String comment, LocalDate eventDate) {
        this.id = id;
        this.title = title;
        this.comment = comment;
        this.eventDate = eventDate;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getComment() {
        return comment;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }
}
