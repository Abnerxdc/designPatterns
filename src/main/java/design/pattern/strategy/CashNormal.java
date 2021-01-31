package design.pattern.strategy;

/**
 * Created by Admin on 2021/1/31.
 *  正常收费子类
 　　没有任何活动的情况，正常收费，返回原价。
 * @author xudc
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
