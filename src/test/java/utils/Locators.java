package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Locators {


    public static Properties loc = new Properties();

    public void locators() throws IOException {
        String locatorsFilePath = System.getProperty("user.dir") + "/locators.properties";
        FileInputStream locatorsStream = new FileInputStream(locatorsFilePath);
        loc.load(locatorsStream);
    }
}

