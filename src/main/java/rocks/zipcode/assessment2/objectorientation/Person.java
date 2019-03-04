package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    Long id;
    String name;
    Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = Long.MIN_VALUE;
        this.name = "";
        this.address = new Address();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {

        Person toCompare = (Person) o;

        return id == toCompare.id &&
                name == toCompare.name &&
                address == toCompare.address;
        }
//
//
//    boolean personNull(Person person) {
//        return id == Long.MIN_VALUE && name == "";
//    }

    @Override
    public String toString() {
        return String.format("Person{" +
                        "id=%s, " +
                        "name='%s', " +
                        "address=%s}"
                ,getId(), getName(), getAddress().toString() );
    }
    }
