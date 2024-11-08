package Family_Tree.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamalyTree<T extends PeopleElements > implements Serializable, Iterable<T> {

    private static final long serialVersionUID = 1L;

    private  List<T> members;

    public FamalyTree() {
        this.members = new ArrayList<T>();
    }

    public  void addMembers(T members) {
       this.members.add(members);
    }
    public   List<T> getChildren( T parent) {
        
        return this.members;
    }

    public List<T> getMembers() {
        return members;

    }
    @Override
    public Iterator<T> iterator() {
        return members.iterator();
    }

    public void sortByName() {
        Collections.sort(members, (p1, p2) -> p1.toString().compareTo(p2.toString()));
    }

    public void sortByBirthDate() {

        if (members.get(0) instanceof People) {
        Collections.sort(members, (p1, p2) -> Integer.compare(((People) p1).getBirthDate(),((People) p2).getBirthDate()));
        }
    }

    
    public  T findPersonsByName(String name) {

        for (T members : members) {

            if (members.getName().equals(name)) {

                return members;
            }
        }
        return null;

    }

    public  T findPersonsByBirthDate(int birthDate) {

        for (T members : members) {
            if (members.getBirthDate() == birthDate) {
                return members;
            }
        }
        return null;
    }

    public List<T> getPeople() {
        return members;
    }



}
