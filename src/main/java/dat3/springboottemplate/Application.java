package dat3.springboottemplate;

import dat3.springboottemplate.ConsoleIO.ConsoleApiInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        ConsoleApiInfo.print();
    }

}
