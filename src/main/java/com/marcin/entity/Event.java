package com.marcin.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="title")
    private String title;

    @Column(name="event_date")
    private LocalDate eventDate;

    @Column(name="content")
    private String content;

    public Event() {
    }

    public Event(int id, String title, LocalDate eventDate, String content) {

        this.id = id;
        this.title = title;
        this.eventDate = eventDate;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String comment) {
        this.content = content;
    }
}
