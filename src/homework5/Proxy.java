package homework5;

public class Proxy implements Subject {
    RealSubject realSub = new RealSubject();
    public void printTime(){
        System.out.println("方法method()被调用，调用时间为2020-1-1 10:10:10");
    }
    @Override
    public void method() {
        this.printTime();
        try {
            System.out.println("方法method()调用成功");
            realSub.method();
        }catch (Exception e){
            System.out.println("方法method()调用失败");
            e.printStackTrace();
        }

    }
}
