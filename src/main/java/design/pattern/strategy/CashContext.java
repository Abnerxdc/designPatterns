package design.pattern.strategy;

/**
 * Created by Admin on 2021/1/31.
 *
 * @author xudc
 *         收费策略类
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
