package homework3;

public class backupFacade {
    private addBookManager abManager;
    private noteManager nManager;
    backupFacade(){
        abManager = new addBookManager();
        nManager = new noteManager();
    }
    public void backUp(){
        abManager.backUpAddressBook();
        nManager.backUpNote();
    }
}
