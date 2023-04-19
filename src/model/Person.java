package model;

public class Person {
    private String id;
    private String name;
    private String nPhone;
    private String email;
    private String adress;

    public Person(String id, String name, String nPhone, String email, String adress) {
        this.id = id;
        this.name = name;
        this.nPhone = nPhone;
        this.email = email;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getnPhone() {
        return nPhone;
    }

    public void setnPhone(String nPhone) {
        this.nPhone = nPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
