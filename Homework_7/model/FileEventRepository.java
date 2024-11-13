package Homework_7.model;

import java.util.ArrayList;
import java.util.List;

public class FileEventRepository implements EventRepository {
    private List<Event> events;

    public FileEventRepository() {
        this.events = new ArrayList<>();
    }

    @Override
    public void addEvent(Event event) {
        events.add(event);
    }

    @Override
    public void removeEvent(Event event) {
        events.remove(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return new ArrayList<>(events);
    }
}
