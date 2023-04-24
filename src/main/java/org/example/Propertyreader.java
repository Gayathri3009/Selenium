package org.example;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertyreader {

    public static Properties Reader() throws IOException {
        FileReader Reader = new FileReader("src/test/java/Config/config.properties");
        Properties p = new Properties();
        p.load(Reader);
        return p;
    }
}
