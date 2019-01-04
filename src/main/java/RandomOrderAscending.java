import java.util.*;

public class RandomOrderAscending
{
    public static TreeSet<String> ascendingOrder(List<String> str)
    {
        TreeSet<String> treeset=new TreeSet<String>(str);
        Iterator<String> itr=treeset.iterator();
        itr.next();
        return treeset;
    }
    public  List<String> convertList(TreeSet<String> tset)
    {
        List<String> arraylist=new ArrayList<String>(tset);
        Iterator<String> itr=arraylist.iterator();
        return arraylist;
    }
}
