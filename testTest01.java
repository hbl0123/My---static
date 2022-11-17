package my静态变量;

public class testTest01 {
    public static void main(String[] args) {
        test1.teacherNAme = "吴老师";
        //1.创建第一个学生对象
        test1 q = new test1();
        q.setName("张三");
        q.setAge(18);
        q.setSex("男");
      //  q.teacherNAme = "吴老师";

        q.study();
        q.show();

        //2.创建第二个对象
        test1 j = new test1();
        j.setName("李四");
        j.setAge(78);
        j.setSex("男");
       // j.teacherNAme = "吴老师";

        j.study();
        j.show();

    }
}
