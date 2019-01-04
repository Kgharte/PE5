import java.util.Comparator;

public class SortStudent implements Comparator<Student>
{
    public int compare(Student st1,Student st2){
        int sortAge = st1.getAge().compareTo(st2.getAge());
        int sortName = st1.getName().compareTo(st2.getName());
        int sortId = st1.getId().compareTo(st2.getId());
        if(sortAge == 0) {
            return ((sortName == 0) ? sortId : sortName);

        }
        else {
            return sortAge;
        }
    }
}
