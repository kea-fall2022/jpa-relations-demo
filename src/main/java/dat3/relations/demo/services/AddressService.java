package dat3.relations.demo.services;

import dat3.relations.demo.entity.Address;
import dat3.relations.demo.repositories.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {
  AddressRepository addressRepository;

  public AddressService(AddressRepository addressRepository) {
    this.addressRepository = addressRepository;
  }

  @Transactional
  public void getAddressTrans(int id, boolean includeAll){
    Address address = addressRepository.findById(id).get();
    System.out.println(address.getStreet()+ " : " + address.getCity());

    if(includeAll) {
      System.out.println("Persons on address: " + address.getPersons());
    }
  }
}

