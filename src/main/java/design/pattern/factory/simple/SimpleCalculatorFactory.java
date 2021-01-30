package design.pattern.factory.simple;

public class SimpleCalculatorFactory {
    /**
     * 获取计算类
     * @param symbol  + - * / 四种算法
     * @return
     */
    public static Calculator getCalculator(String symbol){
        Calculator calculator;
        switch (symbol){
            case "+":
                calculator = new AddCalculator();
                break;
            case "-":
                calculator = new SubCalculator();
                break;
            case "*":
                calculator = new MulCalculator();
                break;
            case "/":
                calculator = new DivCalculator();
                break;
            default:
                calculator = null;
        }
        return calculator;
    }
}
