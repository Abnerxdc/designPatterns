package design.pattern.factory.simple;

import java.util.Scanner;

/**
 * Created by Admin on 2021/1/30.
 * 简单工厂模式测试类
 * 优点：（1）工厂类包含必要的逻辑判断，可以决定在什么时候创建哪一个产品的实例。客户端可以免除直接创建产品对象的职责
 　　　　（2）客户端无需知道所创建具体产品的类名，只需知道参数即可
 　　　　（3）也可以引入配置文件，在不修改客户端代码的情况下更换和添加新的具体产品类。（这也是我在开始的披萨店里遇到没有的披萨的解决情况）
 * 缺点：（1）工厂类集中了所有产品的创建逻辑，职责过重，一旦异常，整个系统将受影响
 　　　　（2）使用简单工厂模式会增加系统中类的个数(引入新的工厂类)，增加系统的复杂度和理解难度
 　　　　（3）系统扩展困难，一旦增加新产品不得不修改工厂逻辑，在产品类型较多时，可能造成逻辑过于复杂
 　　　　（4）简单工厂模式使用了static工厂方法，造成工厂角色无法形成基于继承的等级结构。
 * 适用环境：(1)工厂类负责创建对的对象比较少，因为不会造成工厂方法中的业务逻辑过于复杂
 　　　　    (2)客户端只知道传入工厂类的参数，对如何创建对象不关心
 * @author xudc
 */
public class SimpleCalculatorFactoryTest {
    public static void main(String[] args) {
        System.out.print("请输入数字：");
        Scanner sc=new Scanner(System.in);
        int first = Integer.parseInt(sc.next());

        System.out.print("请输入（+、-、*、/）：");
        sc=new Scanner(System.in);
        String symbol = sc.next();

        System.out.print("请输入数字：");
        sc=new Scanner(System.in);
        int second = Integer.parseInt(sc.next());

        //业务层不关注下层如何实现，只暴露一个接口类，调用即可
        Calculator calculator = SimpleCalculatorFactory.getCalculator(symbol);

        System.out.println(calculator.count(first,second));
    }
}
