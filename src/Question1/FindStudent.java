package Question1;

import java.io.IOException;
import java.util.Scanner;

public class FindStudent
{
    public static void main(String[] args) {
        Student student[]=null;
        String id=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入查找学生的学号：");
        try {
            id=sc.nextLine();
            student =FileUtil.parseStudents("students.txt");
            for(int i=0;i<student.length;i++){
                if(student[i].getStuid().equals(id)){
                    System.out.println("查找信息为："+student[i].getName()+student[i].getStuid());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
