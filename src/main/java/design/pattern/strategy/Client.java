package design.pattern.strategy;

import java.util.Scanner;

/**
 * 策略模式
 * Created by Admin on 2021/1/31.
 * 2. 方法
 将这些算法封装成一个一个的类，任意的替换
 　　3. 优点
 算法可以自由切换
 避免使用多重条件判断（如果不用策略模式我们可能会使用多重条件语句，不利于维护）
 扩展性良好，增加一个策略只需实现接口即可
 　　4. 缺点
 策略类数量会增多，每个策略都是一个类，复用的可能性很小
 所有的策略类都需要对外暴露
 　　5. 使用场景
 多个类只有算法或行为上稍有不同的场景
 算法需要自由切换的场景
 需要屏蔽算法规则的场景
 * 应用实例
 * 出行方式，自行车、汽车等，每一种出行方式都是一个策略，由我来选择哪种出行方式，根据不同的出行方式要带不同的证件
 * 商场促销方式，打折、满减等
 *
 * @author xudc
 */
public class Client {
    public static void main(String[] args) {
        CashContext cashContext = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入打折方式（1: 正常收费 / 2: 满300返100 / 3 : 打8折）：");
        int in = scanner.nextInt();
        String type = "";

        switch (in) {
            case 1:
                cashContext = new CashContext(new CashNormal());
                type += "正常收费";
                break;

            case 2:
                cashContext = new CashContext(new CashReturn(300, 100));
                type += "满300返100";
                break;

            case 3:
                cashContext = new CashContext(new CashRebate(0.8));
                type += "打8折";
                break;

            default:
                System.out.println("请输入1/2/3");
                break;
        }

        double totalPrices = 0;

        System.out.print("请输入单价：");
        double price = scanner.nextDouble();
        System.out.print("请输入数量：");
        double num = scanner.nextDouble();
        totalPrices = cashContext.getResult(price * num);

        System.out.println("单价：" + price + "，数量：" + num + "，类型：" + type + "，合计：" + totalPrices);

        scanner.close();
    }
}
