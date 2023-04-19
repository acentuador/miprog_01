package model.daoImplementations;

import model.Client;
import model.OS;
import model.daoInterfaces.AttendantDAO;
import model.daoInterfaces.TechnicianDAO;

import java.util.Date;
import java.util.Scanner;

public class AttendantDAOImpl implements AttendantDAO {

    private ClientDAOImpl clientDAO;
    private TechnicianDAOImpl technicianDAO;

    public AttendantDAOImpl() {
        this.clientDAO = new ClientDAOImpl();
        this.technicianDAO = new TechnicianDAOImpl();
    }

    @Override
    public void callCClient() {
        String name, address, email, nPhone;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Client name:");
        name = scanner.next();
        scanner.nextLine();
        System.out.print("Client address:");
        address = scanner.next();
        scanner.nextLine();
        System.out.print("Client email:");
        email = scanner.next();
        scanner.nextLine();
        System.out.print("Client nPhone:");
        nPhone = scanner.next();
        scanner.nextLine();
        clientDAO.createClient(name,nPhone,email, address);
        scanner.close();




    }

    @Override
    public void callUClient(String id) {
        clientDAO.updateClient(id);
    }

    @Override
    public void callDClient(String id) {
        clientDAO.deleteClient(id);
    }

    @Override
    public void callRClient(String id) {
        clientDAO.viewClient(id);

    }

    @Override
    public void callCOS() {
        String  id, description, attendantID, clientID;
        Scanner scanner = new Scanner(System.in);
        System.out.print("OS ID:");
        id = scanner.next();
        scanner.nextLine();
        System.out.print("OS Description:");
        description = scanner.next();
        scanner.nextLine();
        System.out.print("Attendant ID:");
        attendantID = scanner.next();
        scanner.nextLine();
        System.out.print("Client Id:");
        clientID = scanner.next();
        scanner.nextLine();
        Date startTime = new Date();
        OS newOS = new OS(id, description,startTime,attendantID,clientID);
        technicianDAO.getOSList().add(newOS);
        scanner.close();
    }

    @Override
    public void callUOS(String osID) {
    }

    @Override
    public void callDOS(String osID) {

    }

    @Override
    public void callROS() {
        technicianDAO.getOSList();
    }

    @Override
    public void rPayment(String osID) {

    }
}
