package my静态变量;

import java.util.ArrayList;

/*
      定义学生工具类
      需求：定义一个集合，用于存储3个学生对象
           学生类的属性为： name, age ,gender
           定义一个工具类，用于获取集合中最大学生的年龄；
 */
public class StudentTest {
    public static void main(String[] args) {
        //1.创建一个集合，用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //2.创建3个学生对象
        Student stu1 = new Student("y", 18, "女");
        Student stu2 = new Student("j", 17, "女");
        Student stu3 = new Student("w", 19, "男");

        //3.把学生对象添加到集合中

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4.调用工具类中的方法
        int number = StudentUtil.getMaxAgeStudent(list);
        System.out.println(number);
    }
}
