package model.daoInterfaces;

public interface AttendantDAO {

    public void callCClient();
    public void callUClient(String id);
    public void callDClient(String id);
    public void callRClient(String id);

    public void callCOS();
    public void callUOS(String osID);
    public void callDOS(String osID);
    public void callROS();

    public void rPayment(String osID);

}
