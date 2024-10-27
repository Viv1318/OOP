package Family_Tree;


import java.util.ArrayList;
import java.util.List;

public class FamalyTree {
    
    private static List<People> people;

    public FamalyTree() {
        this.people = new ArrayList<People>();
    }

    public static void addPerson(People person) {
        people.add(person);
    }
    
    public static List<People> getChildren(People parent) {
        return parent.getChildren();
        
    }

    public static People findPersonsByName(String name){

        for(People person: people){

            if (person.getName().equals(name)){

                return person;
            }
        }
        return null;

    }

    public static People findPersonsByBirthDate (int birthDate){

        for (People person: people){
            if (person.getBirthDate()==birthDate){
                return person;
            }
        }
        return null;
    }

    

}
