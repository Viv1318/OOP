package Family_Tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamalyTree implements Serializable, Iterable <People> {

    private static final long serialVersionUID = 1L;
    
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

    public List<People> getPeoples() {
        return people;
    }
    
    @Override
    public Iterator<People> iterator() {
        return people.iterator();
    }

    public void sortByName(){
        Collections.sort(people, (p1, p2) -> p1.getName().compareTo(p2.getName()));
    }
    public void sortByBirthDate(){

        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getBirthDate(), p2.getBirthDate()));
    }

       

}
