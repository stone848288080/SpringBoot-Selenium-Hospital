package top.ximimi.util;

public class CommonUtils {

    public static String getResourcePath(){
        //return Thread.currentThread().getContextClassLoader().getResource("").getPath();

        return System.getProperty("user.dir")+"/src/main/resources/";
    }

}
