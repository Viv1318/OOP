package Family_Tree.Presenter;

import Family_Tree.model.FamalyTree;
import Family_Tree.model.People;
import Family_Tree.service.ReadingAndWritingFile;

import java.io.IOException;

import Family_Tree.View.TreeView;

public class TreePresenter {

    private FamalyTree<People> famalyTree;
    private TreeView view;
    private ReadingAndWritingFile<People> fileOperations;


    public TreePresenter(FamalyTree<People> famalyTree, TreeView view, ReadingAndWritingFile<People> fileOperations) {
        this.famalyTree = famalyTree;
        this.view = view;
        this.fileOperations = fileOperations;
        this.view.setPresenter(this);
    }
    

    public void addPerson(String name, int birthDate){

        People person = new People(name, birthDate);
        famalyTree.addMembers(person);
        view.displayMessage("Person added successfully" + name);

    }

    public void showPersons() {

        view.displayPersons(famalyTree.getMembers());

    }


    public void sortPeopleByNAME() {
        famalyTree.sortByName();
        view.displayMessage("Persons sorted by name successfully");
        showPersons();
    }

    public void sortPeopleByBirthDate() {
        famalyTree.sortByBirthDate();
        view.displayMessage("Persons sorted by birth date successfully");
        showPersons();
    }

    public void saveTree(String fileName) {
        try {
            fileOperations.saveToFile(famalyTree, fileName);
            view.displayMessage("Tree saved successfully to " + fileName);
        } catch (IOException e) {
            view.displayMessage("Error saving tree to file: " + e.getMessage());
        }
    }
    
    public void loadTree(String fileName) {
        try {
            famalyTree = fileOperations.loadFromFile(fileName);
            view.displayMessage("Tree loaded successfully from " + fileName);
        
        } catch (IOException | ClassNotFoundException e) {
            view.displayMessage("Error loading tree from file: " + e.getMessage());
        }
    }
    public void HandleUserInput() {

        while (true) {
            view.displayMessage("Enter command (add, list, sortByName, sortByBirthDate, save, load, exit): ");

            String command = view.getUserInput();

            switch (command) {
                case "add":

                view.displayMessage("Enter name");
                String name = view.getUserInput();
                
                view.displayMessage("Enter birth date");
                int birthDate = Integer.parseInt(view.getUserInput());
                    
                    break;
            
                case "list":

                showPersons();
                    break;

                case "sortByName":
                
                sortPeopleByNAME();
                break;
                
                case "sortByBirthDate":
                
                sortPeopleByBirthDate();

                break;

                case "save":

                view.displayMessage("Enter file  name");

                saveTree(view.getUserInput());
                
                break;

                case "load":

                view.displayMessage("Enter file  name");
                
                loadTree(view.getUserInput());
                
                break;
                
                case "exit":
                return;

                default:
                view.displayMessage("Invalid command. Try again.");

            }
            
        }
    }
}
