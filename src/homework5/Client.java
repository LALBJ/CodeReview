package homework5;

public class Client {
    public static void main(String []args){
        Subject subject;
        subject = (Subject)XMLUtil.getBean();
        subject.method();
    }
}
