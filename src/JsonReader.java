import com.sun.tools.javac.util.Log;
import java.io.*;

public class JsonReader {
    public static String getJson(String path) {
        String jsonStr = "";
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            Reader reader = new InputStreamReader(new FileInputStream(file),"Utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            return jsonStr;
        } catch (Exception e) {
            return null;
        }

    }
    public  static void main(String[] args){
        String jsonStr = getJson("/Users/xm20190901/Downloads/MprphSearch/1.json");

    }
}
