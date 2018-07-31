package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TimeEntryRepository {

    TimeEntry create(TimeEntry any);

    TimeEntry find(Long id);

    List<TimeEntry> list();

    TimeEntry update(Long id, TimeEntry timeEntry);

    void delete(Long l);
}
