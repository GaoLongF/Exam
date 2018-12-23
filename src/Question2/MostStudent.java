package Question2;

import Question1.FileUtil;
import Question1.Student;

import java.io.IOException;
import java.util.*;


public class MostStudent
{
    public static void main(String[] args)
    {
        try {
                Student[] students= FileUtil.parseStudents("students.txt");

                HashMap<String,Integer> map=new HashMap<>();
                for(int i=0;i<students.length;i++){
                    if(map.containsKey(students[i].getName())){
                        int value=map.get(students[i].getName());
                        map.put(students[i].getName(),value+1);
                    }else{
                        map.put(students[i].getName(),1);
                    }
                }
            List<Map.Entry<String,Integer>> list=new ArrayList(map.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue()-o1.getValue();
                }
            });
            for(Map.Entry<String, Integer> mapping:list){
                System.out.println("姓名："+mapping.getKey()+" 出现次数："+mapping.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
