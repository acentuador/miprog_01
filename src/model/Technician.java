package model;

public class Technician extends Person {
    private String tPassword;

    public Technician(String id, String name, String nPhone, String email, String adress, String tPassword) {
        super(id, name, nPhone, email, adress);
        this.tPassword = tPassword;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }
}
