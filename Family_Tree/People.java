package Family_Tree;

import java.time.LocalDate;

import java.util.List;

public class People {

   private String name;
   private LocalDate birthDate;
   private People mather;
   private People father;
   private List<People> children;

    public People(String name, LocalDate birthDate) {

        this.name = name;
        this.birthDate = birthDate;

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
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
