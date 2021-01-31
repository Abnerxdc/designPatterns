package design.pattern.strategy;

/**
 * Created by Admin on 2021/1/31.
 * 返利收费子类
 * 　　返利活动，输入返利条件和返利值，比如满300返100，moneyCoditation为300，moneyReturn为100。
 *
 * @author xudc
 */
public class CashReturn extends CashSuper {
    //返利条件
    private double moneyConditation = 0.0;

    //返利值
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyConditation, double moneyReturn) {
        this.moneyConditation = moneyConditation;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if (money >= moneyConditation) {
            result = money - Math.floor(money / moneyConditation) * moneyReturn;
        }

        return result;
    }
}
