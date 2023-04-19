package model.daoInterfaces;

import model.Client;

public interface ClientDAO {

    public void createClient(String name, String nPhone, String email, String adress);
    public void updateClient(String id);
    public void deleteClient(String id);
    public Client viewClient(String id);


}
