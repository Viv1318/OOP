package Family_Tree.service;

import java.io.IOException;

import Family_Tree.model.FamalyTree;
import Family_Tree.model.PeopleElements;

public interface ReadingAndWritingFile<T extends PeopleElements> {
    
    void saveToFile(FamalyTree<T> famalyTree, String fileName) throws IOException;

    FamalyTree<T> loadFromFile(String fileName) throws IOException, ClassNotFoundException;

}
