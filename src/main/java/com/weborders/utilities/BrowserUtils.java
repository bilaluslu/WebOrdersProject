package com.weborders.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class BrowserUtils {

    public static void takeScreenShot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
        Date date = new Date();
        String path = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + date + "_image.png";
        try (FileOutputStream fileOutputStream = new FileOutputStream(path)){
            fileOutputStream.write(screenshot);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
