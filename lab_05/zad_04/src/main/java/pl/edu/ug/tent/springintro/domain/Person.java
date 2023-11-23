package pl.edu.ug.tent.springintro.domain;

public class Person {
  private String firstName;
  private String lastName;
  private String email;
  private String companyName;
  private String id;

  public Person() {
  }

  public Person(String id, String firstName, String lastName, String email, String companyName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.companyName = companyName;
    this.id = id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "{" +
        " firstName='" + getFirstName() + "'" +
        ", lastName='" + getLastName() + "'" +
        ", email='" + getEmail() + "'" +
        ", companyName='" + getCompanyName() + "'" +
        ", id='" + getId() + "'" +
        "}";
  }

}
