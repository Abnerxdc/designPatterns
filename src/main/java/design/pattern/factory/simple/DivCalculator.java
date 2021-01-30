package design.pattern.factory.simple;

/**
 * Created by Admin on 2021/1/30.
 * @author xudc
 */
public class DivCalculator implements Calculator{
    @Override
    public int count(int first , int second){
        if(second == 0 ) {
            throw new IllegalArgumentException("被除数不能为0");
        }
        return first/second;
    }
}
