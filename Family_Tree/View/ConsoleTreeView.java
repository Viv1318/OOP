package Family_Tree.View;

import Family_Tree.model.People;
import Family_Tree.Presenter.TreePresenter;

import java.util.List;
import java.util.Scanner;

public class ConsoleTreeView implements TreeView{

    private TreePresenter presenter;
    private Scanner scanner;

    public ConsoleTreeView() {
        this.scanner = new Scanner (System.in);
    }
    
    @Override
    public void displayMessage(String message) {
    
        System.out.println(message);
    }

    @Override
    public void displayPersons(List<People> people) {
        for (People person : people) {
            System.out.println(person.getName() + " born in " + person.getBirthDate());
        }

    }

    @Override
    public String getUserInput() {
        return scanner.nextLine();
    }

    @Override
    public void setPresenter(TreePresenter presenter) {
        this.presenter = presenter;
    }

}

