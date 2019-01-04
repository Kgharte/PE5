import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain
{
    public static void main(String arg[]){
        Student student1=new Student();
        student1.setId(11);
        student1.setName("james");
        student1.setAge(23);
        Student student2=new Student();
        student2.setId(12);
        student2.setName("jiya");
        student2.setAge(23);

        Student student3=new Student();
        student3.setId(13);
        student3.setName("james");
        student3.setAge(24);

        Student student4=new Student();
        student4.setId(14);
        student4.setName("james");
        student4.setAge(21);

       Student student5=new Student();
        student5.setId(15);
        student5.setName("james");
        student5.setAge(22);

        Student student6=new Student();
        student6.setId(16);
        student6.setName("james");
        student6.setAge(23);


        Student student7=new Student();
        student7.setId(17);
        student7.setName("james");
        student7.setAge(21);


        List<Student> studentList=new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        System.out.println("***********Before Sorting***********");

        for (Student studentList1:studentList
        ) {
            System.out.println(studentList1);
        }
        System.out.println("*************After Sorting***************");
        List<Student> studentList2=new TestMain().sortingStudent(studentList);
        for (Student studentList3:studentList
        ) {
            System.out.println(studentList3);
        }
    }
    public List<Student> sortingStudent(List<Student> sList){
        Collections.sort(sList, new SortStudent());
        Collections.reverse(sList);
        List<Student> stList=new ArrayList<>();
        for(Student student : sList) {
            stList.add(student);
        }
        return stList;
    }
}
