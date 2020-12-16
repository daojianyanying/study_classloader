package classloader.spi.test;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Properties;

public class Test01 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (String propertieName:properties.stringPropertyNames()) {
            System.out.println(propertieName+"-------"+properties.getProperty(propertieName));
        }
    }
}
