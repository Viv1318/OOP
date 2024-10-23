package Family_Tree;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FamalyTree {
    
    private List<People> people;

    public FamalyTree() {
        this.people = new ArrayList<People>();
    }

    public void addPerson(People person) {
        people.add(person);
    }
    
    public List<People> getChildren(People parent) {
        return parent.getChildren();
        
    }

    public People findPersonsByName(String name){

        for(People person: people){

            if (person.getName().equals(name)){

                return person;
            }
        }
        return null;

    }

    public People findPersonsByBirthDate (LocalDate birthDate){

        for (People person: people){
            if (person.getBirthDate().equals(birthDate)){
                return person;
            }
        }
        return null;
    }

    

}
