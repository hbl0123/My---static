package my静态变量;
//需求：写一个javaBean类来描述这个班级的学生
//     属性： 姓名、年龄、性别
//     行为： 学习
//     新增： 老师的姓名
public class test1 {
    private String name;
    private int age;
    private String sex;

    public static String teacherNAme;

    public test1() {
    }

    public test1(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    //行为
    public void study(){
        System.out.println(name + "正在学习");
    }

    public void show(){
        System.out.println(name + "," + age + "," + sex + "," + teacherNAme);
    }
}
