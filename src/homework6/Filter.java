package homework6;

public abstract class Filter {
    protected String name;
    protected String data;
    protected Filter filter;
    public Filter(String name){
        this.name = name;
    }
    public void setSuccessor(Filter filter){
        this.filter = filter;
    }
    public abstract void filter();
}
