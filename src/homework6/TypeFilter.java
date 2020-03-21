package homework6;

public class TypeFilter extends Filter {
    public TypeFilter(String name) {
        super(name);
    }
    @Override
    public void filter() {
        System.out.println("进行数据类型转换");
        filter.filter();
    }
}
