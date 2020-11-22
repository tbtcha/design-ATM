package bankSystem;

public class Address {
    private String stressAddress;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Address(String stressAddress, String city, String state, String zipcode, String country) {
        this.stressAddress = stressAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStressAddress() {
        return stressAddress;
    }

    public void setStressAddress(String stressAddress) {
        this.stressAddress = stressAddress;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
