package entity;

public class Person {

    private String personName;
    private String personSurname;
    private String phoneNumber;
    private String cardNumber;
    public Person(String personName, String personSurname, String phoneNumber, String cardNumber) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
    }



    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
