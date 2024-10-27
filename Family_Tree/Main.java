package Family_Tree;

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

        for ( People child: Voronin_N_AChild){
            System.out.println("Дети Воронина Н А: " + child.getName());
        }
        System.out.println("Поиск человека по имени: " + FamalyTree.findPersonsByName("Воронин Н.А.").getName());
        System.out.println("Поиск человека по дате рождения: " + FamalyTree.findPersonsByBirthDate(1983).getName());



    }

}
