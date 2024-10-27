package Family_Tree;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileOperationsImpl implements ReadingAndWritingFile{

    @Override
    public void saveToFile (FamalyTree famalyTree, String fielName) throws IOException  {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fielName))) {
            oos.writeObject(famalyTree);
        }
    }    
   
    
    @Override
    public FamalyTree loadFromFile (String fielName) throws IOException,  ClassNotFoundException {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fielName))) {
            return (FamalyTree) ois.readObject();
        }
    }
}
