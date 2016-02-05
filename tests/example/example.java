//package example;
//
//import common.CommonApp;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.sql.*;
//
//
///**
// * Created by user on 02.11.2015.
// */
//
//
//
//public class example extends CommonApp {
//
//    @BeforeMethod
//    public void beforeMethod() {
//
//        Driver currentDriver = null;
//
////        WebDriver driver = new FirefoxDriver();
//
//    }
//        public void testtest() {
//            WebDriver driver = new FirefoxDriver();
//            driver.get("http://www.google.com");
//            WebElement element = driver.findElement(By.name("q"));
//            element.sendKeys("Cheese!");
//            element.submit();
//            System.out.println("Page title is: " + driver.getTitle());
////            (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
////                public Boolean apply(WebDriver d) {
////                    return d.getTitle().toLowerCase().startsWith("cheese!");
////                }
////            });
//            System.out.println("Page title is: " + driver.getTitle());
//            driver.quit();
//        }
//
////        @Test (description = "sdfsdfsdfsdf")
////        public void test() {
////            open("http://the-internet.herokuapp.com/");
//////
//////            int counter = 0;
//////            for(int i=0;i<20;i++,i++) {
//////                i++;
//////                counter ++;
//////            }
//////            System.out.print(counter);
////        }
//
//    @Test
//    public void checkDB() {
//        Connection connection = null;
//        String dbUrl = "jdbc:postgresql://127.0.0.1:5432/test";
//        String userName ="postgres";
//        String userPassword = "testPass";
//        try {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection(dbUrl, userName, userPassword);
//            Statement statement = null;
//            statement = connection.createStatement();
//            ResultSet result1 = statement.executeQuery("SELECT * FROM products");
//            while (result1.next()) {
//                System.out.println("Number: " + result1.getRow() + "; "+ result1.getString("name"));
//            }
//            System.out.print("");
//
//        }  catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Test
//    public void testGetFromDB() {
//        ResultSet sd = database.getRequest("SELECT * FROM products");
//        try {
//            while (sd.next()) {
//                System.out.print("");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
