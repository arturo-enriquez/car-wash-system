package config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Config {
    
    private static boolean exist = false;
    
    private static String name;
    private static Path path;

    public static void setConfig(String name, String path) throws IOException{
        Config.name = name;
        Config.path = Paths.get(path);
        Files.createDirectories(Config.path);
        
        Config.exist = true;
    }

    public static String getName() {
        return name;
    }

    public static String getPath() {
        
        return path+getTypePath();
    }

    public static boolean isExist() {
        return exist;
    }
    
    // get OS
    private static String getOS(){
        String OS;
        try {
            OS = System.getProperty("os.name");
        } catch (Exception e) {
            OS = "";
        }
        return OS;
    }
    // get type path
    public static String getTypePath() {
        if ("Linux".equals(Config.getOS())) {
            return "/";
        }
        return "\\";
    }
    
    

}
