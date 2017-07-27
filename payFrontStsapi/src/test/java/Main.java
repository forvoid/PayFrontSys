import org.apache.ibatis.io.Resources;

import java.io.*;
import java.net.URL;

/**
 * Created by forvoid on 7/25/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Main.class.getSimpleName());
        System.out.println(Main.class.getResource(""));
        URL path  = Main.class.getResource("");
        System.out.println(path.getPath().substring(1));
        InputStream inputStream =  Main.class.getClass().getResourceAsStream(path.getPath().substring(1)+"mybatis.xml");
        System.out.println(inputStream);
        InputStreamReader reader = new InputStreamReader(inputStream);
        int in = 0;
        char[] bb = new char[1024];
        try {
            while( (in= reader.read(bb))!=-1)
            System.out.println(new String(bb));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
