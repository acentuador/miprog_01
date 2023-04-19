package model.daoImplementations;

import model.Client;
import model.daoInterfaces.ClientDAO;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClientDAOImpl implements ClientDAO {
    public ClientDAOImpl() {
        this.clientList = new ArrayList<>();
    }

    private final ArrayList<Client> clientList;
    @Override
    public void createClient(String name, String nPhone, String email, String adress) {
        String id = generateId();
        Client client = new Client(id, name, nPhone, email, adress);
        clientList.add(client);
    }


    @Override
    public void updateClient(String id) {
        Client pivot = viewClient(id);
        int eType = 0;
        while(eType != 5){
            System.out.print("Which field you want to update:");
            System.out.print("1 - Id | 2 - Email| 3 - Address | 4 - Phone | 5 - Finish");
            Scanner scanner = new Scanner(System.in);
            eType = scanner.nextInt();
            scanner.nextLine();
            switch(eType) {
                case 1:
                    System.out.print("New ID:");
                    String newId = scanner.next();
                    scanner.nextLine();
                    pivot.setId(newId);
                    break;
                case 2:
                    System.out.print("New Email:");
                    String newEmail = scanner.next();
                    scanner.nextLine();
                    pivot.setId(newEmail);
                    break;
                case 3:
                    System.out.print("New Address:");
                    String newAddress = scanner.next();
                    scanner.nextLine();
                    pivot.setId(newAddress);
                    break;
                case 4:
                    System.out.print("New Phone:");
                    String newPhone = scanner.next();
                    scanner.nextLine();
                    pivot.setId(newPhone);
                    break;
                case 5:
                    break;
            }
            scanner.close();
    }

    }

    @Override
    public void deleteClient(String id) {
        Client pivot = null;
        for(Client client: clientList){
            if(client.getId().equals(id)){
                pivot = client;
            }
        }
        if(pivot == null){
            System.out.println("Error 404: Not Found");
        }else clientList.remove(pivot);
    }

    @Override
    public Client viewClient(String id) {
        Client pivot = null;
        for(Client client: clientList){
            if(client.getId().equals(id)){
                pivot = client;
            }
        }
        return pivot;
    }

    public static String generateId() {
        String PREFIX = "C";
        DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
        LocalDateTime now = LocalDateTime.now();
        String date = DATE_FORMATTER.format(now);
        return PREFIX + date;

    }
}
