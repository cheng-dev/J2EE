package session3.server.server;

import java.io.*;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author xiao
 * @date 2019/11/15 下午 7:09
 */
public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.load(new FileReader("src/session3/server/web.properties"));
        @SuppressWarnings("unchecked")
        Enumeration<String> enumeration = (Enumeration<String>) properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String content = enumeration.nextElement();
            String realControllerName = properties.getProperty(content);
            System.out.println(content + realControllerName);
        }

        System.out.println(properties.get("index"));

    }
}
