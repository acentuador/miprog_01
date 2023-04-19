package model;

public class Manager extends Person{
    private String mPassword;

    public Manager(String id, String name, String nPhone, String email, String adress, String mPassword) {
        super(id, name, nPhone, email, adress);
        this.mPassword = mPassword;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
