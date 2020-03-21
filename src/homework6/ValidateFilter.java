package homework6;

public class ValidateFilter extends Filter {

    public ValidateFilter(String name) {
        super(name);
    }

    @Override
    public void filter() {
        System.out.println("数据检验");
    }
}
