package dat3.relations.demo.entity;

import javax.persistence.*;

@Entity
public class Person {
  @Id
  private String username;
  private String email;
  private String password;

  @ManyToOne(cascade = CascadeType.ALL)
  private Address address;

  public Person(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Person() {
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
