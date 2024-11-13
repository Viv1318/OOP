package Homework_7.model;

import java.util.List;

public interface EventRepository {
     void addEvent(Event event);
    void removeEvent(Event event);
    List<Event> getAllEvents();
}
