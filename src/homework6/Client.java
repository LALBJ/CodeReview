package homework6;

public class Client {
    public static void main(String[]args){
        Filter f1,f2,f3;
        f1 = new CodeFilter("code");
        f2 = new TypeFilter("type");
        f3 = new ValidateFilter("validate");

        f1.setSuccessor(f2);
        f2.setSuccessor(f3);

        f1.filter();
    }

}
