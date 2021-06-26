package ru.job4j.stream;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        Address address = (Address) o;

        if (getHome() != address.getHome()) {
            return false;
        }
        if (getApartment() != address.getApartment()) {
            return false;
        }
        if (!getCity().equals(address.getCity())) {
            return false;
        }
        return getStreet().equals(address.getStreet());
    }

    @Override
    public int hashCode() {
        int result = getCity().hashCode();
        result = 31 * result + getStreet().hashCode();
        result = 31 * result + getHome();
        result = 31 * result + getApartment();
        return result;
    }

    @Override
    public String toString() {
        return "Address{city='" + city
                + "', street='" + street
                + "', home=" + home
                + ", apartment="
                + apartment + '}';
    }
}
