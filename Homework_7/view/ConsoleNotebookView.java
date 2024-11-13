package Homework_7.view;

import java.util.List;

import Homework_7.model.Event;

public class ConsoleNotebookView implements NoteBookView {

    @Override
    public void displayEvents(List<Event> events) {
        System.out.println("Список событий:");
        for (Event event : events) {
            System.out.println(event.getTime() + " - " + event.getDescription());
        }
    }

    @Override
    public void showEventAdded(Event event) {
        System.out.println("Событие добавлено: " + event.getDescription());
    }

    @Override
    public void showEventRemoved(Event event) {
        System.out.println("Событие удалено: " + event.getDescription());
    }

    @Override
    public void showError(String message) {
        System.err.println("Ошибка: " + message);
    }
}
