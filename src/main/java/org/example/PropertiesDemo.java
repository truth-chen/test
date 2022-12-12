package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        ClassLoader classLoader = PropertiesDemo.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("demo.properties");
        properties.load(resourceAsStream);
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class aClass = Class.forName(className);
        Object o = aClass.newInstance();
        System.out.println(aClass.getMethod(methodName).invoke(o));


    }
}
