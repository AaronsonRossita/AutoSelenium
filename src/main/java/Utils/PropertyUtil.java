package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {
    Properties properties = new Properties();

    public PropertyUtil(String path) {
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getProperty(final String key) {
        String property = properties.getProperty(key);
        return property;
    }
}











