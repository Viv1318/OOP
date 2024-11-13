package Homework_7.Presenter;

import java.time.LocalDateTime;
import java.util.List;
import Homework_7.model.Event;
import Homework_7.model.EventRepository;
import Homework_7.view.NoteBookView;


public class NoteBookPresenter {

     private EventRepository repository;
    private NoteBookView view;

    public NoteBookPresenter(EventRepository repository, NoteBookView view) {

        this.repository = repository;
        this.view = view;
        
    }

    public void addEvent(String description, LocalDateTime time) {
        Event event = new Event(description, time);
        repository.addEvent(event);
        view.showEventAdded(event);
    }

    public void removeEvent(Event event) {
        repository.removeEvent(event);
        view.showEventRemoved(event);
    }

    public void showAllEvents() {
        List<Event> events = repository.getAllEvents();
        view.displayEvents(events);
    }
    
}
