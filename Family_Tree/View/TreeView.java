package Family_Tree.View;

import Family_Tree.Presenter.TreePresenter;
import Family_Tree.model.People;

import java.util.List;

public interface TreeView {

    void displayMessage(String message);
    void displayPersons(List<People> persons);
    String getUserInput();
    void setPresenter(TreePresenter presenter);
    
}
