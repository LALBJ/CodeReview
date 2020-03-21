package homework9;

public class Client {
    public  static void main(String args[]){
        EditBlock editBlock = new EditBlock();
        Observer ob1,ob2,ob3;
        ob1 = new sumCountOb();
        editBlock.addOb(ob1);
        ob2 = new wordOb();
        editBlock.addOb(ob2);
        ob3 = new wordCountOb();
        editBlock.addOb(ob3);
        editBlock.edit("hello hello hello hello hello");
    }
}
