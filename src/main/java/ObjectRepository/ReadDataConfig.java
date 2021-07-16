package ObjectRepository;


import com.bridgelabz.selenium.problem.statements.base.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataConfig extends BaseClass{

    public  static String property = "";

    public static String CONFIG_PATH = "F:\\Selenium\\ProblemStatements\\src\\main\\resources\\config.properties";

    public static String getProperty(String CONFIG_PATH , String key){

        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream (CONFIG_PATH));
            property = pro.getProperty(key);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return property;
    }
}

