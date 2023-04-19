package model;
import java.util.ArrayList;

public class Client extends Person {
    private ArrayList listOS;


    public Client(String id, String name, String nPhone, String email, String adress) {
        super(id, name, nPhone, email, adress);
        this.listOS = new ArrayList<>();
    }

    public ArrayList getListOs() {
        return listOS;
    }

    public void setListOs(ArrayList listOs) {
        this.listOS = listOS;
    }

}