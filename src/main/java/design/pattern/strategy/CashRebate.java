package design.pattern.strategy;

/**
 * Created by Admin on 2021/1/31.
 * 打折收费子类
 　　打折活动，根据折扣返回打折后的价格。
 * @author xudc
 */
public class CashRebate extends CashSuper {

    //折扣
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
