package com.telenav.wzone.common;

import java.io.IOException;
import java.util.Properties;

public class Configuration {

    private static Properties properties;

    public static Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
        } else {
            return properties;
        }
        try {
            properties.load(Configuration.class.getResourceAsStream("/setting.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
    
    public static String getProperty(String key) {
        return getProperty(key, null);
    }
    
    public static String getProperty(String key, String env) {
        Properties properties = getProperties();
        if (env != null) {
            String value = properties.getProperty(key + "." + env);
            if (value != null) {
                return value;
            }
        }
        return properties.getProperty(key);
    }
}
