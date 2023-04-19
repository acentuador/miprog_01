import model.daoImplementations.AttendantDAOImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AttendantDAOImpl attendantDAO = new AttendantDAOImpl();
        int eType = 0;
        while(eType != 7){
            System.out.print("Which field you want to update:");
            System.out.print("1 - Create Client | 2 - Delete Client| 3 - Update Client | 4 - View Client |");
            System.out.print("5 - Create OS | 6 - List All | 7 - Finish");
            Scanner scanner = new Scanner(System.in);
            eType = scanner.nextInt();
            scanner.nextLine();
            switch(eType) {
                case 1:
                    attendantDAO.callCClient();
                    break;
                case 2:
                    System.out.print("Client ID:");
                    String id = scanner.next();
                    scanner.nextLine();
                    attendantDAO.callDClient(id);
                    break;
                case 3:
                    System.out.print("Client id:");
                    String idUpdated = scanner.next();
                    scanner.nextLine();
                    attendantDAO.callUClient(idUpdated);
                    break;
                case 4:
                    System.out.print("Client ID:");
                    String idView = scanner.next();
                    scanner.nextLine();
                    attendantDAO.callRClient(idView);
                    break;
                case 5:
                    attendantDAO.callCOS();
                    break;
                case 6:
                    attendantDAO.callROS();
                    break;
                case 7:
                    break;
            }

            scanner.close();
        }
    }
}