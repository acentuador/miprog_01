package model.daoImplementations;

import model.OS;
import model.daoInterfaces.TechnicianDAO;

import java.util.ArrayList;

public class TechnicianDAOImpl implements TechnicianDAO {
    private ArrayList<OS> OSList;

    public TechnicianDAOImpl() {
        this.OSList = new ArrayList<OS>();
    }

    public ArrayList<OS> getOSList() {
        return OSList;
    }

    @Override
    public void defineStatus(String id) {

    }

    public void listAllOS(){
        for(OS os: OSList){
            System.out.println(os.toString());
        }
    }
}
