package homework4;

public class Client {
    public static void main(String[]args){
        AbstractFacade abstractFacade;
        abstractFacade = (AbstractFacade)XMLUtil.getBean();
        abstractFacade.execute();
    }
}
