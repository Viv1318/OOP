package Family_Tree;

import java.io.IOException;
import java.util.List;

public class Main {
    
    public static void main (String[] args ){

        FamalyTree famalyTree = new FamalyTree ();

        People Voronin_N_A = new People ("Воронин Н.А.", 1960);
        People Voronina_L_D = new People ("Воронина Л.Д.", 1965);
        People Voronin_O_N  = new People("Воронин О Н", 1983);

        Voronin_O_N.setMather(Voronina_L_D);
        Voronin_O_N.setFather(Voronin_N_A);
        Voronin_N_A.addChildren(Voronin_O_N);
        Voronina_L_D.addChildren(Voronin_O_N);
        

        FamalyTree.addPerson(Voronin_N_A);
        FamalyTree.addPerson(Voronina_L_D);
        FamalyTree.addPerson(Voronin_O_N);

        List<People> Voronin_N_AChild = FamalyTree.getChildren(Voronin_N_A);

        ReadingAndWritingFile fileOps = new FileOperationsImpl();

        try{

            fileOps.saveToFile(famalyTree, "famalyTree.txt");
            System.out.println("Family Tree saved to file " );

        } catch (IOException e) {
            e.printStackTrace();
        }

        FamalyTree loadedFamilyTree = null;

        try {

            loadedFamilyTree = fileOps.loadFromFile("famalyTree.txt");
            System.out.println("Family Tree loaded from file ");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        if (loadedFamilyTree != null){
            for (People person: loadedFamilyTree.getPeoples()){
                System.out.println( "Loaded person:" + person.getName() + ", born in " + person.getBirthDate());
            }
        }
        for ( People child: Voronin_N_AChild){
            System.out.println("Дети Воронина Н А: " + child.getName());
        }
        System.out.println("Поиск человека по имени: " + FamalyTree.findPersonsByName("Воронин Н.А.").getName());
        System.out.println("Поиск человека по дате рождения: " + FamalyTree.findPersonsByBirthDate(1983).getName());



    }

}
