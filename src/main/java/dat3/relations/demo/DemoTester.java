package dat3.relations.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DemoTester implements CommandLineRunner {

  @Override
  public void run(String... args) throws Exception {
    System.out.println("I'm called when enver the program is started");

    //This is where we will add all the demo code

    System.out.println("Hit Enter to stop program");
    System.in.read();
  }

}
