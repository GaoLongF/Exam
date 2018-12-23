package Question5;

public class ClassMan
{
    private  String name;

    public ClassMan(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addScore(ClassMan man,Student student,double score)
    {
        student.setScore(man,score);
        System.out.println(man.getName()+"为学员"+student.getName()+"添加了积分");
    }
}
