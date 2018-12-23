package Question5;

public class test
{
    public static void main(String[] args) {
        Student student=new Student("张三",0);
        ClassMan classMan=new ClassMan("李四");
        Goods book =new Goods("java开发指南",300);
        Store store=new Store();

        store.addgoods(book,5);  //商品入库
        classMan.addScore(classMan,student,500);    //添加积分
        System.out.println(student.getScore());     //查看积分变化
        store.buygoods(book,student,2);        //积分不够
        System.out.println(student.getScore());
        store.buygoods(book,student,1);     //购买成功
        System.out.println(student.getScore());
    }
}
