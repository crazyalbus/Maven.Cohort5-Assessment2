package rocks.zipcode.assessment2.objectorientation;

import java.util.Arrays;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;

    public Address() {
        this.addressLine1 = "";
        this.addressLine2 = "";
        this.city = "";
        this.state = "";
        this.zipcode = "";
    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */

    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {

        Address toCompare = (Address) o;
        return (addressLine1 == toCompare.addressLine1) &&
                addressLine2 == toCompare.addressLine2 &&
                city == toCompare.city &&
                state == toCompare.state &&
                zipcode == toCompare.zipcode;
    }

    @Override
    public String toString(){
        return String.format("Address{" +
                "addressLine1='%s', " +
                "addressLine2='%s', " +
                "city='%s', " +
                "state='%s', " +
                "zipcode='%s'}"
                ,getAddressLine1(), getAddressLine2(), getCity(), getState(), getZipcode() );
    }
}
