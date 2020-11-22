package bankSystem;

public class ATM {
    private int atmId;
    private Address location;

    public ATM(int atmId, Address location) {
        this.atmId = atmId;
        this.location = location;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public Address getLocation() {
        return location;
    }

    public void setLocation(Address location) {
        this.location = location;
    }
}
