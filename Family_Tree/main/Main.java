package Family_Tree.main;

import java.io.IOException;
import java.util.List;

import Family_Tree.model.FamalyTree;
import Family_Tree.model.People;
import Family_Tree.service.FileOperationsImpl;
import Family_Tree.service.ReadingAndWritingFile;

public class Main {

    public static void main(String[] args) {

        FamalyTree<People> famalyTree = new FamalyTree<>();

        People Voronin_N_A = new People("Воронин Н.А.", 1960);
        People Voronina_L_D = new People("Воронина Л.Д.", 1965);
        People Voronin_O_N = new People("Воронин О Н", 1983);
        People Voronina_Y_N = new People("Воронина Ю.H.", 1988);

        Voronin_O_N.setMather(Voronina_L_D);
        Voronin_O_N.setFather(Voronin_N_A);
        Voronin_N_A.addChildren(Voronin_O_N);
        Voronina_L_D.addChildren(Voronin_O_N);
        Voronina_Y_N.setFather(Voronina_L_D);
        Voronina_L_D.addChildren(Voronina_Y_N);
        Voronina_Y_N.setFather(Voronin_N_A);
        Voronin_N_A.addChildren(Voronina_Y_N);

        famalyTree.addMembers(Voronin_N_A);
        famalyTree.addMembers(Voronina_L_D);
        famalyTree.addMembers(Voronin_O_N);
        famalyTree.addMembers(Voronina_Y_N);

        System.out.println("Сортировка по имени:");
        famalyTree.sortByName();
        for (People person : famalyTree) {
            System.out.println("Person: " + person.getName() + ", born in " + person.getBirthDate());
        }

        System.out.println("\nСортировка по дате рождения:");
        famalyTree.sortByBirthDate();
        for (People person : famalyTree) {
            System.out.println("Person: " + person.getName() + ", born in " + person.getBirthDate());
        }

        // List<People> Voronin_N_AChild = FamalyTree.getChildren(Voronin_N_A);

        ReadingAndWritingFile<People> fileOps = new FileOperationsImpl<>();

        try {

            fileOps.saveToFile(famalyTree, "famalyTree.txt");
            System.out.println("Family Tree saved to file ");

        } catch (IOException e) {
            e.printStackTrace();
        }

        FamalyTree<People> loadedFamilyTree = null;

        try {

            loadedFamilyTree = fileOps.loadFromFile("famalyTree.txt");
            System.out.println("Family Tree loaded from file ");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (loadedFamilyTree != null) {
            for (People person : loadedFamilyTree) {
                System.out.println("Loaded person:" + person.getName() + ", born in " + person.getBirthDate());
            }
        }
        // for (People child : Voronin_N_AChild) {
        //     System.out.println("Дети Воронина Н А: " + child.getName());
        // }
        // System.out.println("Поиск человека по имени: " + findPersonsByName("Воронин Н.А.").getName());
        // System.out.println("Поиск человека по дате рождения: " + FamalyTree.findPersonsByBirthDate(1983).getName());

       

    }

}
