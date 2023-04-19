package model.daoInterfaces;

public interface InvoiceDAO {
    public void createInvoice();
    public void updateInvoice(String idInvoice);
    public void deleteInvoice(String idInvoice);
    public void viewInvoice(String idInvoice);

}
