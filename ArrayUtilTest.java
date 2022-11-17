package my静态变量;

/*
       定义数组工具类：
       需求： 在实际开发中，经常会遇到一些数组使用的工具类。
             请按如下要求编写一个数组的工具类： ArrayUtil

            1.提供一个工具类方法printArr,用于返回整数数组的内容
              返回的字符串格式如； [10,20,50,34,100]（只考虑整数数组，且只考虑一维数组）
            2.提供这样一个工具方法getAerage,用于返回平均分（只考虑浮点型数组，且只考虑一维数组）
            3.定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        //测试工具类中的两个方法是否正确；

        int []arr = {10,20,50,34,100};
        double []brr = {10,20,50,34,100};

        String j = ArrayUtil.printArr(arr);
        System.out.println(j);


        double number = ArrayUtil.getAverage(brr);
        System.out.println(number);

    }
}
