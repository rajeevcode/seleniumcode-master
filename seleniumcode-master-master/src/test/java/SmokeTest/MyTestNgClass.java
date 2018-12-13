package SmokeTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MyTestNgClass {

    @Test
    public void setup1(){
        System.out.println ( "Welcome to testng project1");
    }

    @Test
    public void setup2(){
        System.out.println ("Welcome to testng project2");
    }

    @Test
    public void setup3(){
        System.out.println ("Welcome to testng project3");
    }

    @Test
    public void setup4(){
        System.out.println ("Welcome to testng project4");
    }

    @Test
    public void setup5(){
        System.out.println ("Welcome to testng project5");
    }

}
