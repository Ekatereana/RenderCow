import de.javagl.obj.Obj;
import de.javagl.obj.ObjData;
import de.javagl.obj.ObjReader;
import de.javagl.obj.ObjUtils;
import parsers.ObjectLoader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Main {
    public static void main(String[] args) {
        try {
            ObjectLoader loader = new ObjectLoader();
            loader.load("C:\\Users\\ekate\\IdeaProjects\\RenderCow\\src\\main\\resources\\cow.obj");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
