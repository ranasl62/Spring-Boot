package bd.ac.seu.model;

import javax.persistence.Embeddable;
import java.util.Objects;
@Embeddable
public class Address {
    private String streetAddress;
    private String city;
    private String postalCode;

    public Address() {
    }

    public Address(String streetAddress, String city, String postalCOde) {
        this();
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCOde;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCOde() {
        return postalCode;
    }

    public void setPostalCOde(String postalCOde) {
        this.postalCode = postalCOde;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", postalCOde='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(streetAddress, address.streetAddress) &&
                Objects.equals(city, address.city) &&
                Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(streetAddress, city, postalCode);
    }
}




