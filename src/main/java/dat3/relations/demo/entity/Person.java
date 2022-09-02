package dat3.relations.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="kunde")
public class Person {
  @Id
  @Column(name="brugernavn")
  private String username;
  @Column(nullable = false,unique = true)
  private String email;
  @Column(nullable = false,length = 80)
  private String password;

  public Person(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
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
