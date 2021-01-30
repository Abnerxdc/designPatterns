package design.pattern.factory.simple;

/**
 * Created by Admin on 2021/1/30.
 * @author xudc
 */
public class SubCalculator implements Calculator{
    @Override
    public int count(int first , int second){
        return first-second;
    }
}
