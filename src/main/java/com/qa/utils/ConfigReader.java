package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader
{
    private Properties prop;

    public Properties setconfig() throws FileNotFoundException {
        prop= new Properties();
        FileInputStream fs= new FileInputStream("/Users/macbookpro/Desktop/Selemium_BDD_final/src/test/resources/Config/config.properties");
        try {
            prop.load(fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
}
