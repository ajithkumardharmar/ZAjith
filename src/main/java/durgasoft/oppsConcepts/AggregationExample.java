package durgasoft.oppsConcepts;

class Address {
    private String city, state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void displayAddress() {
        System.out.println(city + ", " + state);
    }
}

class Person {
    private String name;
    private Address address; // Aggregation (Address can exist independently)

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayPerson() {
        System.out.print(name + " lives in ");
        address.displayAddress();
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Address addr = new Address("Chennai", "Tamil Nadu");
      //Address object Weekly associated with contatined(parent) object, reference  only passing
        Person person = new Person("Raj", addr);
        
        person.displayPerson();
    }
}

