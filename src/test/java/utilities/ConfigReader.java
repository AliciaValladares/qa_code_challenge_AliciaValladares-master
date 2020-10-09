package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String readConfiguration(String keyName) throws IOException {
        String value = null;
        try {
            FileReader file = new FileReader("Configuration/properties");
            Properties readProperty = new Properties();
            readProperty.load(file);
            return readProperty.getProperty(keyName).trim();
        } catch (Exception exception) {
            exception.printStackTrace();
            throw (new RuntimeException("***********ERROR************ : - key with name " + keyName + " does not exists"));
        }
    }

    public static String readLocator(String keyName) {
        String value=null;
        try {
            FileReader file = new FileReader("Locators/elementLocators");
            Properties readProperty = new Properties();
            readProperty.load(file);
            return readProperty.getProperty(keyName).trim();
        }
        catch(Exception exception) {
            exception.printStackTrace();
            throw (new RuntimeException("***********ERROR************ : - key with name " + keyName + " does not exists"));
        }
    }
}

