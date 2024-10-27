package Family_Tree;

import java.io.IOException;

public interface ReadingAndWritingFile {
    
    void saveToFile(FamalyTree famalyTree, String fileName) throws IOException;

    FamalyTree loadFromFile(String fileName) throws IOException, ClassNotFoundException;

}
