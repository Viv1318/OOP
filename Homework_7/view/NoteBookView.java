package Homework_7.view;

import java.util.List;

import Homework_7.model.Event;

public interface NoteBookView {
    void displayEvents(List<Event> events);
    void showEventAdded(Event event);
    void showEventRemoved(Event event);
    void showError(String message);
}
