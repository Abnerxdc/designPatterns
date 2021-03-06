package design.pattern.factory;

import java.util.Scanner;

public class CalculatorTest {
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
        int result =0 ;
        switch (symbol){
            case "+":
                result = first+second;
                break;
            case "-":
                result = first-second;
                break;
            case "*":
                result = first*second;
                break;
            case "/":
                if(second == 0 ) {
                    throw new IllegalArgumentException("被除数不能为0");
                }
                result = first/second;
                break;
                default:
                    System.out.println(" 未知结果 ！");
        }
        System.out.println("结果是： "+result);
    }
}
