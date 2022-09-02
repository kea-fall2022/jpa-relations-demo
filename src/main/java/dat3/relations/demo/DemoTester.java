package dat3.relations.demo;

import dat3.relations.demo.entity.Address;
import dat3.relations.demo.entity.Person;
import dat3.relations.demo.repositories.AddressRepository;
import dat3.relations.demo.repositories.PersonRepository;
import dat3.relations.demo.services.AddressService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DemoTester implements CommandLineRunner {

  PersonRepository personRepository;
  AddressRepository addressRepository;
  AddressService addressService;

  public DemoTester(PersonRepository pr, AddressRepository ar, AddressService as) {
    this.personRepository = pr;
    this.addressRepository = ar;
    this.addressService = as;
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("I'm called when enver the program is started");

    //This is where we will add all the demo code
    personRepository.deleteAll();
    addressRepository.deleteAll();

    Person p1 = new Person("kurt","kurt@a.dk","123");
    Person p2 = new Person("hanne","hanne@a.dk","123");
    Person p3 = new Person("aaa","hdde@a.dk","123");

    Address a1 = new Address("Lyngbyvej 22","Lyngby");
    a1.addPerson(p1);
    a1.addPerson(p2);
    a1.addPerson(p3);
    p1.setAddress(a1);
    p2.setAddress(a1);
    p3.setAddress(a1);

    addressRepository.save(a1);

    System.out.println("Hit Enter to fetch an address");
    System.in.read();
    addressService.getAddressTrans(a1.getId(),true);










    System.out.println("Hit Enter to stop program");
    System.in.read();
  }

}
