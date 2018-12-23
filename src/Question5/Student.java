package Question5;

public class Student
{
    private String name;
    private double score;

    //初始积分为0
    public Student(String name, double score) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    //改变积分只能由商店和学长执行
    public void setScore(ClassMan man,double score) {
        this.score += score;
    }

    public void setScore(Store store,double score)
    {
        this.score -=score;
    }

}
