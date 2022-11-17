package my静态变量;

import java.util.ArrayList;

//定义一个工具类，用于获取集合中最大学生的年龄；
public class StudentUtil {
    private StudentUtil(){

    }
    //静态方法
    public static int getMaxAgeStudent(ArrayList<Student> list){
        //1.定义一个参照物
        int max = list.get(0).getAge();

        //2.循环遍历集合
        for (int i = 0; i < list.size(); i++) {
            // i 索引  list。get() 元素/学生对象  我们还需要getAge获取到年龄之后在进行比较
            int age = list.get(i).getAge();//避免了方法的反复调用，提高了代码的运行效率
            if(age > max){
                max = age;
            }
        }
        //3.返回Max
        return max;
    }
}
