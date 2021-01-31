package design.pattern.strategy;

/**
 * Created by Admin on 2021/1/31.
 * 现金收费抽象类
 　　策略类，为抽象类，抽象出收费的方法供子类实现。

 * @author xudc
 */
public abstract class CashSuper {

    public abstract double acceptCash(double money);

}
