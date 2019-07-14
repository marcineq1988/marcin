package com.marcin.repository;

import com.marcin.entity.Event;
import com.marcin.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {

   // List<Event> findByDate(LocalDateTime date);

    Event findById(long id);

    List<Event> findByEventDateBetween(LocalDate first, LocalDate second);
}
