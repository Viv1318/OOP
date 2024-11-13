package Homework_7.main;

import java.time.LocalDateTime;

import Homework_7.Presenter.NoteBookPresenter;
import Homework_7.model.FileEventRepository;
import Homework_7.view.ConsoleNotebookView;



public class Main {
     public static void main(String[] args) {


        FileEventRepository repository = new FileEventRepository();
        ConsoleNotebookView view = new ConsoleNotebookView();
        NoteBookPresenter presenter = new NoteBookPresenter(repository, view);

        presenter.addEvent("Посещение врача", LocalDateTime.now().plusDays(1));
        presenter.showAllEvents();
    }
}
