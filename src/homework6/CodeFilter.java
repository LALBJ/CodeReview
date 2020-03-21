package homework6;

public class CodeFilter extends Filter {
    CodeFilter(String name){
        super(name);
    }
    @Override
    public void filter() {
        System.out.println("进行字符编码转换");
        filter.filter();
    }
}
