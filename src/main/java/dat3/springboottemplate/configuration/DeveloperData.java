package dat3.springboottemplate.configuration;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DeveloperData implements ApplicationRunner {

    //Repo repo;

    public DeveloperData(/*Repo repo*/) {
        //this.repo = repo;
    }

    private void dummyData() {
        setUpEntityDummyData();

    }

    void setUpEntityDummyData() {
        //NameHereEntity entity = new NameHereEntity();
        //repo.save(entity);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        dummyData();
    }
}
