package top.ximimi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDriver {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication();
        app.run(SpringBootDriver.class, args);
    }

}
