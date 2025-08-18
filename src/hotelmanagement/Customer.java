package hotelmanagement;

public class Customer {
    private String name;
    private int age;
    private String email;
    private String gender;
    private String nicNumber;
    private String address;
    private String checkInDate;
    private String roomNumber;

    public String getName() {
        System.err.println(name);
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getNicNumber() {
        return nicNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNicNumber(String nicNumber) {
        this.nicNumber = nicNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}