package Family_Tree.service;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Family_Tree.model.FamalyTree;
import Family_Tree.model.PeopleElements;

public class FileOperationsImpl<T extends PeopleElements> implements ReadingAndWritingFile<T>{

    @Override
    public void saveToFile (FamalyTree<T> famalyTree, String fielName) throws IOException  {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fielName))) {
            oos.writeObject(famalyTree);
        }
    }    
   
    
    @Override
    public FamalyTree<T> loadFromFile (String fielName) throws IOException,  ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fielName))) {
            return (FamalyTree<T>) ois.readObject();
        }
    }
}
