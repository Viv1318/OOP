package Family_Tree;

import java.util.ArrayList;
import java.util.List;

// класс описывающий человека

public class People {

   private String name;
   private int birthDate;
   private People mather;
   private People father;
   private List<People> children;

    public People(String name, int birthDate) {

        this.name = name;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setMather(People mather) {
        this.mather = mather;
    }

    public void setFather(People father) {
        this.father = father;
    }

    public void addChildren(People child) {
       this.children.add(child);
    }
    
    public List<People> getChildren() {
        return children;
    }

    public People getMather() {
        return mather;
    }

    public People getFather() {
        return father;
    }

}
